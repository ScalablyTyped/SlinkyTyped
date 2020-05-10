package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingDetail extends js.Object {
  var sharedBy: js.UndefOr[InsightIdentity] = js.native
  var sharedDateTime: js.UndefOr[String] = js.native
  var sharingReference: js.UndefOr[ResourceReference] = js.native
  var sharingSubject: js.UndefOr[String] = js.native
  var sharingType: js.UndefOr[String] = js.native
}

object SharingDetail {
  @scala.inline
  def apply(): SharingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingDetail]
  }
  @scala.inline
  implicit class SharingDetailOps[Self <: SharingDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSharedBy(value: InsightIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingReference(value: ResourceReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingReference")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingType")(js.undefined)
        ret
    }
  }
  
}

