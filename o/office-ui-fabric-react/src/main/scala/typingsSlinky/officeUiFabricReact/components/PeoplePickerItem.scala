package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.anon.IPersonaPropsValidationSt
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PeoplePickerItem {
  @JSImport("office-ui-fabric-react", "PeoplePickerItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: IPeoplePickerItemSelectedProps): SharedBuilder_IPeoplePickerItemSelectedProps1663015275 = new SharedBuilder_IPeoplePickerItemSelectedProps1663015275(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(index: Double, item: IPersonaPropsValidationSt): SharedBuilder_IPeoplePickerItemSelectedProps1663015275 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    new SharedBuilder_IPeoplePickerItemSelectedProps1663015275(js.Array(this.component, __props.asInstanceOf[IPeoplePickerItemSelectedProps]))
  }
}

