package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gdal.gdalStrings.NEAREST
  - typingsSlinky.gdal.gdalStrings.GAUSS
  - typingsSlinky.gdal.gdalStrings.CUBIC
  - typingsSlinky.gdal.gdalStrings.AVERAGE
  - typingsSlinky.gdal.gdalStrings.MODE
  - typingsSlinky.gdal.gdalStrings.AVERAGE_MAGPHASE
  - typingsSlinky.gdal.gdalStrings.NONE
*/
trait Resampling extends js.Object

object Resampling {
  @scala.inline
  def AVERAGE: typingsSlinky.gdal.gdalStrings.AVERAGE = this.cast("AVERAGE")
  @scala.inline
  def AVERAGE_MAGPHASE: typingsSlinky.gdal.gdalStrings.AVERAGE_MAGPHASE = this.cast("AVERAGE_MAGPHASE")
  @scala.inline
  def CUBIC: typingsSlinky.gdal.gdalStrings.CUBIC = this.cast("CUBIC")
  @scala.inline
  def GAUSS: typingsSlinky.gdal.gdalStrings.GAUSS = this.cast("GAUSS")
  @scala.inline
  def MODE: typingsSlinky.gdal.gdalStrings.MODE = this.cast("MODE")
  @scala.inline
  def NEAREST: typingsSlinky.gdal.gdalStrings.NEAREST = this.cast("NEAREST")
  @scala.inline
  def NONE: typingsSlinky.gdal.gdalStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

