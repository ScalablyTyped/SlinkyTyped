package typingsSlinky.reactVis.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVis.anon.Angle
import typingsSlinky.reactVis.reactVisStrings.angle
import typingsSlinky.reactVis.reactVisStrings.angle0
import typingsSlinky.reactVis.reactVisStrings.label
import typingsSlinky.reactVis.reactVisStrings.radius
import typingsSlinky.reactVis.reactVisStrings.radius0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialChartProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  // default: ''
  var colorType: js.UndefOr[String] = js.native
  
  // default: 'category'
  var data: js.Array[Angle] = js.native
  
  var getAngle: js.UndefOr[RVGet[RadialChartPoint, angle]] = js.native
  
  var getAngle0: js.UndefOr[RVGet[RadialChartPoint, angle0]] = js.native
  
  var getLabel: js.UndefOr[RVGet[RadialChartPoint, label]] = js.native
  
  var getRadius: js.UndefOr[RVGet[RadialChartPoint, radius]] = js.native
  
  var getRadius0: js.UndefOr[RVGet[RadialChartPoint, radius0]] = js.native
  
  var height: Double = js.native
  
  var labelsAboveChildren: js.UndefOr[Boolean] = js.native
  
  var labelsStyle: js.UndefOr[CSSProperties] = js.native
  
  var margin: js.UndefOr[Margin | Double] = js.native
  
  var onValueClick: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[RadialChartPoint]] = js.native
  
  var showLabels: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subLabel: js.UndefOr[js.Function1[/* row */ js.Any, String]] = js.native
  
  var width: Double = js.native
}
object RadialChartProps {
  
  @scala.inline
  def apply(data: js.Array[Angle], height: Double, width: Double): RadialChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartProps]
  }
  
  @scala.inline
  implicit class RadialChartPropsMutableBuilder[Self <: RadialChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Angle]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Angle*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGetAngle(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAngle0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAngle0Undefined: Self = StObject.set(x, "getAngle0", js.undefined)
    
    @scala.inline
    def setGetAngleUndefined: Self = StObject.set(x, "getAngle", js.undefined)
    
    @scala.inline
    def setGetLabel(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    @scala.inline
    def setGetRadius(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRadius0(
      value: RadialChartPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRadius0Undefined: Self = StObject.set(x, "getRadius0", js.undefined)
    
    @scala.inline
    def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsAboveChildren(value: Boolean): Self = StObject.set(x, "labelsAboveChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsAboveChildrenUndefined: Self = StObject.set(x, "labelsAboveChildren", js.undefined)
    
    @scala.inline
    def setLabelsStyle(value: CSSProperties): Self = StObject.set(x, "labelsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsStyleUndefined: Self = StObject.set(x, "labelsStyle", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOnValueClick(value: (RadialChartPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    @scala.inline
    def setOnValueMouseOut(value: (RadialChartPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    @scala.inline
    def setOnValueMouseOver(value: (RadialChartPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubLabel(value: /* row */ js.Any => String): Self = StObject.set(x, "subLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
