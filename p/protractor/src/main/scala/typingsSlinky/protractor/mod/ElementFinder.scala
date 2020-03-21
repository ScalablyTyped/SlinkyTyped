package typingsSlinky.protractor.mod

import typingsSlinky.protractor.locatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typingsSlinky.protractor.elementMod.ElementFinder {
  def this(
    browser_ : typingsSlinky.protractor.browserMod.ProtractorBrowser,
    elementArrayFinder: typingsSlinky.protractor.elementMod.ElementArrayFinder
  ) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: typingsSlinky.protractor.browserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumWebdriver.mod.WebElement
  ): typingsSlinky.protractor.elementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: typingsSlinky.protractor.browserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typingsSlinky.protractor.elementMod.ElementFinder = js.native
}

