package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupObjectsRequest extends js.Object {
  var childrenObjectIds: js.UndefOr[js.Array[String]] = js.native
  var groupObjectId: js.UndefOr[String] = js.native
}

object GroupObjectsRequest {
  @scala.inline
  def apply(): GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupObjectsRequest]
  }
  @scala.inline
  implicit class GroupObjectsRequestOps[Self <: GroupObjectsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenObjectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjectId")(js.undefined)
        ret
    }
  }
  
}

