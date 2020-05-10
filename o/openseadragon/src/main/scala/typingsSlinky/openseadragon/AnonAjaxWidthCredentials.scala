package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAjaxWidthCredentials extends js.Object {
  var ajaxWidthCredentials: js.UndefOr[String | Boolean] = js.native
  var buildPyramid: js.UndefOr[Boolean] = js.native
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  var url: String = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
}

object AnonAjaxWidthCredentials {
  @scala.inline
  def apply(url: String): AnonAjaxWidthCredentials = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAjaxWidthCredentials]
  }
  @scala.inline
  implicit class AnonAjaxWidthCredentialsOps[Self <: AnonAjaxWidthCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAjaxWidthCredentials(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWidthCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxWidthCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWidthCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildPyramid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPyramid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildPyramid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPyramid")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginPolicy(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCanvas")(js.undefined)
        ret
    }
  }
  
}

