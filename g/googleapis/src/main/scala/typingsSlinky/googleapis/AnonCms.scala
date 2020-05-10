package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCms extends js.Object {
  var cms: js.UndefOr[String] = js.native
  var cssResponseBytes: js.UndefOr[String] = js.native
  var flashResponseBytes: js.UndefOr[String] = js.native
  var htmlResponseBytes: js.UndefOr[String] = js.native
  var imageResponseBytes: js.UndefOr[String] = js.native
  var javascriptResponseBytes: js.UndefOr[String] = js.native
  var numRenderBlockingRoundTrips: js.UndefOr[Double] = js.native
  var numTotalRoundTrips: js.UndefOr[Double] = js.native
  var numberCssResources: js.UndefOr[Double] = js.native
  var numberHosts: js.UndefOr[Double] = js.native
  var numberJsResources: js.UndefOr[Double] = js.native
  var numberResources: js.UndefOr[Double] = js.native
  var numberRobotedResources: js.UndefOr[Double] = js.native
  var numberStaticResources: js.UndefOr[Double] = js.native
  var numberTransientFetchFailureResources: js.UndefOr[Double] = js.native
  var otherResponseBytes: js.UndefOr[String] = js.native
  var overTheWireResponseBytes: js.UndefOr[String] = js.native
  var robotedUrls: js.UndefOr[js.Array[String]] = js.native
  var textResponseBytes: js.UndefOr[String] = js.native
  var totalRequestBytes: js.UndefOr[String] = js.native
  var transientFetchFailureUrls: js.UndefOr[js.Array[String]] = js.native
}

object AnonCms {
  @scala.inline
  def apply(): AnonCms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCms]
  }
  @scala.inline
  implicit class AnonCmsOps[Self <: AnonCms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cms")(js.undefined)
        ret
    }
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
    def withNumRenderBlockingRoundTrips(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRenderBlockingRoundTrips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRenderBlockingRoundTrips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRenderBlockingRoundTrips")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTotalRoundTrips(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalRoundTrips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTotalRoundTrips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalRoundTrips")(js.undefined)
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
    def withNumberRobotedResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRobotedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberRobotedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRobotedResources")(js.undefined)
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
    def withNumberTransientFetchFailureResources(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberTransientFetchFailureResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberTransientFetchFailureResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberTransientFetchFailureResources")(js.undefined)
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
    def withOverTheWireResponseBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overTheWireResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverTheWireResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overTheWireResponseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withRobotedUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotedUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobotedUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robotedUrls")(js.undefined)
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
    @scala.inline
    def withTransientFetchFailureUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientFetchFailureUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransientFetchFailureUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientFetchFailureUrls")(js.undefined)
        ret
    }
  }
  
}

