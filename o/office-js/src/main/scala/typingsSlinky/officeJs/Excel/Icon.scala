package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.FiveArrows
import typingsSlinky.officeJs.officeJsStrings.FiveArrowsGray
import typingsSlinky.officeJs.officeJsStrings.FiveBoxes
import typingsSlinky.officeJs.officeJsStrings.FiveQuarters
import typingsSlinky.officeJs.officeJsStrings.FiveRating
import typingsSlinky.officeJs.officeJsStrings.FourArrows
import typingsSlinky.officeJs.officeJsStrings.FourArrowsGray
import typingsSlinky.officeJs.officeJsStrings.FourRating
import typingsSlinky.officeJs.officeJsStrings.FourRedToBlack
import typingsSlinky.officeJs.officeJsStrings.FourTrafficLights
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.ThreeArrows
import typingsSlinky.officeJs.officeJsStrings.ThreeArrowsGray
import typingsSlinky.officeJs.officeJsStrings.ThreeFlags
import typingsSlinky.officeJs.officeJsStrings.ThreeSigns
import typingsSlinky.officeJs.officeJsStrings.ThreeStars
import typingsSlinky.officeJs.officeJsStrings.ThreeSymbols
import typingsSlinky.officeJs.officeJsStrings.ThreeSymbols2
import typingsSlinky.officeJs.officeJsStrings.ThreeTrafficLights1
import typingsSlinky.officeJs.officeJsStrings.ThreeTrafficLights2
import typingsSlinky.officeJs.officeJsStrings.ThreeTriangles
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
