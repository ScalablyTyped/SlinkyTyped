package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeBorderCollection object, for use in `conditionalRangeBorderCollection.set({ ... })`. */
@js.native
trait ConditionalRangeBorderCollectionUpdateData extends js.Object {
  /**
    *
    * Gets the bottom border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bottom: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.native
  /**
    *
    * Gets the left border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var left: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  /**
    *
    * Gets the right border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var right: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  /**
    *
    * Gets the top border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var top: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
}

object ConditionalRangeBorderCollectionUpdateData {
  @scala.inline
  def apply(): ConditionalRangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderCollectionUpdateData]
  }
  @scala.inline
  implicit class ConditionalRangeBorderCollectionUpdateDataOps[Self <: ConditionalRangeBorderCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: ConditionalRangeBorderUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ConditionalRangeBorderData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: ConditionalRangeBorderUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: ConditionalRangeBorderUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: ConditionalRangeBorderUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

