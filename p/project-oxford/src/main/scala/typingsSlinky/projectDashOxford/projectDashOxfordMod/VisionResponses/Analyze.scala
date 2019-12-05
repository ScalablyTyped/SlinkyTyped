package typingsSlinky.projectDashOxford.projectDashOxfordMod.VisionResponses

import typingsSlinky.projectDashOxford.Anon_AccentColor
import typingsSlinky.projectDashOxford.Anon_AdultScore
import typingsSlinky.projectDashOxford.Anon_Age
import typingsSlinky.projectDashOxford.Anon_ClipArtType
import typingsSlinky.projectDashOxford.Anon_Format
import typingsSlinky.projectDashOxford.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  var adult: Anon_AdultScore
  var categories: js.Array[Anon_Name]
  var color: Anon_AccentColor
  var faces: js.Array[Anon_Age]
  var imageType: Anon_ClipArtType
  var metadata: Anon_Format
  var requestId: String
}

object Analyze {
  @scala.inline
  def apply(
    adult: Anon_AdultScore,
    categories: js.Array[Anon_Name],
    color: Anon_AccentColor,
    faces: js.Array[Anon_Age],
    imageType: Anon_ClipArtType,
    metadata: Anon_Format,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Analyze]
  }
}

