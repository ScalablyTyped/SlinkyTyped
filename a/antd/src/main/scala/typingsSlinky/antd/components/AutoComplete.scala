package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.autoCompleteMod.AutoCompleteProps
import typingsSlinky.antd.autoCompleteMod.DataSourceItemType
import typingsSlinky.antd.selectMod.SelectValue
import typingsSlinky.antd.selectMod.default
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  @JSImport("antd/lib/auto-complete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[SelectValue]] {
    @scala.inline
    def dataSourceVarargs(value: DataSourceItemType*): this.type = set("dataSource", js.Array(value :_*))
    @scala.inline
    def dataSource(value: js.Array[DataSourceItemType]): this.type = set("dataSource", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteProps with RefAttributes[default[SelectValue]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AutoComplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

