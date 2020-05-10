package typingsSlinky.highchartsReactOfficial.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.highcharts.mod.Chart_
import typingsSlinky.highcharts.mod.Options
import typingsSlinky.highchartsReactOfficial.TypeofHighcharts
import typingsSlinky.highchartsReactOfficial.mod.HighchartsReact.Props
import typingsSlinky.highchartsReactOfficial.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighchartsReactOfficial {
  @JSImport("highcharts-react-official", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowChartUpdate(value: Boolean): this.type = set("allowChartUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def callback(value: /* chart */ Chart_ => Unit): this.type = set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def constructorType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78 */ js.Any): this.type = set("constructorType", value.asInstanceOf[js.Any])
    @scala.inline
    def highcharts(value: TypeofHighcharts): this.type = set("highcharts", value.asInstanceOf[js.Any])
    @scala.inline
    def immutable(value: Boolean): this.type = set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def updateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): this.type = set("updateArgs", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HighchartsReactOfficial.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

