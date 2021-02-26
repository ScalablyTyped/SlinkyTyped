package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends CanvasSourceRaw
     with AnySourceImpl {
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}
