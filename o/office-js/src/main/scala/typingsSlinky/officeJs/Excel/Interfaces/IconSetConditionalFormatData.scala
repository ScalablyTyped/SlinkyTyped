package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ConditionalIconCriterion
import typingsSlinky.officeJs.Excel.IconSet
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

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
@js.native
trait IconSetConditionalFormatData extends StObject {
  
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.native
  
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.native
}
object IconSetConditionalFormatData {
  
  @scala.inline
  def apply(): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
  
  @scala.inline
  implicit class IconSetConditionalFormatDataMutableBuilder[Self <: IconSetConditionalFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: js.Array[ConditionalIconCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: ConditionalIconCriterion*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setReverseIconOrder(value: Boolean): Self = StObject.set(x, "reverseIconOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseIconOrderUndefined: Self = StObject.set(x, "reverseIconOrder", js.undefined)
    
    @scala.inline
    def setShowIconOnly(value: Boolean): Self = StObject.set(x, "showIconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconOnlyUndefined: Self = StObject.set(x, "showIconOnly", js.undefined)
    
    @scala.inline
    def setStyle(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
