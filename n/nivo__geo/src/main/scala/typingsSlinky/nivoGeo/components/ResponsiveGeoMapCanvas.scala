package typingsSlinky.nivoGeo.components

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoGeo.anon.Feature
import typingsSlinky.nivoGeo.anon.PartialBox
import typingsSlinky.nivoGeo.anon.PartialTheme
import typingsSlinky.nivoGeo.mod.FeatureAccessor
import typingsSlinky.nivoGeo.mod.GeoMapCanvasProps
import typingsSlinky.nivoGeo.mod.GeoProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveGeoMapCanvas {
  
  @JSImport("@nivo/geo", "ResponsiveGeoMapCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoGeo.mod.ResponsiveGeoMapCanvas] {
    
    @scala.inline
    def borderColorFunction1(value: _ => Double): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderColor(value: String | (FeatureAccessor[_, Double])): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidthFunction1(value: _ => Double): this.type = set("borderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderWidth(value: Double | (FeatureAccessor[_, Double])): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableGraticule(value: Boolean): this.type = set("enableGraticule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillColorFunction1(value: _ => String): this.type = set("fillColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def fillColor(value: String | (FeatureAccessor[_, String])): this.type = set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def graticuleLineColor(value: String): this.type = set("graticuleLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def graticuleLineWidth(value: Double): this.type = set("graticuleLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: PartialBox): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseLeave(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseMove(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def projectionRotation(value: js.Tuple3[Double, Double, Double]): this.type = set("projectionRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def projectionScale(value: Double): this.type = set("projectionScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def projectionTranslation(value: js.Tuple2[Double, Double]): this.type = set("projectionTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def projectionType(value: GeoProjectionType): this.type = set("projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: ReactComponentClass[Feature]): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GeoMapCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(features: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GeoMapCanvasProps]))
  }
}
