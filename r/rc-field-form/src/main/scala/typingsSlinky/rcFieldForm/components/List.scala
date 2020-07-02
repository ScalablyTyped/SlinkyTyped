package typingsSlinky.rcFieldForm.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.listMod.ListField
import typingsSlinky.rcFieldForm.listMod.ListOperations
import typingsSlinky.rcFieldForm.listMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("rc-field-form/es/List", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def children(value: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => ReactElement): this.type = set("children", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: NamePath): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
}

