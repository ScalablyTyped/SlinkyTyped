package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesResult extends js.Object {
  
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.native
}
object DescribeImagesResult {
  
  @scala.inline
  def apply(): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResult]
  }
  
  @scala.inline
  implicit class DescribeImagesResultOps[Self <: DescribeImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("Images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: ImageList): Self = this.set("Images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("Images", js.undefined)
  }
}
