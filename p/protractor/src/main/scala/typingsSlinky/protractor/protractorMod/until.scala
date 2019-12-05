package typingsSlinky.protractor.protractorMod

import typingsSlinky.seleniumDashWebdriver.libByMod.ByHash
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Alert
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Condition
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "until")
@js.native
object until extends js.Object {
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver, 
      typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
    ]
  ): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): Condition[Boolean] = js.native
  def alertIsPresent(): Condition[Alert] = js.native
  def elementIsDisabled(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsEnabled(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsNotSelected(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsNotVisible(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsSelected(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsVisible(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  def elementTextContains(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, substr: String): WebElementCondition = js.native
  def elementTextIs(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, text: String): WebElementCondition = js.native
  def elementTextMatches(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, regex: js.RegExp): WebElementCondition = js.native
  def elementsLocated(locator: Locator): Condition[
    js.Array[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
  ] = js.native
  def stalenessOf(element: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): Condition[Boolean] = js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}

