package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClaimsToAddOrOverride extends js.Object {
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.native
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  var groupOverrideDetails: js.UndefOr[Null | AnonGroupsToOverride] = js.native
}

object AnonClaimsToAddOrOverride {
  @scala.inline
  def apply(): AnonClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClaimsToAddOrOverride]
  }
  @scala.inline
  implicit class AnonClaimsToAddOrOverrideOps[Self <: AnonClaimsToAddOrOverride] (val x: Self) extends AnyVal {
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
    def withGroupOverrideDetails(value: AnonGroupsToOverride): Self = {
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

