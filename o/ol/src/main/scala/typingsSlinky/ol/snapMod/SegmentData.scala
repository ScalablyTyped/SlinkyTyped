package typingsSlinky.ol.snapMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentData extends js.Object {
  
  var feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  var segment: js.Array[Coordinate] = js.native
}
object SegmentData {
  
  @scala.inline
  def apply(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    segment: js.Array[Coordinate]
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
  
  @scala.inline
  implicit class SegmentDataOps[Self <: SegmentData] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentVarargs(value: Coordinate*): Self = this.set("segment", js.Array(value :_*))
    
    @scala.inline
    def setSegment(value: js.Array[Coordinate]): Self = this.set("segment", value.asInstanceOf[js.Any])
  }
}
