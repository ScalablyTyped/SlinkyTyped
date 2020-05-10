package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageResult extends js.Object {
  /**
    * Information about the image.
    */
  var Image: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Image] = js.native
}

object DeleteImageResult {
  @scala.inline
  def apply(): DeleteImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageResult]
  }
  @scala.inline
  implicit class DeleteImageResultOps[Self <: DeleteImageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.undefined)
        ret
    }
  }
  
}

