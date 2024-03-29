package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FiveArrows
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FiveArrowsGray
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FiveBoxes
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FiveQuarters
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FiveRating
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FourArrows
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FourArrowsGray
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FourRating
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FourRedToBlack
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FourTrafficLights
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeArrows
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeArrowsGray
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeFlags
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeSigns
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeStars
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeSymbols
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeSymbols2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeTriangles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a cell icon.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait Icon extends StObject {
  
  /**
    *
    * Specifies the index of the icon in the given set.
    *
    * [Api set: ExcelApi 1.2]
    */
  var index: Double = js.native
  
  /**
    *
    * Specifies the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = js.native
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
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
