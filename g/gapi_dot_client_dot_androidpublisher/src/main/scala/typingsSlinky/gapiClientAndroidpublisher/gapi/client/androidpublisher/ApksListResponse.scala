package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApksListResponse extends js.Object {
  var apks: js.UndefOr[js.Array[Apk]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#apksListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object ApksListResponse {
  @scala.inline
  def apply(): ApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksListResponse]
  }
  @scala.inline
  implicit class ApksListResponseOps[Self <: ApksListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApks(value: js.Array[Apk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apks")(js.undefined)
        ret
    }
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
  }
  
}

