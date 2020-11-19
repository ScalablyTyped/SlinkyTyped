package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ConditionalIconCriterion
import typingsSlinky.officeJsPreview.Excel.IconSet
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the IconSetConditionalFormat object, for use in `iconSetConditionalFormat.set({ ... })`. */
@js.native
trait IconSetConditionalFormatUpdateData extends js.Object {
  
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
object IconSetConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): IconSetConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class IconSetConditionalFormatUpdateDataOps[Self <: IconSetConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCriteriaVarargs(value: ConditionalIconCriterion*): Self = this.set("criteria", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(value: js.Array[ConditionalIconCriterion]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    
    @scala.inline
    def setReverseIconOrder(value: Boolean): Self = this.set("reverseIconOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseIconOrder: Self = this.set("reverseIconOrder", js.undefined)
    
    @scala.inline
    def setShowIconOnly(value: Boolean): Self = this.set("showIconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIconOnly: Self = this.set("showIconOnly", js.undefined)
    
    @scala.inline
    def setStyle(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
