package typingsSlinky.protractor.protractorMod

import typingsSlinky.protractor.builtLocatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typingsSlinky.protractor.builtElementMod.ElementFinder {
  def this(
    browser_ : typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    elementArrayFinder: typingsSlinky.protractor.builtElementMod.ElementArrayFinder
  ) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
  ): typingsSlinky.protractor.builtElementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement,
    locator: Locator
  ): typingsSlinky.protractor.builtElementMod.ElementFinder = js.native
}

