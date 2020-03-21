package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.StaticGray
  - typingsSlinky.gm.gmStrings.GrayScale
  - typingsSlinky.gm.gmStrings.StaticColor
  - typingsSlinky.gm.gmStrings.PseudoColor
  - typingsSlinky.gm.gmStrings.TrueColor
  - typingsSlinky.gm.gmStrings.DirectColor
  - typingsSlinky.gm.gmStrings.default
*/
trait VisualType extends js.Object

object VisualType {
  @scala.inline
  def DirectColor: typingsSlinky.gm.gmStrings.DirectColor = this.cast("DirectColor")
  @scala.inline
  def GrayScale: typingsSlinky.gm.gmStrings.GrayScale = this.cast("GrayScale")
  @scala.inline
  def PseudoColor: typingsSlinky.gm.gmStrings.PseudoColor = this.cast("PseudoColor")
  @scala.inline
  def StaticColor: typingsSlinky.gm.gmStrings.StaticColor = this.cast("StaticColor")
  @scala.inline
  def StaticGray: typingsSlinky.gm.gmStrings.StaticGray = this.cast("StaticGray")
  @scala.inline
  def TrueColor: typingsSlinky.gm.gmStrings.TrueColor = this.cast("TrueColor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.gm.gmStrings.default = this.cast("default")
}

