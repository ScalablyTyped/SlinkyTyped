package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.DisableDepthTestDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointGraphics")
@js.native
class PointGraphics () extends js.Object {
  def this(options: DisableDepthTestDistance) = this()
  
  def clone(result: PointGraphics): PointGraphics = js.native
  
  var color: Property = js.native
  
  val definitionChanged: Event[js.Array[_]] = js.native
  
  var disableDepthTestDistance: Property = js.native
  
  var distanceDisplayCondition: Property = js.native
  
  var heightReference: Property = js.native
  
  def merge(source: PointGraphics): PointGraphics = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var pixelSize: Property = js.native
  
  var scaleByDistance: Property = js.native
  
  var show: Property = js.native
  
  var translucencyByDistance: Property = js.native
}
