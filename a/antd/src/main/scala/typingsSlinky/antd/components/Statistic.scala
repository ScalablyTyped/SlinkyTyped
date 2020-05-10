package typingsSlinky.antd.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.statisticStatisticMod.StatisticProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Statistic {
  @JSImport("antd/lib/statistic", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def contextTypes(value: ValidationMap[_]): this.type = set("contextTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultProps(value: Partial[StatisticProps]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
    @scala.inline
    def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def propTypes(value: WeakValidationMap[StatisticProps]): this.type = set("propTypes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactComponentClass[StatisticProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Statistic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

