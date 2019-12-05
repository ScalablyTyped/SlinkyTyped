package typingsSlinky.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object builtLocatorsMod {
  import typingsSlinky.seleniumDashWebdriver.libByMod.ByHash
  import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.By

  type Locator = ProtractorLocator | WebDriverLocator
  type WebDriverLocator = By | ByHash | js.Function
}
