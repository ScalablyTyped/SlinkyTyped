package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.X
import typingsSlinky.antDesignPro.pieMod.IPieProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pie {
  
  @scala.inline
  def apply(height: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPieProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "Pie")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.Pie] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[X]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: X*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def hasLegend(value: Boolean): this.type = set("hasLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def total(value: ReactElement | Double | (js.Function0[ReactElement | Double])): this.type = set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalFunction0(value: () => ReactElement | Double): this.type = set("total", js.Any.fromFunction0(value))
    
    @scala.inline
    def totalReactElement(value: ReactElement): this.type = set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueFormat(value: /* value */ String => String | ReactElement): this.type = set("valueFormat", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IPieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
