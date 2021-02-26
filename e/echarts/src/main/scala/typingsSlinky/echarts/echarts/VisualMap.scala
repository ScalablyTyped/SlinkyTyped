package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.anon.InRange
import typingsSlinky.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typingsSlinky.echarts.echarts.EChartOption.TextStyle
import typingsSlinky.echarts.echartsStrings.auto
import typingsSlinky.echarts.echartsStrings.bottom
import typingsSlinky.echarts.echartsStrings.continuous
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.left
import typingsSlinky.echarts.echartsStrings.multiple
import typingsSlinky.echarts.echartsStrings.piecewise
import typingsSlinky.echarts.echartsStrings.right
import typingsSlinky.echarts.echartsStrings.single
import typingsSlinky.echarts.echartsStrings.top
import typingsSlinky.echarts.echartsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualMap {
  
  @js.native
  trait Continuous
    extends typingsSlinky.echarts.echarts.EChartOption.VisualMap {
    
    var align: js.UndefOr[auto | left | right | top | bottom] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var borderWidth: js.UndefOr[Double] = js.native
    
    var bottom: js.UndefOr[Double | String] = js.native
    
    var calculable: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[js.Array[String]] = js.native
    
    var controller: js.UndefOr[InRange] = js.native
    
    var dimension: js.UndefOr[String | Double] = js.native
    
    var formatter: js.UndefOr[String | js.Function] = js.native
    
    var hoverLink: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inRange: js.UndefOr[RangeObject] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double | String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var orient: js.UndefOr[vertical | horizontal] = js.native
    
    var outOfRange: js.UndefOr[RangeObject] = js.native
    
    var padding: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var range: js.UndefOr[js.Array[Double]] = js.native
    
    var realtime: js.UndefOr[Boolean] = js.native
    
    var right: js.UndefOr[Double | String] = js.native
    
    var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[js.Array[String]] = js.native
    
    var textGap: js.UndefOr[Double] = js.native
    
    var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.native
    
    var top: js.UndefOr[Double | String] = js.native
    
    var `type`: js.UndefOr[continuous] = js.native
    
    var z: js.UndefOr[Double] = js.native
    
    var zlevel: js.UndefOr[Double] = js.native
  }
  object Continuous {
    
    @scala.inline
    def apply(): Continuous = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Continuous]
    }
    
    @scala.inline
    implicit class ContinuousMutableBuilder[Self <: Continuous] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: auto | left | right | top | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCalculable(value: Boolean): Self = StObject.set(x, "calculable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculableUndefined: Self = StObject.set(x, "calculable", js.undefined)
      
      @scala.inline
      def setColor(value: js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setController(value: InRange): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setDimension(value: String | Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      @scala.inline
      def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setHoverLink(value: Boolean): Self = StObject.set(x, "hoverLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverLinkUndefined: Self = StObject.set(x, "hoverLink", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInRange(value: RangeObject): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOrient(value: vertical | horizontal): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOutOfRange(value: RangeObject): Self = StObject.set(x, "outOfRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOfRangeUndefined: Self = StObject.set(x, "outOfRange", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      @scala.inline
      def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
      
      @scala.inline
      def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setSeriesIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
      
      @scala.inline
      def setSeriesIndexVarargs(value: Double*): Self = StObject.set(x, "seriesIndex", js.Array(value :_*))
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextGap(value: Double): Self = StObject.set(x, "textGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextGapUndefined: Self = StObject.set(x, "textGap", js.undefined)
      
      @scala.inline
      def setTextStyle(value: BaseTextStyleWithRich): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: continuous): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
    }
  }
  
  @js.native
  trait PiecesObject extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object PiecesObject {
    
    @scala.inline
    def apply(): PiecesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PiecesObject]
    }
    
    @scala.inline
    implicit class PiecesObjectMutableBuilder[Self <: PiecesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Piecewise
    extends typingsSlinky.echarts.echarts.EChartOption.VisualMap {
    
    var align: js.UndefOr[auto | left | right] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var borderWidth: js.UndefOr[Double] = js.native
    
    var bottom: js.UndefOr[Double | String] = js.native
    
    var categories: js.UndefOr[js.Array[String]] = js.native
    
    var color: js.UndefOr[js.Array[String]] = js.native
    
    var controller: js.UndefOr[InRange] = js.native
    
    var dimension: js.UndefOr[String | Double] = js.native
    
    var formatter: js.UndefOr[String | js.Function] = js.native
    
    var hoverLink: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inRange: js.UndefOr[RangeObject] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var itemGap: js.UndefOr[Double] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemSymbol: js.UndefOr[String] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double | String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxOpen: js.UndefOr[Boolean] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var minOpen: js.UndefOr[Boolean] = js.native
    
    var orient: js.UndefOr[vertical | horizontal] = js.native
    
    var outOfRange: js.UndefOr[RangeObject] = js.native
    
    var padding: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var pieces: js.UndefOr[js.Array[PiecesObject]] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double | String] = js.native
    
    var selectedMode: js.UndefOr[multiple | single] = js.native
    
    var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var showLabel: js.UndefOr[Boolean] = js.native
    
    var splitNumber: js.UndefOr[Double] = js.native
    
    var text: js.UndefOr[js.Array[String]] = js.native
    
    var textGap: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var top: js.UndefOr[Double | String] = js.native
    
    var `type`: js.UndefOr[piecewise] = js.native
    
    var z: js.UndefOr[Double] = js.native
    
    var zlevel: js.UndefOr[Double] = js.native
  }
  object Piecewise {
    
    @scala.inline
    def apply(): Piecewise = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Piecewise]
    }
    
    @scala.inline
    implicit class PiecewiseMutableBuilder[Self <: Piecewise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: auto | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setController(value: InRange): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setDimension(value: String | Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      @scala.inline
      def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setHoverLink(value: Boolean): Self = StObject.set(x, "hoverLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverLinkUndefined: Self = StObject.set(x, "hoverLink", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInRange(value: RangeObject): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemSymbol(value: String): Self = StObject.set(x, "itemSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSymbolUndefined: Self = StObject.set(x, "itemSymbol", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOpen(value: Boolean): Self = StObject.set(x, "maxOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOpenUndefined: Self = StObject.set(x, "maxOpen", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOpen(value: Boolean): Self = StObject.set(x, "minOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOpenUndefined: Self = StObject.set(x, "minOpen", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOrient(value: vertical | horizontal): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOutOfRange(value: RangeObject): Self = StObject.set(x, "outOfRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOfRangeUndefined: Self = StObject.set(x, "outOfRange", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPieces(value: js.Array[PiecesObject]): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      @scala.inline
      def setPiecesVarargs(value: PiecesObject*): Self = StObject.set(x, "pieces", js.Array(value :_*))
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setSelectedMode(value: multiple | single): Self = StObject.set(x, "selectedMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedModeUndefined: Self = StObject.set(x, "selectedMode", js.undefined)
      
      @scala.inline
      def setSeriesIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
      
      @scala.inline
      def setSeriesIndexVarargs(value: Double*): Self = StObject.set(x, "seriesIndex", js.Array(value :_*))
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSplitNumber(value: Double): Self = StObject.set(x, "splitNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitNumberUndefined: Self = StObject.set(x, "splitNumber", js.undefined)
      
      @scala.inline
      def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextGap(value: Double | js.Array[Double]): Self = StObject.set(x, "textGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextGapUndefined: Self = StObject.set(x, "textGap", js.undefined)
      
      @scala.inline
      def setTextGapVarargs(value: Double*): Self = StObject.set(x, "textGap", js.Array(value :_*))
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: piecewise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
    }
  }
  
  @js.native
  trait RangeObject extends StObject {
    
    var color: js.UndefOr[String | js.Array[String]] = js.native
    
    var colorAlpha: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var colorHue: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var colorLightness: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var colorSaturation: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var symbol: js.UndefOr[String | js.Array[String]] = js.native
    
    var symbolSize: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object RangeObject {
    
    @scala.inline
    def apply(): RangeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeObject]
    }
    
    @scala.inline
    implicit class RangeObjectMutableBuilder[Self <: RangeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorAlpha(value: Double | js.Array[Double]): Self = StObject.set(x, "colorAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorAlphaUndefined: Self = StObject.set(x, "colorAlpha", js.undefined)
      
      @scala.inline
      def setColorAlphaVarargs(value: Double*): Self = StObject.set(x, "colorAlpha", js.Array(value :_*))
      
      @scala.inline
      def setColorHue(value: Double | js.Array[Double]): Self = StObject.set(x, "colorHue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorHueUndefined: Self = StObject.set(x, "colorHue", js.undefined)
      
      @scala.inline
      def setColorHueVarargs(value: Double*): Self = StObject.set(x, "colorHue", js.Array(value :_*))
      
      @scala.inline
      def setColorLightness(value: Double | js.Array[Double]): Self = StObject.set(x, "colorLightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLightnessUndefined: Self = StObject.set(x, "colorLightness", js.undefined)
      
      @scala.inline
      def setColorLightnessVarargs(value: Double*): Self = StObject.set(x, "colorLightness", js.Array(value :_*))
      
      @scala.inline
      def setColorSaturation(value: Double | js.Array[Double]): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
      
      @scala.inline
      def setColorSaturationVarargs(value: Double*): Self = StObject.set(x, "colorSaturation", js.Array(value :_*))
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setSymbol(value: String | js.Array[String]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSize(value: Double | js.Array[Double]): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      @scala.inline
      def setSymbolSizeVarargs(value: Double*): Self = StObject.set(x, "symbolSize", js.Array(value :_*))
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setSymbolVarargs(value: String*): Self = StObject.set(x, "symbol", js.Array(value :_*))
    }
  }
}
