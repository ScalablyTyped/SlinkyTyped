package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PrincipalARN] = js.native
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PrincipalType] = js.native
}

object Principal {
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipalARN(value: PrincipalARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalARN")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalType(value: PrincipalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalType")(js.undefined)
        ret
    }
  }
  
}

