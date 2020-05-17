package typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapiClientPagespeedonline.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagespeedApiImageV2 extends js.Object {
  /** Image data base64 encoded. */
  var data: js.UndefOr[String] = js.native
  /** Height of screenshot in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** Unique string key, if any, identifying this image. */
  var key: js.UndefOr[String] = js.native
  /** Mime type of image data (e.g. "image/jpeg"). */
  var mime_type: js.UndefOr[String] = js.native
  /** The region of the page that is captured by this image, with dimensions measured in CSS pixels. */
  var page_rect: js.UndefOr[Height] = js.native
  /** Width of screenshot in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object PagespeedApiImageV2 {
  @scala.inline
  def apply(): PagespeedApiImageV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiImageV2]
  }
  @scala.inline
  implicit class PagespeedApiImageV2Ops[Self <: PagespeedApiImageV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMime_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_rect(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_rect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_rect")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

