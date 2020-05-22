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
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
trait IconSetConditionalFormatData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.undefined
}

object IconSetConditionalFormatData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = null
  ): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
}

