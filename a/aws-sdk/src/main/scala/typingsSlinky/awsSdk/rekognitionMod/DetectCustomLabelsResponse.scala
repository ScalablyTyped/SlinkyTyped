package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectCustomLabelsResponse extends js.Object {
  /**
    * An array of custom labels detected in the input image.
    */
  var CustomLabels: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.CustomLabels] = js.native
}

object DetectCustomLabelsResponse {
  @scala.inline
  def apply(): DetectCustomLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectCustomLabelsResponse]
  }
  @scala.inline
  implicit class DetectCustomLabelsResponseOps[Self <: DetectCustomLabelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLabels(value: CustomLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLabels")(js.undefined)
        ret
    }
  }
  
}

