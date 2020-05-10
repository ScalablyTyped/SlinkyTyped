package typingsSlinky.naverWhale.whale.pageAction

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconDetails extends js.Object {
  /**
    * Optional.
    * @deprecated This argument is ignored.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.native
  /**
    * Optional.
    * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var path: js.UndefOr[js.Any] = js.native
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double = js.native
}

object IconDetails {
  @scala.inline
  def apply(tabId: Double): IconDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDetails]
  }
  @scala.inline
  implicit class IconDetailsOps[Self <: IconDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDataImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageData(value: ImageData | NumberDictionary[ImageData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageData")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

