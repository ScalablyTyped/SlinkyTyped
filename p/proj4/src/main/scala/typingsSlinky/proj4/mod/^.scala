package typingsSlinky.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proj4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(fromProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String): Converter = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
  def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
}
