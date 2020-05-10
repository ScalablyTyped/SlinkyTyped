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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCriteria(value: js.Array[ConditionalIconCriterion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseIconOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseIconOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseIconOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseIconOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIconOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIconOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

