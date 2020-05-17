package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpaceParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.native
  var spaceId: String = js.native
}

object GetSpaceParameters {
  @scala.inline
  def apply(spaceId: String): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceParameters]
  }
  @scala.inline
  implicit class GetSpaceParametersOps[Self <: GetSpaceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: CustomFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

