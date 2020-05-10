package typingsSlinky.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoverInfo extends js.Object {
  /** Extra information about the cover photo. */
  var coverInfo: js.UndefOr[AnonLeftImageOffset] = js.native
  /** The person's primary cover image. */
  var coverPhoto: js.UndefOr[AnonWidth] = js.native
  /**
    * The layout of the cover art. Possible values include, but are not limited to, the following values:
    * - "banner" - One large image banner.
    */
  var layout: js.UndefOr[String] = js.native
}

object AnonCoverInfo {
  @scala.inline
  def apply(): AnonCoverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoverInfo]
  }
  @scala.inline
  implicit class AnonCoverInfoOps[Self <: AnonCoverInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverInfo(value: AnonLeftImageOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverPhoto(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhoto")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
  }
  
}

