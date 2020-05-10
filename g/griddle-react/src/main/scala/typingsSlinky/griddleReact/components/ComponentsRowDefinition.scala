package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.RowDefinition
import typingsSlinky.griddleReact.mod.components.RowDefinitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsRowDefinition {
  @JSImport("griddle-react", "components.RowDefinition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RowDefinition] {
    @scala.inline
    def childColumnName(value: String): this.type = set("childColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def cssClassNameFunction1(value: /* props */ js.Any => String): this.type = set("cssClassName", js.Any.fromFunction1(value))
    @scala.inline
    def cssClassName(value: String | (js.Function1[/* props */ js.Any, String])): this.type = set("cssClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def rowKey(value: String): this.type = set("rowKey", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RowDefinitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ComponentsRowDefinition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

