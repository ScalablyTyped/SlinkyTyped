package typingsSlinky.rcFieldForm.components

import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.listMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @scala.inline
  def apply(name: NamePath): SharedBuilder_ListProps425441958 = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_ListProps425441958(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
  
  @JSImport("rc-field-form", "List")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ListProps): SharedBuilder_ListProps425441958 = new SharedBuilder_ListProps425441958(js.Array(this.component, p.asInstanceOf[js.Any]))
}
