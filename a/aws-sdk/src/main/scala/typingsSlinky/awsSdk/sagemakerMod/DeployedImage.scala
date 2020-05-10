package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployedImage extends js.Object {
  /**
    * The date and time when the image path for the model resolved to the ResolvedImage 
    */
  var ResolutionTime: js.UndefOr[js.Date] = js.native
  /**
    * The specific digest path of the image hosted in this ProductionVariant.
    */
  var ResolvedImage: js.UndefOr[Image] = js.native
  /**
    * The image path you specified when you created the model.
    */
  var SpecifiedImage: js.UndefOr[Image] = js.native
}

object DeployedImage {
  @scala.inline
  def apply(): DeployedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedImage]
  }
  @scala.inline
  implicit class DeployedImageOps[Self <: DeployedImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolutionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecifiedImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecifiedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecifiedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecifiedImage")(js.undefined)
        ret
    }
  }
  
}

