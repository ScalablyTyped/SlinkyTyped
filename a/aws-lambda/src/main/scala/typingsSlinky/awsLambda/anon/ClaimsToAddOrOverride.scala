package typingsSlinky.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimsToAddOrOverride extends js.Object {
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.native
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  var groupOverrideDetails: js.UndefOr[Null | GroupsToOverride] = js.native
}

object ClaimsToAddOrOverride {
  @scala.inline
  def apply(): ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToAddOrOverride]
  }
  @scala.inline
  implicit class ClaimsToAddOrOverrideOps[Self <: ClaimsToAddOrOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaimsToAddOrOverride(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsToAddOrOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimsToAddOrOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsToAddOrOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimsToSuppress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsToSuppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimsToSuppress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsToSuppress")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOverrideDetails(value: GroupsToOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOverrideDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOverrideDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOverrideDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOverrideDetailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOverrideDetails")(null)
        ret
    }
  }
  
}

