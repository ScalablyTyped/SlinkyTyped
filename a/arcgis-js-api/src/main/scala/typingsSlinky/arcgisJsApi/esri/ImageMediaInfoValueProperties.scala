package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMediaInfoValueProperties extends js.Object {
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: js.UndefOr[String] = js.native
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: js.UndefOr[String] = js.native
}

object ImageMediaInfoValueProperties {
  @scala.inline
  def apply(): ImageMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMediaInfoValueProperties]
  }
  @scala.inline
  implicit class ImageMediaInfoValuePropertiesOps[Self <: ImageMediaInfoValueProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(js.undefined)
        ret
    }
  }
  
}

