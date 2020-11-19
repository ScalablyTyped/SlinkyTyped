package typingsSlinky.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  
  var item: UserType = js.native
  
  var list: ListNames = js.native
}
object Item {
  
  @scala.inline
  def apply[UserType /* <: js.Object */, ListNames /* <: String */](item: UserType, list: ListNames): Item[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[UserType, ListNames]]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item[_, _], UserType /* <: js.Object */, ListNames /* <: String */] (val x: Self with (Item[UserType, ListNames])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: UserType): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ListNames): Self = this.set("list", value.asInstanceOf[js.Any])
  }
}
