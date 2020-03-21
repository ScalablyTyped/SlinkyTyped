package typingsSlinky.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.escPosEncoder.escPosEncoderStrings.threshold
  - typingsSlinky.escPosEncoder.escPosEncoderStrings.bayer
  - typingsSlinky.escPosEncoder.escPosEncoderStrings.floydsteinberg
  - typingsSlinky.escPosEncoder.escPosEncoderStrings.atkinson
*/
trait imgAlgType extends js.Object

object imgAlgType {
  @scala.inline
  def atkinson: typingsSlinky.escPosEncoder.escPosEncoderStrings.atkinson = this.cast("atkinson")
  @scala.inline
  def bayer: typingsSlinky.escPosEncoder.escPosEncoderStrings.bayer = this.cast("bayer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def floydsteinberg: typingsSlinky.escPosEncoder.escPosEncoderStrings.floydsteinberg = this.cast("floydsteinberg")
  @scala.inline
  def threshold: typingsSlinky.escPosEncoder.escPosEncoderStrings.threshold = this.cast("threshold")
}

