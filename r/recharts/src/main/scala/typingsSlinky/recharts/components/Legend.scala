package typingsSlinky.recharts.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.anon.PartialMargin
import typingsSlinky.recharts.anon.Width
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.IconType
import typingsSlinky.recharts.mod.LayoutType
import typingsSlinky.recharts.mod.LegendPayload
import typingsSlinky.recharts.mod.LegendProps
import typingsSlinky.recharts.rechartsStrings.bottom
import typingsSlinky.recharts.rechartsStrings.center
import typingsSlinky.recharts.rechartsStrings.left
import typingsSlinky.recharts.rechartsStrings.middle
import typingsSlinky.recharts.rechartsStrings.right
import typingsSlinky.recharts.rechartsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  @JSImport("recharts", "Legend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.Legend] {
    
    @scala.inline
    def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chartHeight(value: Double): this.type = set("chartHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chartWidth(value: Double): this.type = set("chartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement | ContentRenderer[LegendProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction1(value: LegendProps => ReactElement): this.type = set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(
      value: (/* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
        ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => js.Any
    ): this.type = set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconType(value: IconType): this.type = set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: LayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: PartialMargin): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBBoxUpdate(value: /* box */ Width => Unit): this.type = set("onBBoxUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* repeated */ js.Any => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: /* repeated */ js.Any => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* repeated */ js.Any => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def payload(value: js.Array[LegendPayload]): this.type = set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def payloadVarargs(value: LegendPayload*): this.type = set("payload", js.Array(value :_*))
    
    @scala.inline
    def verticalAlign(value: top | middle | bottom): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: js.Object): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Legend.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
