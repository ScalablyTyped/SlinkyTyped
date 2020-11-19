package typingsSlinky.protractor.mod

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import typingsSlinky.seleniumWebdriver.mod.Alert
import typingsSlinky.seleniumWebdriver.mod.By
import typingsSlinky.seleniumWebdriver.mod.Condition
import typingsSlinky.seleniumWebdriver.mod.Locator
import typingsSlinky.seleniumWebdriver.mod.WebElementCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "until")
@js.native
object until extends js.Object {
  
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typingsSlinky.seleniumWebdriver.mod.WebDriver, 
      typingsSlinky.seleniumWebdriver.mod.WebElement
    ]
  ): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typingsSlinky.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  def alertIsPresent(): Condition[Alert] = js.native
  
  def elementIsDisabled(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementIsEnabled(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementIsNotSelected(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementIsNotVisible(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementIsSelected(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementIsVisible(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  def elementLocated(locator: Locator): WebElementCondition = js.native
  
  def elementTextContains(element: typingsSlinky.seleniumWebdriver.mod.WebElement, substr: String): WebElementCondition = js.native
  
  def elementTextIs(element: typingsSlinky.seleniumWebdriver.mod.WebElement, text: String): WebElementCondition = js.native
  
  def elementTextMatches(element: typingsSlinky.seleniumWebdriver.mod.WebElement, regex: js.RegExp): WebElementCondition = js.native
  
  def elementsLocated(locator: Locator): Condition[js.Array[typingsSlinky.seleniumWebdriver.mod.WebElement]] = js.native
  
  def stalenessOf(element: typingsSlinky.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  def titleContains(substr: String): Condition[Boolean] = js.native
  
  def titleIs(title: String): Condition[Boolean] = js.native
  
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  
  def urlIs(url: String): Condition[Boolean] = js.native
  
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}
