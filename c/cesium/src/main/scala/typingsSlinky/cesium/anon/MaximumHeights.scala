package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumHeights extends js.Object {
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var maximumHeights: js.UndefOr[js.Array[Double]] = js.native
  
  var minimumHeights: js.UndefOr[js.Array[Double]] = js.native
  
  var positions: js.Array[Cartesian3] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object MaximumHeights {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): MaximumHeights = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumHeights]
  }
  
  @scala.inline
  implicit class MaximumHeightsOps[Self <: MaximumHeights] (val x: Self) extends AnyVal {
    
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
    def setPositionsVarargs(value: Cartesian3*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setMaximumHeightsVarargs(value: Double*): Self = this.set("maximumHeights", js.Array(value :_*))
    
    @scala.inline
    def setMaximumHeights(value: js.Array[Double]): Self = this.set("maximumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumHeights: Self = this.set("maximumHeights", js.undefined)
    
    @scala.inline
    def setMinimumHeightsVarargs(value: Double*): Self = this.set("minimumHeights", js.Array(value :_*))
    
    @scala.inline
    def setMinimumHeights(value: js.Array[Double]): Self = this.set("minimumHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumHeights: Self = this.set("minimumHeights", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
}
