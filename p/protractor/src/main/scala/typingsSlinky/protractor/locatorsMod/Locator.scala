package typingsSlinky.protractor.locatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.protractor.locatorsMod.ProtractorLocator
  - typingsSlinky.protractor.locatorsMod.WebDriverLocator
*/
trait Locator extends js.Object

object Locator {
  @scala.inline
  implicit def apply(value: ProtractorLocator): Locator = value.asInstanceOf[Locator]
  @scala.inline
  implicit def apply(value: WebDriverLocator): Locator = value.asInstanceOf[Locator]
}

