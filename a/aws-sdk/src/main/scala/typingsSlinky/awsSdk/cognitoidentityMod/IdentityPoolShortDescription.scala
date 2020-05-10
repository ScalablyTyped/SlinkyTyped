package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolShortDescription extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId] = js.native
  /**
    * A string that you provide.
    */
  var IdentityPoolName: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolName] = js.native
}

object IdentityPoolShortDescription {
  @scala.inline
  def apply(): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
  @scala.inline
  implicit class IdentityPoolShortDescriptionOps[Self <: IdentityPoolShortDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolName(value: IdentityPoolName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolName")(js.undefined)
        ret
    }
  }
  
}

