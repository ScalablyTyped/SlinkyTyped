package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List AccountUsers Response.
  */
@js.native
trait SchemaListAccountUsersResponse extends js.Object {
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[SchemaUserAccess]] = js.native
}

object SchemaListAccountUsersResponse {
  @scala.inline
  def apply(): SchemaListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountUsersResponse]
  }
  @scala.inline
  implicit class SchemaListAccountUsersResponseOps[Self <: SchemaListAccountUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAccess(value: js.Array[SchemaUserAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccess")(js.undefined)
        ret
    }
  }
  
}

