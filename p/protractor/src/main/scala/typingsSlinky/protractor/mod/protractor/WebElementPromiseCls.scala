package typingsSlinky.protractor.mod.protractor

import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.mod.WebElement
import typingsSlinky.seleniumWebdriver.mod.WebElementPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "protractor.WebElementPromise")
@js.native
class WebElementPromiseCls protected () extends WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
}
