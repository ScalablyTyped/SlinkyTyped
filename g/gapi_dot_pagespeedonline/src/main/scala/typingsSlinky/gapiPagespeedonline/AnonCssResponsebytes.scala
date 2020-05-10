package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCssResponsebytes extends js.Object {
  /**
    * Number of uncompressed response bytes for CSS resources on the page.
    */
  var cssResponsebytes: String = js.native
  /**
    * Number of response bytes for Flash resources on the page.
    */
  var flashResponseBytes: String = js.native
  /**
    * Number of uncompressed response bytes for the main HTML document and all iframes on the page.
    */
  var htmlResponseBytes: String = js.native
  /**
    * Number of response bytes for image resources on the page.
    */
  var imageResponseBytes: String = js.native
  /**
    * Number of uncompressed response bytes for JS resources on the page.
    */
  var javascriptResponsebytes: String = js.native
  /**
    * Number of CSS resources referenced by the page.
    */
  var numberCssResources: Double = js.native
  /**
    * Number of unique hosts referenced by the page.
    */
  var numberHosts: Double = js.native
  /**
    * Number of JavaScript resources referenced by the page.
    */
  var numberJsResources: Double = js.native
  /**
    * Number of HTTP resources loaded by the page.
    */
  var numberResources: Double = js.native
  /**
    * Number of static (that is, cacheable) resources on the page.
    */
  var numberStaticResources: Double = js.native
  /**
    * Number of response bytes for other resources on the page.
    */
  var otherResponsebytes: String = js.native
  /**
    * Number of uncompressed response bytes for text resources on the page that aren't covered by other statistics; that is, non-HTML, non-script, non-CSS resources.
    */
  var textResponseBytes: String = js.native
  /**
    * Total size of all request bytes sent by the page.
    */
  var totalRequestBytes: String = js.native
}

object AnonCssResponsebytes {
  @scala.inline
  def apply(
    cssResponsebytes: String,
    flashResponseBytes: String,
    htmlResponseBytes: String,
    imageResponseBytes: String,
    javascriptResponsebytes: String,
    numberCssResources: Double,
    numberHosts: Double,
    numberJsResources: Double,
    numberResources: Double,
    numberStaticResources: Double,
    otherResponsebytes: String,
    textResponseBytes: String,
    totalRequestBytes: String
  ): AnonCssResponsebytes = {
    val __obj = js.Dynamic.literal(cssResponsebytes = cssResponsebytes.asInstanceOf[js.Any], flashResponseBytes = flashResponseBytes.asInstanceOf[js.Any], htmlResponseBytes = htmlResponseBytes.asInstanceOf[js.Any], imageResponseBytes = imageResponseBytes.asInstanceOf[js.Any], javascriptResponsebytes = javascriptResponsebytes.asInstanceOf[js.Any], numberCssResources = numberCssResources.asInstanceOf[js.Any], numberHosts = numberHosts.asInstanceOf[js.Any], numberJsResources = numberJsResources.asInstanceOf[js.Any], numberResources = numberResources.asInstanceOf[js.Any], numberStaticResources = numberStaticResources.asInstanceOf[js.Any], otherResponsebytes = otherResponsebytes.asInstanceOf[js.Any], textResponseBytes = textResponseBytes.asInstanceOf[js.Any], totalRequestBytes = totalRequestBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCssResponsebytes]
  }
  @scala.inline
  implicit class AnonCssResponsebytesOps[Self <: AnonCssResponsebytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssResponsebytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssResponsebytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavascriptResponsebytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptResponsebytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberCssResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberCssResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberHosts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberJsResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberJsResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStaticResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStaticResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherResponsebytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherResponsebytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRequestBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRequestBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

