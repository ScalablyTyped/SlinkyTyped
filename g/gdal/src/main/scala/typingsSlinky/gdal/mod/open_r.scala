package typingsSlinky.gdal.mod

import typingsSlinky.gdal.gdalStrings.r
import typingsSlinky.gdal.gdalStrings.rPlussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "open")
@js.native
object open_r extends js.Object {
  
  def apply(path: String, mode: r): Dataset = js.native
  def apply(path: String, mode: rPlussign): Dataset = js.native
  def apply(path: String, mode: rPlussign, drivers: String): Dataset = js.native
  def apply(path: String, mode: rPlussign, drivers: js.Array[String]): Dataset = js.native
  def apply(path: String, mode: r, drivers: String): Dataset = js.native
  def apply(path: String, mode: r, drivers: js.Array[String]): Dataset = js.native
}
