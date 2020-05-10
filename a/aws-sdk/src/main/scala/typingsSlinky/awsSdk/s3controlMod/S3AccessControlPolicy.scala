package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3AccessControlPolicy extends js.Object {
  /**
    * 
    */
  var AccessControlList: js.UndefOr[S3AccessControlList] = js.native
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
}

object S3AccessControlPolicy {
  @scala.inline
  def apply(): S3AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3AccessControlPolicy]
  }
  @scala.inline
  implicit class S3AccessControlPolicyOps[Self <: S3AccessControlPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: S3AccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedAccessControlList(value: S3CannedAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedAccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannedAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedAccessControlList")(js.undefined)
        ret
    }
  }
  
}

