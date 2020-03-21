package typingsSlinky.reactImgpro.mod.ReactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactImgpro.reactImgproStrings.neighbor
  - typingsSlinky.reactImgpro.reactImgproStrings.bilinear
  - typingsSlinky.reactImgpro.reactImgproStrings.bicubic
  - typingsSlinky.reactImgpro.reactImgproStrings.hermite
  - typingsSlinky.reactImgpro.reactImgproStrings.bezier
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def bezier: typingsSlinky.reactImgpro.reactImgproStrings.bezier = this.cast("bezier")
  @scala.inline
  def bicubic: typingsSlinky.reactImgpro.reactImgproStrings.bicubic = this.cast("bicubic")
  @scala.inline
  def bilinear: typingsSlinky.reactImgpro.reactImgproStrings.bilinear = this.cast("bilinear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hermite: typingsSlinky.reactImgpro.reactImgproStrings.hermite = this.cast("hermite")
  @scala.inline
  def neighbor: typingsSlinky.reactImgpro.reactImgproStrings.neighbor = this.cast("neighbor")
}

