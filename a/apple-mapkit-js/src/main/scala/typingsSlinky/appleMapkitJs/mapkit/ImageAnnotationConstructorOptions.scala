package typingsSlinky.appleMapkitJs.mapkit

import typingsSlinky.appleMapkitJs.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing options for initializing an image annotation.
  */
@js.native
trait ImageAnnotationConstructorOptions extends AnnotationConstructorOptions {
  /**
    * An object containing URLs for the image assets in multiple resolutions.
    */
  var url: `1` = js.native
}

object ImageAnnotationConstructorOptions {
  @scala.inline
  def apply(url: `1`): ImageAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnnotationConstructorOptions]
  }
  @scala.inline
  implicit class ImageAnnotationConstructorOptionsOps[Self <: ImageAnnotationConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

