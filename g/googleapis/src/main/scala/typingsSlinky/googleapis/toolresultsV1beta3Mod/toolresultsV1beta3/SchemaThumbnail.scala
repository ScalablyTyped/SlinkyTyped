package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single thumbnail, with its size and format.
  */
@js.native
trait SchemaThumbnail extends js.Object {
  /**
    * The thumbnail&#39;s content type, i.e. &quot;image/png&quot;.  Always
    * set.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The thumbnail file itself.  That is, the bytes here are precisely the
    * bytes that make up the thumbnail file; they can be served as an image
    * as-is (with the appropriate content type.)  Always set.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The height of the thumbnail, in pixels.  Always set.
    */
  var heightPx: js.UndefOr[Double] = js.native
  /**
    * The width of the thumbnail, in pixels.  Always set.
    */
  var widthPx: js.UndefOr[Double] = js.native
}

object SchemaThumbnail {
  @scala.inline
  def apply(): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnail]
  }
  @scala.inline
  implicit class SchemaThumbnailOps[Self <: SchemaThumbnail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
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
    def withHeightPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPx")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPx")(js.undefined)
        ret
    }
  }
  
}

