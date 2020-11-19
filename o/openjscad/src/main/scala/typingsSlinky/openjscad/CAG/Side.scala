package typingsSlinky.openjscad.CAG

import typingsSlinky.openjscad.CSG.Polygon
import typingsSlinky.openjscad.CSG.Vector2D
import typingsSlinky.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Side extends CxG {
  
  def direction(): Vector2D = js.native
  
  def flipped(): Side = js.native
  
  def getTag(): Double = js.native
  
  def length(): Double = js.native
  
  def lengthSquared(): Double = js.native
  
  var tag: Double = js.native
  
  def toPolygon3D(z0: js.Any, z1: js.Any): Polygon = js.native
  
  var vertex0: Vertex = js.native
  
  var vertex1: Vertex = js.native
}
