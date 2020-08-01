package typingsSlinky.rcFieldForm.components

import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.listMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("rc-field-form/es/List", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ListProps): SharedBuilder_ListProps425441958 = new SharedBuilder_ListProps425441958(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: NamePath): SharedBuilder_ListProps425441958 = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_ListProps425441958(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
}

