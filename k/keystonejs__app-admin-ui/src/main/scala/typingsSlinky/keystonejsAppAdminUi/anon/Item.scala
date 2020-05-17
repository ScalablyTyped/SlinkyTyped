package typingsSlinky.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var item: UserType = js.native
  var list: ListNames = js.native
}

object Item {
  @scala.inline
  def apply[UserType, ListNames](item: UserType, list: ListNames): Item[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[UserType, ListNames]]
  }
  @scala.inline
  implicit class ItemOps[Self[usertype, listnames] <: Item[usertype, listnames], UserType, ListNames] (val x: Self[UserType, ListNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[UserType, ListNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[UserType, ListNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[UserType, ListNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[UserType, ListNames]) with Other]
    @scala.inline
    def withItem(value: UserType): Self[UserType, ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ListNames): Self[UserType, ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

