package typingsSlinky.hapiBell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiBell.mod.CustomProviderOptions
  - typingsSlinky.hapiBell.mod.KnownProviderOptions
*/
trait BellOptions extends js.Object

object BellOptions {
  @scala.inline
  implicit def apply(value: CustomProviderOptions): BellOptions = value.asInstanceOf[BellOptions]
  @scala.inline
  implicit def apply(value: KnownProviderOptions): BellOptions = value.asInstanceOf[BellOptions]
}

