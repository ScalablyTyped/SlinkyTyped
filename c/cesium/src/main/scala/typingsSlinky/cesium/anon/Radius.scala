package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radius extends js.Object {
  
  var radius: js.UndefOr[Double] = js.native
  
  var slicePartitions: js.UndefOr[Double] = js.native
  
  var stackPartitions: js.UndefOr[Double] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object Radius {
  
  @scala.inline
  def apply(): Radius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit class RadiusOps[Self <: Radius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSlicePartitions(value: Double): Self = this.set("slicePartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicePartitions: Self = this.set("slicePartitions", js.undefined)
    
    @scala.inline
    def setStackPartitions(value: Double): Self = this.set("stackPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPartitions: Self = this.set("stackPartitions", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
}
