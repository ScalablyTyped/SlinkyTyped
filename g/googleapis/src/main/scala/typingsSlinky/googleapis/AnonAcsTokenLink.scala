package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcsTokenLink extends js.Object {
  var acsTokenLink: js.UndefOr[String] = js.native
  var downloadLink: js.UndefOr[String] = js.native
  var isAvailable: js.UndefOr[Boolean] = js.native
}

object AnonAcsTokenLink {
  @scala.inline
  def apply(): AnonAcsTokenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAcsTokenLink]
  }
  @scala.inline
  implicit class AnonAcsTokenLinkOps[Self <: AnonAcsTokenLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcsTokenLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsTokenLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcsTokenLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acsTokenLink")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(js.undefined)
        ret
    }
  }
  
}

