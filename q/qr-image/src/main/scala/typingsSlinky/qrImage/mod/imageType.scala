package typingsSlinky.qrImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qrImage.qrImageStrings.png
  - typingsSlinky.qrImage.qrImageStrings.svg
  - typingsSlinky.qrImage.qrImageStrings.pdf
  - typingsSlinky.qrImage.qrImageStrings.eps
*/
trait imageType extends js.Object

object imageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eps: typingsSlinky.qrImage.qrImageStrings.eps = this.cast("eps")
  @scala.inline
  def pdf: typingsSlinky.qrImage.qrImageStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typingsSlinky.qrImage.qrImageStrings.png = this.cast("png")
  @scala.inline
  def svg: typingsSlinky.qrImage.qrImageStrings.svg = this.cast("svg")
}

