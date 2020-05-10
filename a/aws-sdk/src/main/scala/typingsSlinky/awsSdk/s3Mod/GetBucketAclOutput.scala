package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAclOutput extends js.Object {
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Grants] = js.native
  /**
    * Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Owner] = js.native
}

object GetBucketAclOutput {
  @scala.inline
  def apply(): GetBucketAclOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAclOutput]
  }
  @scala.inline
  implicit class GetBucketAclOutputOps[Self <: GetBucketAclOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrants(value: Grants): Self = {
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
    @scala.inline
    def withOwner(value: Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

