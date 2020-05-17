package typingsSlinky.alexaSdk.mod

import typingsSlinky.alexaSdk.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObject extends js.Object {
  /**
    * Items that belong to this list.
    */
  var items: js.Array[ListItemObject] = js.native
  /**
    * list id (String)
    */
  var listId: String = js.native
  /**
    * list name (String)
    */
  var name: String = js.native
  var next: js.UndefOr[ListLinks] = js.native
  /**
    * state
    * "active" or "archived" (Enum)
    */
  var state: js.UndefOr[ListObjectState] = js.native
  /**
    * Possibly status of the list (or state?)
    * Fetched from commit eebba0d at https://github.com/alexa/alexa-skills-kit-sdk-for-nodejs/
    * File path: alexa-skills-kit-sdk-for-nodejs/lib/services/listManagementService.js
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Urls to active and completed items
    * href is lint to the items having certain status.
    * The status can be "active" or "completed".
    */
  var statusMap: Href = js.native
  /**
    * list version (Positive integer)
    */
  var version: js.UndefOr[Double] = js.native
}

object ListObject {
  @scala.inline
  def apply(items: js.Array[ListItemObject], listId: String, name: String, statusMap: Href): ListObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusMap = statusMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObject]
  }
  @scala.inline
  implicit class ListObjectOps[Self <: ListObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ListItemObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMap(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: ListLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ListObjectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

