package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Y1
import typingsSlinky.antDesignPro.anon.Y2
import typingsSlinky.antDesignPro.timelineChartMod.ITimelineChartProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineChart {
  
  @scala.inline
  def apply(data: js.Array[Y1], titleMap: Y2): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITimelineChartProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "TimelineChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.TimelineChart] {
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITimelineChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
