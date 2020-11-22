package typingsSlinky.reactVis.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVis.mod.AbstractSeriesProps
import typingsSlinky.reactVis.mod.AnimationParam
import typingsSlinky.reactVis.mod.MarkSeriesPoint
import typingsSlinky.reactVis.mod.RVNearestXData
import typingsSlinky.reactVis.mod.RVNearestXYData
import typingsSlinky.reactVis.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkSeriesCanvas {
  
  @JSImport("react-vis", "MarkSeriesCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVis.mod.MarkSeriesCanvas] {
    
    @scala.inline
    def _colorValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any): this.type = set("_colorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def _opacityValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
    ): this.type = set("_opacityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def _sizeValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any): this.type = set("_sizeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def _xValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any): this.type = set("_xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def _yValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any): this.type = set("_yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: String | AnimationParam | Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String | Double): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any): this.type = set("colorBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorDistance(value: Double): this.type = set("colorDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): this.type = set("colorDomain", js.Array(value :_*))
    
    @scala.inline
    def colorDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): this.type = set("colorDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): this.type = set("colorRange", js.Array(value :_*))
    
    @scala.inline
    def colorRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): this.type = set("colorRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorType(value: Scale): this.type = set("colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: (MarkSeriesPoint | js.Array[js.Any])*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[MarkSeriesPoint | js.Array[_]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String | Double): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getColor(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def getColor0(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getColor0", js.Any.fromFunction1(value))
    
    @scala.inline
    def getOpacity(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def getOpacity0(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getOpacity0", js.Any.fromFunction1(value))
    
    @scala.inline
    def getSize(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def getSize0(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getSize0", js.Any.fromFunction1(value))
    
    @scala.inline
    def getX(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getX", js.Any.fromFunction1(value))
    
    @scala.inline
    def getX0(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getX0", js.Any.fromFunction1(value))
    
    @scala.inline
    def getY(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getY", js.Any.fromFunction1(value))
    
    @scala.inline
    def getY0(
      value: MarkSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getY0", js.Any.fromFunction1(value))
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onNearestX(value: (MarkSeriesPoint, /* data */ RVNearestXData[MarkSeriesPoint]) => Unit): this.type = set("onNearestX", js.Any.fromFunction2(value))
    
    @scala.inline
    def onNearestXY(value: (MarkSeriesPoint, /* data */ RVNearestXYData[MarkSeriesPoint]) => Unit): this.type = set("onNearestXY", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSeriesClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onSeriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeriesMouseOut(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onSeriesMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeriesMouseOver(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onSeriesMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeriesRightClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onSeriesRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueClick(value: (MarkSeriesPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onValueClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onValueMouseOut(value: (MarkSeriesPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onValueMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def onValueMouseOver(value: (MarkSeriesPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onValueMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def onValueRightClick(value: (MarkSeriesPoint, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onValueRightClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any): this.type = set("opacityBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityDistance(value: Double): this.type = set("opacityDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): this.type = set("opacityDomain", js.Array(value :_*))
    
    @scala.inline
    def opacityDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): this.type = set("opacityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): this.type = set("opacityRange", js.Array(value :_*))
    
    @scala.inline
    def opacityRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): this.type = set("opacityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityType(value: Scale): this.type = set("opacityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any): this.type = set("sizeBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeDistance(value: Double): this.type = set("sizeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): this.type = set("sizeDomain", js.Array(value :_*))
    
    @scala.inline
    def sizeDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): this.type = set("sizeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): this.type = set("sizeRange", js.Array(value :_*))
    
    @scala.inline
    def sizeRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): this.type = set("sizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeType(value: Scale): this.type = set("sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stack(value: Boolean): this.type = set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String | Double): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): this.type = set("xBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xDistance(value: Double): this.type = set("xDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): this.type = set("xDomain", js.Array(value :_*))
    
    @scala.inline
    def xDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): this.type = set("xDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): this.type = set("xRange", js.Array(value :_*))
    
    @scala.inline
    def xRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): this.type = set("xRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xType(value: Scale): this.type = set("xType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): this.type = set("yBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yDistance(value: Double): this.type = set("yDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): this.type = set("yDomain", js.Array(value :_*))
    
    @scala.inline
    def yDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): this.type = set("yDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): this.type = set("yRange", js.Array(value :_*))
    
    @scala.inline
    def yRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): this.type = set("yRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yType(value: Scale): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AbstractSeriesProps[MarkSeriesPoint]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MarkSeriesCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
