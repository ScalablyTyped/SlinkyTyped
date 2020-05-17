package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.cypress.JQuery
import typingsSlinky.cypress.Mocha.IRunnable
import typingsSlinky.cypress.Mocha.ITest
import typingsSlinky.cypress.cypressBooleans.`false`
import typingsSlinky.cypress.cypressStrings.commandColonend
import typingsSlinky.cypress.cypressStrings.commandColonenqueued
import typingsSlinky.cypress.cypressStrings.commandColonretry
import typingsSlinky.cypress.cypressStrings.commandColonstart
import typingsSlinky.cypress.cypressStrings.fail
import typingsSlinky.cypress.cypressStrings.logColonadded
import typingsSlinky.cypress.cypressStrings.logColonchanged
import typingsSlinky.cypress.cypressStrings.scrolled
import typingsSlinky.cypress.cypressStrings.testColonafterColonrun
import typingsSlinky.cypress.cypressStrings.testColonbeforeColonrun
import typingsSlinky.cypress.cypressStrings.uncaughtColonexception
import typingsSlinky.cypress.cypressStrings.urlColonchanged
import typingsSlinky.cypress.cypressStrings.viewportColonchanged
import typingsSlinky.cypress.cypressStrings.windowColonalert
import typingsSlinky.cypress.cypressStrings.windowColonbeforeColonload
import typingsSlinky.cypress.cypressStrings.windowColonbeforeColonunload
import typingsSlinky.cypress.cypressStrings.windowColonconfirm
import typingsSlinky.cypress.cypressStrings.windowColonload
import typingsSlinky.cypress.cypressStrings.windowColonunload
import typingsSlinky.cypress.sinonMod.SinonSpy
import typingsSlinky.cypress.sinonMod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// for just a few events like "window:alert" it makes sense to allow passing cy.stub() or
// a user callback function. Others probably only need a callback function.
/**
  * These events come from the application currently under test (your application).
  * These are the most useful events for you to listen to.
  * @see https://on.cypress.io/catalog-of-events#App-Events
  */
@js.native
trait Actions extends js.Object {
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonenqueued, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonretry, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonstart, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: fail, fn: js.Function2[/* error */ js.Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: logColonadded, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: logColonchanged, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: testColonafterColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: testColonbeforeColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]
  ): Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  def apply(
    action: uncaughtColonexception,
    fn: js.Function2[/* error */ js.Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: urlColonchanged, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: viewportColonchanged, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonalert, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  def apply(action: windowColonalert, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonbeforeColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonbeforeColonunload, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  def apply(action: windowColonconfirm, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  def apply(action: windowColonconfirm, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonload, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonunload, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

