package typingsSlinky.protractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends typingsSlinky.seleniumWebdriver.mod.WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(
    driver: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    el: js.Promise[typingsSlinky.seleniumWebdriver.mod.WebElement]
  ) = this()
}

