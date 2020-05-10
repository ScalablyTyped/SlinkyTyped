package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventBody extends js.Object {
  var listId: String = js.native
  var listItemIds: js.UndefOr[js.Array[String]] = js.native
}

object ListEventBody {
  @scala.inline
  def apply(listId: String): ListEventBody = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventBody]
  }
  @scala.inline
  implicit class ListEventBodyOps[Self <: ListEventBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemIds")(js.undefined)
        ret
    }
  }
  
}

