package typingsSlinky.gapiClientPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCssResponseBytes extends js.Object {
  /** Number of uncompressed response bytes for CSS resources on the page. */
  var cssResponseBytes: js.UndefOr[String] = js.native
  /** Number of response bytes for flash resources on the page. */
  var flashResponseBytes: js.UndefOr[String] = js.native
  /** Number of uncompressed response bytes for the main HTML document and all iframes on the page. */
  var htmlResponseBytes: js.UndefOr[String] = js.native
  /** Number of response bytes for image resources on the page. */
  var imageResponseBytes: js.UndefOr[String] = js.native
  /** Number of uncompressed response bytes for JS resources on the page. */
  var javascriptResponseBytes: js.UndefOr[String] = js.native
  /** Number of CSS resources referenced by the page. */
  var numberCssResources: js.UndefOr[Double] = js.native
  /** Number of unique hosts referenced by the page. */
  var numberHosts: js.UndefOr[Double] = js.native
  /** Number of JavaScript resources referenced by the page. */
  var numberJsResources: js.UndefOr[Double] = js.native
  /** Number of HTTP resources loaded by the page. */
  var numberResources: js.UndefOr[Double] = js.native
  /** Number of static (i.e. cacheable) resources on the page. */
  var numberStaticResources: js.UndefOr[Double] = js.native
  /** Number of response bytes for other resources on the page. */
  var otherResponseBytes: js.UndefOr[String] = js.native
  /** Number of uncompressed response bytes for text resources not covered by other statistics (i.e non-HTML, non-script, non-CSS resources) on the page. */
  var textResponseBytes: js.UndefOr[String] = js.native
  /** Total size of all request bytes sent by the page. */
  var totalRequestBytes: js.UndefOr[String] = js.native
}

object AnonCssResponseBytes {
  @scala.inline
  def apply(): AnonCssResponseBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCssResponseBytes]
  }
  @scala.inline
  implicit class AnonCssResponseBytesOps[Self <: AnonCssResponseBytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withImageResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withJavascriptResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavascriptResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberCssResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberCssResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberCssResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberCssResources")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberHosts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberJsResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberJsResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberJsResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberJsResources")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberResources")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberStaticResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStaticResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberStaticResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStaticResources")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTextResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRequestBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRequestBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRequestBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRequestBytes")(js.undefined)
        ret
    }
  }
  
}

