package typingsSlinky.awsSdkClientS3Browser.typesGrantMod

import typingsSlinky.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGrant extends Grant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.native
}

object UnmarshalledGrant {
  @scala.inline
  def apply(): UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGrant]
  }
  @scala.inline
  implicit class UnmarshalledGrantOps[Self <: UnmarshalledGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantee(value: UnmarshalledGrantee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grantee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grantee")(js.undefined)
        ret
    }
  }
  
}

