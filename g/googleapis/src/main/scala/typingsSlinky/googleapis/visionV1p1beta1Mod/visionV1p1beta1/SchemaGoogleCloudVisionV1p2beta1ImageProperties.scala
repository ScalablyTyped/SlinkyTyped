package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ImageProperties extends js.Object {
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1ImageProperties {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageProperties]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1ImagePropertiesOps[Self <: SchemaGoogleCloudVisionV1p2beta1ImageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDominantColors(value: SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantColors")(js.undefined)
        ret
    }
  }
  
}

