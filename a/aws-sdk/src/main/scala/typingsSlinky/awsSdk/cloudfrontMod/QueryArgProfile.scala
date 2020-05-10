package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArgProfile extends js.Object {
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String = js.native
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String = js.native
}

object QueryArgProfile {
  @scala.inline
  def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any], QueryArg = QueryArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfile]
  }
  @scala.inline
  implicit class QueryArgProfileOps[Self <: QueryArgProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryArg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryArg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

