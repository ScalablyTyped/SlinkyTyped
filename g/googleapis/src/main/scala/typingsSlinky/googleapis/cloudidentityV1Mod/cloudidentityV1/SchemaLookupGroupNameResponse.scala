package typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLookupGroupNameResponse extends js.Object {
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where `group_id` is the
    * unique ID assigned to the Group.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLookupGroupNameResponse {
  @scala.inline
  def apply(): SchemaLookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupGroupNameResponse]
  }
  @scala.inline
  implicit class SchemaLookupGroupNameResponseOps[Self <: SchemaLookupGroupNameResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

