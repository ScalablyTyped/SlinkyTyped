package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for online images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage extends js.Object {
  
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImageOps[Self <: SchemaGoogleCloudVisionV1p2beta1WebDetectionWebImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
