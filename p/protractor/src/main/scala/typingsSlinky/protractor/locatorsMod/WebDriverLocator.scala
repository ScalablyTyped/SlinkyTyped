package typingsSlinky.protractor.locatorsMod

import typingsSlinky.seleniumWebdriver.byMod.ByHash
import typingsSlinky.seleniumWebdriver.mod.By
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seleniumWebdriver.mod.By
  - typingsSlinky.seleniumWebdriver.byMod.ByHash
  - js.Function
*/
trait WebDriverLocator extends Locator

object WebDriverLocator {
  @scala.inline
  implicit def apply(value: By): WebDriverLocator = value.asInstanceOf[WebDriverLocator]
  @scala.inline
  implicit def apply(value: ByHash): WebDriverLocator = value.asInstanceOf[WebDriverLocator]
  @scala.inline
  implicit def apply(value: js.Function): WebDriverLocator = value.asInstanceOf[WebDriverLocator]
}

