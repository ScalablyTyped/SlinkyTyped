package typingsSlinky.oembedParser.mod

import typingsSlinky.oembedParser.oembedParserStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoTypeData extends OembedData {
  /** The height in pixels of the image specified in the url parameter. */
  var height: Double = js.native
  @JSName("type")
  val type_PhotoTypeData: photo = js.native
  /**
    * The source URL of the image. Consumers should be able to insert this URL into an <img> element.
    * Only HTTP and HTTPS URLs are valid.
    */
  var url: String = js.native
  /** The width in pixels of the image specified in the url parameter. */
  var width: Double = js.native
}

object PhotoTypeData {
  @scala.inline
  def apply(height: Double, `type`: photo, url: String, version: String, width: Double): PhotoTypeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoTypeData]
  }
  @scala.inline
  implicit class PhotoTypeDataOps[Self <: PhotoTypeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

