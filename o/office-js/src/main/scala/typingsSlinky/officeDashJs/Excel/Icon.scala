package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.FiveArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveBoxes
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveQuarters
import typingsSlinky.officeDashJs.officeDashJsStrings.FiveRating
import typingsSlinky.officeDashJs.officeDashJsStrings.FourArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.FourArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.FourRating
import typingsSlinky.officeDashJs.officeDashJsStrings.FourRedToBlack
import typingsSlinky.officeDashJs.officeDashJsStrings.FourTrafficLights
import typingsSlinky.officeDashJs.officeDashJsStrings.Invalid
import typingsSlinky.officeDashJs.officeDashJsStrings.LinkedEntityFinanceIcon
import typingsSlinky.officeDashJs.officeDashJsStrings.LinkedEntityMapIcon
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeArrows
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeArrowsGray
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeFlags
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSigns
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeStars
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSymbols
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeSymbols2
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTrafficLights1
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTrafficLights2
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeTriangles
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
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon
}

object Icon {
  @scala.inline
  def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

