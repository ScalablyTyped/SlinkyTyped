package typingsSlinky.protractor.protractorMod.protractor

import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

