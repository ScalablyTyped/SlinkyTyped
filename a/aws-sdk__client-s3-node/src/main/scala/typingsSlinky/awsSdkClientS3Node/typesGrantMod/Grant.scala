package typingsSlinky.awsSdkClientS3Node.typesGrantMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ_ACP
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE_ACP
import typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.native
  /**
    * <p>Specifies the permission given to the grantee.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.native
}

object Grant {
  @scala.inline
  def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantee(value: Grantee): Self = {
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
    @scala.inline
    def withPermission(value: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(js.undefined)
        ret
    }
  }
  
}

