package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3AccessControlList extends js.Object {
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var Owner: S3ObjectOwner = js.native
}

object S3AccessControlList {
  @scala.inline
  def apply(Owner: S3ObjectOwner): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlList]
  }
  @scala.inline
  implicit class S3AccessControlListOps[Self <: S3AccessControlList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: S3ObjectOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrants(value: S3GrantList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(js.undefined)
        ret
    }
  }
  
}

