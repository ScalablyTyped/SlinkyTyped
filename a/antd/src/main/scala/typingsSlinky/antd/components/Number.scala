package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.numberMod.NumberProps
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.Formatter
import typingsSlinky.antd.statisticUtilsMod.valueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Number {
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def formatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => TagMod[Any]): this.type = set("formatter", js.Any.fromFunction2(value))
    @scala.inline
    def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: valueType): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NumberProps]))
  }
}

