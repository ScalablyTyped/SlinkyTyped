package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If an image was produced from a file (e.g. a PDF), this message gives
  * information about the source of that image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContext extends js.Object {
  /**
    * If the file was a PDF or TIFF, this field gives the page number within
    * the file used to produce the image.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * The URI of the file used to produce the image.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContext {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContext]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContextOps[Self <: SchemaGoogleCloudVisionV1p1beta1ImageAnnotationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

