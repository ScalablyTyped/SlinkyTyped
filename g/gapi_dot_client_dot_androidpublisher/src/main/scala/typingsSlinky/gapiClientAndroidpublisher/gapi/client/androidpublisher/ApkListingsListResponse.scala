package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApkListingsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#apkListingsListResponse". */
  var kind: js.UndefOr[String] = js.native
  var listings: js.UndefOr[js.Array[ApkListing]] = js.native
}

object ApkListingsListResponse {
  @scala.inline
  def apply(): ApkListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkListingsListResponse]
  }
  @scala.inline
  implicit class ApkListingsListResponseOps[Self <: ApkListingsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withListings(value: js.Array[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(js.undefined)
        ret
    }
  }
  
}

