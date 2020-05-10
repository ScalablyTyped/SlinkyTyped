package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionInfo extends js.Object {
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.native
}

object RevisionInfo {
  @scala.inline
  def apply(): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionInfo]
  }
  @scala.inline
  implicit class RevisionInfoOps[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenericRevisionInfo(value: GenericRevisionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericRevisionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenericRevisionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericRevisionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionLocation(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionLocation")(js.undefined)
        ret
    }
  }
  
}

