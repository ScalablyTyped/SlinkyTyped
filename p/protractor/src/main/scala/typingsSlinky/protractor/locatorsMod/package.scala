package typingsSlinky.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object locatorsMod {
  type Locator = typingsSlinky.protractor.locatorsMod.ProtractorLocator | typingsSlinky.protractor.locatorsMod.WebDriverLocator
  type WebDriverLocator = typingsSlinky.seleniumWebdriver.mod.By | typingsSlinky.seleniumWebdriver.byMod.ByHash | js.Function
}
