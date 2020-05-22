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

trait Analyze extends js.Object {
  var adult: AdultScore
  var categories: js.Array[Name]
  var color: AccentColor
  var faces: js.Array[Age]
  var imageType: ClipArtType
  var metadata: Format
  var requestId: String
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
}

