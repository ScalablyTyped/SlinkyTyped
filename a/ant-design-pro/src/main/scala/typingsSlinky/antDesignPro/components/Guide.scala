package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.antvG2.mod.Styles.text
import typingsSlinky.bizcharts.anon.AutoRotate
import typingsSlinky.bizcharts.bizchartsStrings.downward
import typingsSlinky.bizcharts.bizchartsStrings.upward
import typingsSlinky.bizcharts.mod.AlignXType
import typingsSlinky.bizcharts.mod.AlignYType
import typingsSlinky.bizcharts.mod.Guide.ArcProps
import typingsSlinky.bizcharts.mod.Guide.DataMarkerProps
import typingsSlinky.bizcharts.mod.Guide.DataRegionProps
import typingsSlinky.bizcharts.mod.Guide.HtmlProps
import typingsSlinky.bizcharts.mod.Guide.ImageProps
import typingsSlinky.bizcharts.mod.Guide.LineProps
import typingsSlinky.bizcharts.mod.Guide.RegionFilterProps
import typingsSlinky.bizcharts.mod.Guide.RegionProps
import typingsSlinky.bizcharts.mod.Guide.TextProps
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Guide {
  
  object Arc {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Arc")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Arc] {
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Arc.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ArcProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DataMarker {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.DataMarker")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.DataMarker] {
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: upward | downward): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def display(value: js.Object): this.type = set("display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lineLength(value: Double): this.type = set("lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
      
      @scala.inline
      def positionVarargs(value: js.Any*): this.type = set("position", js.Array(value :_*))
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: DataMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DataMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DataRegion {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.DataRegion")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.DataRegion] {
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: upward | downward): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def display(value: js.Object): this.type = set("display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def lineLength(value: Double): this.type = set("lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def regionStyle(value: js.Object): this.type = set("regionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: DataRegion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DataRegionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Html {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Html")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Html] {
      
      @scala.inline
      def alignX(value: AlignXType): this.type = set("alignX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def alignY(value: AlignYType): this.type = set("alignY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def html(value: String): this.type = set("html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
      
      @scala.inline
      def positionVarargs(value: js.Any*): this.type = set("position", js.Array(value :_*))
      
      @scala.inline
      def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Html.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HtmlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Image")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Image] {
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Image.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Line {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Line")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Line] {
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def lineStyle(value: line): this.type = set("lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def text(value: AutoRotate): this.type = set("text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Line.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Region {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Region")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Region] {
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def style(value: background): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Region.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RegionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RegionFilter {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.RegionFilter")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.RegionFilter] {
      
      @scala.inline
      def apply(value: js.Array[_]): this.type = set("apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def applyVarargs(value: js.Any*): this.type = set("apply", js.Array(value :_*))
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def end(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
      
      @scala.inline
      def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
      
      @scala.inline
      def start(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
      
      @scala.inline
      def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: RegionFilter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RegionFilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Text")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide.Text] {
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): this.type = set("position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
      
      @scala.inline
      def positionVarargs(value: js.Any*): this.type = set("position", js.Array(value :_*))
      
      @scala.inline
      def style(value: text): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Guide.type): Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide] = new Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props[js.Any]): Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide] = new Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide](js.Array(this.component, p.asInstanceOf[js.Any]))
}
