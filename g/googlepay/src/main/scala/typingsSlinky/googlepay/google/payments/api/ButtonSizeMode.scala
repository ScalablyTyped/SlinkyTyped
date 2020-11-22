package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported methods for controlling the size of the Google Pay button.
  *
  * Options:
  *
  * - `static`:
  *   Default behavior. The button has a fixed width and height.
  *
  * - `fill`:
  *   The button fills its container.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.static
  - typingsSlinky.googlepay.googlepayStrings.fill
*/
trait ButtonSizeMode extends js.Object
object ButtonSizeMode {
  
  @scala.inline
  def fill: typingsSlinky.googlepay.googlepayStrings.fill = "fill".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.fill]
  
  @scala.inline
  def static: typingsSlinky.googlepay.googlepayStrings.static = "static".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.static]
}
