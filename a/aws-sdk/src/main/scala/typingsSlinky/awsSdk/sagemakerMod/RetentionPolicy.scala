package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPolicy extends js.Object {
  /**
    * The home Amazon Elastic File System (EFS).
    */
  var HomeEfsFileSystem: js.UndefOr[RetentionType] = js.native
}

object RetentionPolicy {
  @scala.inline
  def apply(): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPolicy]
  }
  @scala.inline
  implicit class RetentionPolicyOps[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeEfsFileSystem(value: RetentionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeEfsFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystem")(js.undefined)
        ret
    }
  }
  
}

