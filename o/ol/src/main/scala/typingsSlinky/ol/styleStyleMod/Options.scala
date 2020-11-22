package typingsSlinky.ol.styleStyleMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.renderMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var fill: js.UndefOr[typingsSlinky.ol.fillMod.default] = js.native
  
  var geometry: js.UndefOr[String | typingsSlinky.ol.geometryMod.default | GeometryFunction] = js.native
  
  var image: js.UndefOr[typingsSlinky.ol.styleImageMod.default] = js.native
  
  var renderer: js.UndefOr[RenderFunction] = js.native
  
  var stroke: js.UndefOr[typingsSlinky.ol.strokeMod.default] = js.native
  
  var text: js.UndefOr[typingsSlinky.ol.textMod.default] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
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
    def setFill(value: typingsSlinky.ol.fillMod.default): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGeometryFunction1(
      value: /* p0 */ FeatureLike => js.UndefOr[typingsSlinky.ol.geometryMod.default | typingsSlinky.ol.renderFeatureMod.default]
    ): Self = this.set("geometry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeometry(value: String | typingsSlinky.ol.geometryMod.default | GeometryFunction): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setImage(value: typingsSlinky.ol.styleImageMod.default): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Unit
    ): Self = this.set("renderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setStroke(value: typingsSlinky.ol.strokeMod.default): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setText(value: typingsSlinky.ol.textMod.default): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
