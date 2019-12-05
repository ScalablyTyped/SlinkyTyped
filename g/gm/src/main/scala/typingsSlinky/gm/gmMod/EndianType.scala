package typingsSlinky.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.MSB
  - typings.gm.gmStrings.LSB
  - typings.gm.gmStrings.Native
*/
trait EndianType extends js.Object

object EndianType {
  @scala.inline
  def LSB: typingsSlinky.gm.gmStrings.LSB = this.cast("LSB")
  @scala.inline
  def MSB: typingsSlinky.gm.gmStrings.MSB = this.cast("MSB")
  @scala.inline
  def Native: typingsSlinky.gm.gmStrings.Native = this.cast("Native")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

