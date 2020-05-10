package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetPublisherProfilesByAccountIdResponse extends js.Object {
  /**
    * Profiles for the requested publisher
    */
  var profiles: js.UndefOr[js.Array[SchemaPublisherProfileApiProto]] = js.native
}

object SchemaGetPublisherProfilesByAccountIdResponse {
  @scala.inline
  def apply(): SchemaGetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPublisherProfilesByAccountIdResponse]
  }
  @scala.inline
  implicit class SchemaGetPublisherProfilesByAccountIdResponseOps[Self <: SchemaGetPublisherProfilesByAccountIdResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfiles(value: js.Array[SchemaPublisherProfileApiProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
  }
  
}

