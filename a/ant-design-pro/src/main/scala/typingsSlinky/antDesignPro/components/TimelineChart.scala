package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Y1
import typingsSlinky.antDesignPro.anon.Y2
import typingsSlinky.antDesignPro.timelineChartMod.ITimelineChartProps
import typingsSlinky.antDesignPro.timelineChartMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineChart {
  @JSImport("ant-design-pro/lib/Charts/TimelineChart", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITimelineChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[Y1], titleMap: Y2): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITimelineChartProps]))
  }
}

