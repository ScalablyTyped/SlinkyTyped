package typingsSlinky.protractor.mod

import typingsSlinky.protractor.locatorsMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ElementFinder {
  
  @JSImport("protractor", "ElementFinder.fromWebElement_")
  @js.native
  def fromWebElement_(
    browser: typingsSlinky.protractor.browserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumWebdriver.mod.WebElement
  ): typingsSlinky.protractor.elementMod.ElementFinder = js.native
  @JSImport("protractor", "ElementFinder.fromWebElement_")
  @js.native
  def fromWebElement_(
    browser: typingsSlinky.protractor.browserMod.ProtractorBrowser,
    webElem: typingsSlinky.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typingsSlinky.protractor.elementMod.ElementFinder = js.native
}
