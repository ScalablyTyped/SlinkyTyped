package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.Absolute
  - typingsSlinky.gm.gmStrings.Perceptual
  - typingsSlinky.gm.gmStrings.Relative
  - typingsSlinky.gm.gmStrings.Saturation
*/
trait IntentType extends js.Object

object IntentType {
  @scala.inline
  def Absolute: typingsSlinky.gm.gmStrings.Absolute = this.cast("Absolute")
  @scala.inline
  def Perceptual: typingsSlinky.gm.gmStrings.Perceptual = this.cast("Perceptual")
  @scala.inline
  def Relative: typingsSlinky.gm.gmStrings.Relative = this.cast("Relative")
  @scala.inline
  def Saturation: typingsSlinky.gm.gmStrings.Saturation = this.cast("Saturation")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

