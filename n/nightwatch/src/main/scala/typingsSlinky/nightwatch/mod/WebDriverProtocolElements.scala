package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElements extends StObject {
  
  /**
    * Search for an element on the page, starting from the document root. The located element will be returned as a web element JSON object.
    * First argument to be passed is the locator strategy, which is detailed on the [WebDriver docs](https://www.w3.org/TR/webdriver/#locator-strategies).
    *
    * The locator stragy can be one of:
    * - `css selector`
    * - `link text`
    * - `partial link text`
    * - `tag name`
    * - `xpath`
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.element('css selector', 'body', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.element('css selector', 'body');
    *     console.log('result value is:', result.value);
    *   }
    * }
    */
  def element(
    using: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ELEMENT], Unit]
  ): this.type = js.native
  
  /**
    * Get the element on the page that currently has focus. The element will be returned as a [Web Element](https://www.w3.org/TR/webdriver1/#dfn-web-elements) JSON object.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementActive(function(result) {
    *       console.log(result.value)
    *     });
    *   }
    * }
    */
  def elementActive(): this.type = js.native
  def elementActive(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ELEMENT], Unit]
  ): this.type = js.native
  
  /**
    * Search for an element on the page, starting from the identified element. The located element will be returned as a Web Element JSON object.
    *
    * This command operates on a protocol level and requires a [Web Element ID](https://www.w3.org/TR/webdriver1/#dfn-web-elements).
    * Read more on [Element retrieval](https://www.w3.org/TR/webdriver1/#element-retrieval) on the W3C WebDriver spec page.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementIdElement('<WebElementId>', 'css selector', '.new-element', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.elementIdElement('<WebElementId>', 'css selector', '.new-element');
    *     console.log(result.value);
    *   }
    * }
    */
  def elementIdElement(id: String, using: LocateStrategy, value: String): this.type = js.native
  def elementIdElement(
    id: String,
    using: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ELEMENT], Unit]
  ): this.type = js.native
  
  /**
    * Search for multiple elements on the page, starting from the identified element. The located element will be returned as a web element JSON objects.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementIdElements('<WebElementId>', 'css selector', 'ul li', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.elementIdElements('<WebElementId>', 'css selector', 'ul li');
    *     console.log(result.value);
    *   }
    * }
    */
  def elementIdElements(id: String, using: LocateStrategy, value: String): this.type = js.native
  def elementIdElements(
    id: String,
    using: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ELEMENT]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Test if two web element IDs refer to the same DOM element.
    *
    * This command is __deprecated__ and is only available on the [JSON Wire protocol](https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidequalsother)
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementIdEquals('<ID-1>', '<ID-2>', function(result) {
    *       console.log(result.value)
    *     });
    *   }
    * }
    */
  def elementIdEquals(id: String, otherId: String): this.type = js.native
  def elementIdEquals(
    id: String,
    otherId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  
  /**
    * Search for multiple elements on the page, starting from the document root. The located elements will be returned as web element JSON objects.
    * First argument to be passed is the locator strategy, which is detailed on the [WebDriver docs](https://www.w3.org/TR/webdriver/#locator-strategies).
    *
    * * The locator strategy can be one of:
    * - `css selector`
    * - `link text`
    * - `partial link text`
    * - `tag name`
    * - `xpath`
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elements('css selector', 'ul li', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.elements('css selector', 'ul li');
    *     console.log('result value is:', result.value);
    *   },
    *
    *   'page object demo Test': function (browser) {
    *      var nightwatch = browser.page.nightwatch();
    *      nightwatch
    *        .navigate()
    *        .assert.titleContains('Nightwatch.js');
    *
    *      nightwatch.api.elements('@featuresList', function(result) {
    *        console.log(result);
    *      });
    *
    *      browser.end();
    *   }
    * }
    */
  def elements(
    using: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ELEMENT]], 
      Unit
    ]
  ): this.type = js.native
}
