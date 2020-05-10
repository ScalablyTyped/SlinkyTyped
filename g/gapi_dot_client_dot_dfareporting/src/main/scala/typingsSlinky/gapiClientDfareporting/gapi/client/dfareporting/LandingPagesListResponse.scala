package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LandingPagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Landing page collection */
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.native
}

object LandingPagesListResponse {
  @scala.inline
  def apply(): LandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LandingPagesListResponse]
  }
  @scala.inline
  implicit class LandingPagesListResponseOps[Self <: LandingPagesListResponse] (val x: Self) extends AnyVal {
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
    def withLandingPages(value: js.Array[LandingPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandingPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPages")(js.undefined)
        ret
    }
  }
  
}

