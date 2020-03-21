package typingsSlinky.imageminWebp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.imageminWebp.imageminWebpStrings.all
  - typingsSlinky.imageminWebp.imageminWebpStrings.none
  - typingsSlinky.imageminWebp.imageminWebpStrings.exif
  - typingsSlinky.imageminWebp.imageminWebpStrings.icc
  - typingsSlinky.imageminWebp.imageminWebpStrings.xmp
*/
trait Metadata extends js.Object

object Metadata {
  @scala.inline
  def all: typingsSlinky.imageminWebp.imageminWebpStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exif: typingsSlinky.imageminWebp.imageminWebpStrings.exif = this.cast("exif")
  @scala.inline
  def icc: typingsSlinky.imageminWebp.imageminWebpStrings.icc = this.cast("icc")
  @scala.inline
  def none: typingsSlinky.imageminWebp.imageminWebpStrings.none = this.cast("none")
  @scala.inline
  def xmp: typingsSlinky.imageminWebp.imageminWebpStrings.xmp = this.cast("xmp")
}

