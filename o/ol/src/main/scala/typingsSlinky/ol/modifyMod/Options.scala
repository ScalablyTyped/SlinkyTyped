package typingsSlinky.ol.modifyMod

import typingsSlinky.ol.conditionMod.Condition
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.styleStyleMod.Style
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var condition: js.UndefOr[Condition] = js.native
  
  var deleteCondition: js.UndefOr[Condition] = js.native
  
  var features: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
  ] = js.native
  
  var insertVertexCondition: js.UndefOr[Condition] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  var style: js.UndefOr[StyleLike] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDeleteCondition(value: Condition): Self = this.set("deleteCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteCondition: Self = this.set("deleteCondition", js.undefined)
    
    @scala.inline
    def setFeatures(
      value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
    ): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setInsertVertexCondition(value: Condition): Self = this.set("insertVertexCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertVertexCondition: Self = this.set("insertVertexCondition", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = this.set("pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelTolerance: Self = this.set("pixelTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = this.set("style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleLike): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
