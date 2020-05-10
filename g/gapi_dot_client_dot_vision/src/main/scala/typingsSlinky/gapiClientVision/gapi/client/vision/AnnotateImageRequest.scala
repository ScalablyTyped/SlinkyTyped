package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotateImageRequest extends js.Object {
  /** Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.native
  /** The image to be processed. */
  var image: js.UndefOr[Image] = js.native
  /** Additional context that may accompany the image. */
  var imageContext: js.UndefOr[ImageContext] = js.native
}

object AnnotateImageRequest {
  @scala.inline
  def apply(): AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateImageRequest]
  }
  @scala.inline
  implicit class AnnotateImageRequestOps[Self <: AnnotateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageContext(value: ImageContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(js.undefined)
        ret
    }
  }
  
}

