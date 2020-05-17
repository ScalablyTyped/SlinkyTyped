package typingsSlinky.projectOxford.mod.VisionResponses

import typingsSlinky.projectOxford.anon.AccentColor
import typingsSlinky.projectOxford.anon.AdultScore
import typingsSlinky.projectOxford.anon.Age
import typingsSlinky.projectOxford.anon.ClipArtType
import typingsSlinky.projectOxford.anon.Format
import typingsSlinky.projectOxford.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyze extends js.Object {
  var adult: AdultScore = js.native
  var categories: js.Array[Name] = js.native
  var color: AccentColor = js.native
  var faces: js.Array[Age] = js.native
  var imageType: ClipArtType = js.native
  var metadata: Format = js.native
  var requestId: String = js.native
}

object Analyze {
  @scala.inline
  def apply(
    adult: AdultScore,
    categories: js.Array[Name],
    color: AccentColor,
    faces: js.Array[Age],
    imageType: ClipArtType,
    metadata: Format,
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
    def withAdult(value: AdultScore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: AccentColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaces(value: js.Array[Age]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageType(value: ClipArtType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Format): Self = {
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

