package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported colors for the Google Pay button.
  *
  * Options:
  *
  * - `default`:
  *   A Google-selected default value. Currently black but it may change
  *   over time.
  *
  * - `black`:
  *   A black button suitable for use on white or light backgrounds.
  *
  * - `white`:
  *   A white button suitable for use on colorful backgrounds.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.default_
  - typingsSlinky.googlepay.googlepayStrings.black
  - typingsSlinky.googlepay.googlepayStrings.white
*/
trait ButtonColor extends js.Object
object ButtonColor {
  
  @scala.inline
  def black: typingsSlinky.googlepay.googlepayStrings.black = "black".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.black]
  
  @scala.inline
  def default: default_ = "default".asInstanceOf[default_]
  
  @scala.inline
  def white: typingsSlinky.googlepay.googlepayStrings.white = "white".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.white]
}
