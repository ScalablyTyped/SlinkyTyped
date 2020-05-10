package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedPrincipal extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.native
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PrincipalType] = js.native
}

object AllowedPrincipal {
  @scala.inline
  def apply(): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPrincipal]
  }
  @scala.inline
  implicit class AllowedPrincipalOps[Self <: AllowedPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
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

