package typingsSlinky.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketRequest extends js.Object {
  var coldline: js.UndefOr[Boolean] = js.native
  var dra: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[String] = js.native
  var multiRegional: js.UndefOr[Boolean] = js.native
  var nearline: js.UndefOr[Boolean] = js.native
  var regional: js.UndefOr[Boolean] = js.native
  var requesterPays: js.UndefOr[Boolean] = js.native
  var retentionPolicy: js.UndefOr[js.Object] = js.native
  var standard: js.UndefOr[Boolean] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object CreateBucketRequest {
  @scala.inline
  def apply(): CreateBucketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketRequest]
  }
  @scala.inline
  implicit class CreateBucketRequestOps[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColdline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColdline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldline")(js.undefined)
        ret
    }
    @scala.inline
    def withDra(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dra")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiRegional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiRegional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiRegional")(js.undefined)
        ret
    }
    @scala.inline
    def withNearline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearline")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

