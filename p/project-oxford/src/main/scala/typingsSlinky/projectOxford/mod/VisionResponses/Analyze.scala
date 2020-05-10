package typingsSlinky.projectOxford.mod.VisionResponses

import typingsSlinky.projectOxford.AnonAccentColor
import typingsSlinky.projectOxford.AnonAdultScore
import typingsSlinky.projectOxford.AnonAge
import typingsSlinky.projectOxford.AnonClipArtType
import typingsSlinky.projectOxford.AnonFormat
import typingsSlinky.projectOxford.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyze extends js.Object {
  var adult: AnonAdultScore = js.native
  var categories: js.Array[AnonName] = js.native
  var color: AnonAccentColor = js.native
  var faces: js.Array[AnonAge] = js.native
  var imageType: AnonClipArtType = js.native
  var metadata: AnonFormat = js.native
  var requestId: String = js.native
}

object Analyze {
  @scala.inline
  def apply(
    adult: AnonAdultScore,
    categories: js.Array[AnonName],
    color: AnonAccentColor,
    faces: js.Array[AnonAge],
    imageType: AnonClipArtType,
    metadata: AnonFormat,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyze]
  }
  @scala.inline
  implicit class AnalyzeOps[Self <: Analyze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdult(value: AnonAdultScore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: AnonAccentColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaces(value: js.Array[AnonAge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageType(value: AnonClipArtType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: AnonFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

