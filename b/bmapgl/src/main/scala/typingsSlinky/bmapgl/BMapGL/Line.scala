package typingsSlinky.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends StObject {
  
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  
  def getGetOffStop(): LocalResultPoi = js.native
  
  def getGetOnStop(): LocalResultPoi = js.native
  
  def getNumViaStops(): Double = js.native
  
  def getPath(): js.Array[Point] = js.native
  
  def getPoints(): js.Array[Point] = js.native
  
  def getPolyline(): Polyline = js.native
  
  var title: String = js.native
  
  var `type`: LineType = js.native
}
