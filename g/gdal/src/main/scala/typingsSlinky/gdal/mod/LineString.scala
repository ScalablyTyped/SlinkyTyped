package typingsSlinky.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "LineString")
@js.native
class LineString () extends Geometry {
  
  def addSubLineString(line: LineString): Unit = js.native
  def addSubLineString(line: LineString, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def addSubLineString(line: LineString, start: Double): Unit = js.native
  def addSubLineString(line: LineString, start: Double, end: Double): Unit = js.native
  
  def getLength(): Double = js.native
  
  val points: LineStringPoints = js.native
  
  def value(distance: Double): Point = js.native
}
