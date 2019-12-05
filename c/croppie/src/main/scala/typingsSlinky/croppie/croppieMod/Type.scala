package typingsSlinky.croppie.croppieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.croppie.croppieStrings.canvas
  - typings.croppie.croppieStrings.base64
  - typings.croppie.croppieStrings.html
  - typings.croppie.croppieStrings.blob
  - typings.croppie.croppieStrings.rawcanvas
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def base64: typingsSlinky.croppie.croppieStrings.base64 = this.cast("base64")
  @scala.inline
  def blob: typingsSlinky.croppie.croppieStrings.blob = this.cast("blob")
  @scala.inline
  def canvas: typingsSlinky.croppie.croppieStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typingsSlinky.croppie.croppieStrings.html = this.cast("html")
  @scala.inline
  def rawcanvas: typingsSlinky.croppie.croppieStrings.rawcanvas = this.cast("rawcanvas")
}

