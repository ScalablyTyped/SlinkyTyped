package typingsSlinky.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(
    driver: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    el: js.Promise[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
  ) = this()
}

