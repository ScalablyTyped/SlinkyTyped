package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrows
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrowsGray
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveBoxes
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveQuarters
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveRating
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrows
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrowsGray
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRating
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRedToBlack
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourTrafficLights
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrows
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrowsGray
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeFlags
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSigns
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStars
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights1
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell icon.
  *
  * [Api set: ExcelApi 1.2]
  */
trait Icon extends js.Object {
  /**
    *
    * Represents the index of the icon in the given set.
    *
    * [Api set: ExcelApi 1.2]
    */
  var index: Double
  /**
    *
    * Represents the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
}

object Icon {
  @scala.inline
  def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

