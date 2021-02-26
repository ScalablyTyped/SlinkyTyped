package typingsSlinky.protractor.mod

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import typingsSlinky.seleniumWebdriver.mod.Alert
import typingsSlinky.seleniumWebdriver.mod.By
import typingsSlinky.seleniumWebdriver.mod.Condition
import typingsSlinky.seleniumWebdriver.mod.Locator
import typingsSlinky.seleniumWebdriver.mod.WebElementCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object until {
  
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typingsSlinky.seleniumWebdriver.mod.WebDriver, 
      typingsSlinky.seleniumWebdriver.mod.WebElement
    ]
  ): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: typingsSlinky.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.alertIsPresent")
  @js.native
  def alertIsPresent(): Condition[Alert] = js.native
  
  @JSImport("protractor", "until.elementIsDisabled")
  @js.native
  def elementIsDisabled(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsEnabled")
  @js.native
  def elementIsEnabled(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsNotSelected")
  @js.native
  def elementIsNotSelected(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsNotVisible")
  @js.native
  def elementIsNotVisible(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsSelected")
  @js.native
  def elementIsSelected(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsVisible")
  @js.native
  def elementIsVisible(element: typingsSlinky.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementLocated")
  @js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextContains")
  @js.native
  def elementTextContains(element: typingsSlinky.seleniumWebdriver.mod.WebElement, substr: String): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextIs")
  @js.native
  def elementTextIs(element: typingsSlinky.seleniumWebdriver.mod.WebElement, text: String): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextMatches")
  @js.native
  def elementTextMatches(element: typingsSlinky.seleniumWebdriver.mod.WebElement, regex: js.RegExp): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementsLocated")
  @js.native
  def elementsLocated(locator: Locator): Condition[js.Array[typingsSlinky.seleniumWebdriver.mod.WebElement]] = js.native
  
  @JSImport("protractor", "until.stalenessOf")
  @js.native
  def stalenessOf(element: typingsSlinky.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleContains")
  @js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleIs")
  @js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleMatches")
  @js.native
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlContains")
  @js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlIs")
  @js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlMatches")
  @js.native
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}
