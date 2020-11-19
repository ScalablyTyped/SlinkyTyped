package typingsSlinky.nivoGeo.components

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoGeo.anon.FeatureChoroplethBoundFeature
import typingsSlinky.nivoGeo.anon.PartialBox
import typingsSlinky.nivoGeo.anon.PartialTheme
import typingsSlinky.nivoGeo.mod.ChoroplethBoundFeature
import typingsSlinky.nivoGeo.mod.ChoroplethProps
import typingsSlinky.nivoGeo.mod.DatumMatcher
import typingsSlinky.nivoGeo.mod.FeatureAccessor
import typingsSlinky.nivoGeo.mod.GeoProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Choropleth {
  
  @JSImport("@nivo/geo", "Choropleth")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoGeo.mod.Choropleth] {
    
    @scala.inline
    def borderColorFunction1(value: ChoroplethBoundFeature => Double): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, Double])): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidthFunction1(value: ChoroplethBoundFeature => Double): this.type = set("borderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderWidth(value: Double | (FeatureAccessor[ChoroplethBoundFeature, Double])): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def colors(value: String | js.Array[String] | (FeatureAccessor[_, String])): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableGraticule(value: Boolean): this.type = set("enableGraticule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillColorFunction1(value: ChoroplethBoundFeature => String): this.type = set("fillColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def fillColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, String])): this.type = set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def graticuleLineColor(value: String): this.type = set("graticuleLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def graticuleLineWidth(value: Double): this.type = set("graticuleLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFunction1(value: _ => String): this.type = set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def label(value: String | (FeatureAccessor[_, String])): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: PartialBox): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def matchFunction1(value: /* repeated */ js.Any => Boolean): this.type = set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def `match`(value: String | DatumMatcher): this.type = set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseLeave(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseMove(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onMouseMove", js.Any.fromFunction2(value))
    
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
    def tooltip(value: ReactComponentClass[FeatureChoroplethBoundFeature]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unknownColor(value: String): this.type = set("unknownColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueFunction1(value: _ => Double): this.type = set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: String | (FeatureAccessor[_, Double])): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueFormatFunction1(value: _ => String | Double): this.type = set("valueFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def valueFormat(value: String | (FeatureAccessor[_, String | Double])): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChoroplethProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[_], domain: js.Array[Double], features: js.Array[_], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChoroplethProps with Dimensions]))
  }
}
