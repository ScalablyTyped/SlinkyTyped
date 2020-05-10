package typingsSlinky.protractor.pluginsMod

import typingsSlinky.protractor.AnonSpecName
import typingsSlinky.protractor.AnonSpecNameString
import typingsSlinky.protractor.browserMod.ProtractorBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtractorPlugin extends js.Object {
  /**
    * Adds a failed assertion to the test's results.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {string} message The error message for the failed assertion
    * @param {specName: string, stackTrace: string} options Some optional extra
    *     information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *       - stackTrace The stack trace for the failure.  Defaults to undefined.
    *     Defaults to `{}`.
    *
    * @throws {Error} Throws an error if called after results have been reported
    */
  var addFailure: js.UndefOr[
    js.Function2[/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecName], Unit]
  ] = js.native
  /**
    * Adds a passed assertion to the test's results.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {specName: string} options Extra information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *     Defaults to `{}`.
    *
    * @throws {Error} Throws an error if called after results have been reported
    */
  var addSuccess: js.UndefOr[js.Function1[/* info */ js.UndefOr[AnonSpecNameString], Unit]] = js.native
  /**
    * Warns the user that something is problematic.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {string} message The message to warn the user about
    * @param {specName: string} options Extra information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *     Defaults to `{}`.
    */
  var addWarning: js.UndefOr[
    js.Function2[/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecNameString], Unit]
  ] = js.native
  /**
    * The plugin's configuration object.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * Note: that this is not the entire Protractor config object, just the entry
    * in the `plugins` array for this plugin.
    *
    * @type {Object}
    */
  var config: js.UndefOr[PluginConfig] = js.native
  /**
    * The name of the plugin.  Used when reporting results.
    *
    * If you do not specify this property, it will be filled in with something
    * reasonable (e.g. the plugin's path) by Protractor at runtime.
    *
    * @type {string}
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This is called inside browser.get() directly after the page loads, and before
    * angular bootstraps.
    *
    * @param {ProtractorBrowser} browser The browser instance which is loading a page.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing.  If
    *     the promise is rejected, a failed assertion is added to the test results.
    */
  var onPageLoad: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, Unit | js.Promise[Unit]]] = js.native
  /**
    * This is called inside browser.get() directly after angular is done
    * bootstrapping/synchronizing.  If `browser.ignoreSynchronization` is `true`,
    * this will not be called.
    *
    * @param {ProtractorBrowser} browser The browser instance which is loading a page.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing.  If
    *     the promise is rejected, a failed assertion is added to the test results.
    */
  var onPageStable: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, Unit | js.Promise[Unit]]] = js.native
  /**
    * This is called before the test have been run but after the test framework has
    * been set up.  Analogous to a config file's `onPrepare`.
    *
    * Very similar to using `setup`, but allows you to access framework-specific
    * variables/functions (e.g. `jasmine.getEnv().addReporter()`).
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var onPrepare: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  /**
    * Called after the test results have been finalized and any jobs have been
    * updated (if applicable).
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, it is outputted to the console.
    *     It is too late to add a failed assertion to the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, an error is logged to the console.
    */
  var postResults: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  /**
    * Called after each test block (in Jasmine, this means an `it` block)
    * completes.
    *
    * @param {boolean} passed True if the test passed.
    * @param {Object} testInfo information about the test which just ran.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before outputting test results.  Protractor
    *     will *not* wait before executing the next test; however, if the promise
    *     is rejected, a failed assertion is added to the test results.
    */
  var postTest: js.UndefOr[
    js.Function2[/* passed */ Boolean, /* testInfo */ js.Any, Unit | js.Promise[Unit]]
  ] = js.native
  /**
    * Sets up plugins before tests are run. This is called after the WebDriver
    * session has been started, but before the test framework has been set up.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var setup: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  /**
    * Used to turn off default checks for angular stability
    *
    * Normally Protractor waits for all $timeout and $http calls to be processed
    * before executing the next command.  This can be disabled using
    * browser.ignoreSynchronization, but that will also disable any
    * <Plugin>.waitForPromise or <Plugin>.waitForCondition checks.  If you want
    * to disable synchronization with angular, but leave intact any custom plugin
    * synchronization, this is the option for you.
    *
    * This is used by plugin authors who want to replace Protractor's
    * synchronization code with their own.
    *
    * @type {boolean}
    */
  var skipAngularStability: js.UndefOr[Boolean] = js.native
  /**
    * This is called after the tests have been run, but before the WebDriver
    * session has been terminated.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  /**
    * Between every webdriver action, Protractor calls browser.waitForAngular() to
    * make sure that Angular has no outstanding $http or $timeout calls.
    * You can use waitForCondition() to have Protractor additionally wait for your
    * custom condition to be truthy.  If specified, this function will be called
    * repeatedly until truthy.
    *
    * @param {ProtractorBrowser} browser The browser instance which needs invoked `waitForAngular`.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise<boolean>|boolean} If truthy, Protractor
    *     will continue onto the next command. If falsy, webdriver will
    *     continuously re-run this function until it is truthy.  If a rejected promise
    *     is returned, a failed assertion is added to the test results, and Protractor
    *     will continue onto the next command.
    */
  var waitForCondition: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, js.Promise[Boolean] | Boolean]] = js.native
  /**
    * Between every webdriver action, Protractor calls browser.waitForAngular() to
    * make sure that Angular has no outstanding $http or $timeout calls.
    * You can use waitForPromise() to have Protractor additionally wait for your
    * custom promise to be resolved inside of browser.waitForAngular().
    *
    * @param {ProtractorBrowser} browser The browser instance which needs invoked `waitForAngular`.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing. If the
    *     promise is rejected, a failed assertion is added to the test results, and
    *     protractor will continue onto the next command. If nothing is returned or
    *     something other than a promise is returned, protractor will continue
    *     onto the next command.
    */
  var waitForPromise: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, js.Promise[Unit]]] = js.native
}

object ProtractorPlugin {
  @scala.inline
  def apply(): ProtractorPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtractorPlugin]
  }
  @scala.inline
  implicit class ProtractorPluginOps[Self <: ProtractorPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFailure(value: (/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecName]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSuccess(value: /* info */ js.UndefOr[AnonSpecNameString] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAddWarning(value: (/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecNameString]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWarning")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: PluginConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageLoad(value: /* browser */ ProtractorBrowser => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageStable(value: /* browser */ ProtractorBrowser => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageStable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageStable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageStable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrepare(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.undefined)
        ret
    }
    @scala.inline
    def withPostResults(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPostResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPostTest(value: (/* passed */ Boolean, /* testInfo */ js.Any) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTest")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAngularStability(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAngularStability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAngularStability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAngularStability")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardown(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForCondition(value: /* browser */ ProtractorBrowser => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWaitForCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForPromise(value: /* browser */ ProtractorBrowser => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForPromise")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWaitForPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForPromise")(js.undefined)
        ret
    }
  }
  
}

