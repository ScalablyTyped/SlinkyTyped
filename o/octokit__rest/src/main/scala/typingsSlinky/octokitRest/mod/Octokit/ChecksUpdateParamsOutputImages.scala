package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParamsOutputImages extends js.Object {
  var alt: String = js.native
  var caption: js.UndefOr[String] = js.native
  var image_url: String = js.native
}

object ChecksUpdateParamsOutputImages {
  @scala.inline
  def apply(alt: String, image_url: String): ChecksUpdateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputImages]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOutputImagesOps[Self <: ChecksUpdateParamsOutputImages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
  }
  
}

