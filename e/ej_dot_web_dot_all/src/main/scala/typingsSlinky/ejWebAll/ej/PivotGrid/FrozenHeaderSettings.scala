package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrozenHeaderSettings extends js.Object {
  /** Allows you to freeze the column headers alone when scrolling the vertical scroll bar.
    * @Default {false}
    */
  var enableFrozenColumnHeaders: js.UndefOr[Boolean] = js.native
  /** Allows you to freeze both row headers and column headers while scrolling.
    * @Default {false}
    */
  var enableFrozenHeaders: js.UndefOr[Boolean] = js.native
  /** Allows you to freeze the row headers alone when scrolling the horizontal scroll bar.
    * @Default {false}
    */
  var enableFrozenRowHeaders: js.UndefOr[Boolean] = js.native
  /** Allows you to set the size of the scrollbar (horizontal and vertical) that is visible in the PivotGrid.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
}

object FrozenHeaderSettings {
  @scala.inline
  def apply(): FrozenHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrozenHeaderSettings]
  }
  @scala.inline
  implicit class FrozenHeaderSettingsOps[Self <: FrozenHeaderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableFrozenColumnHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenColumnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFrozenColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenColumnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFrozenHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFrozenHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFrozenRowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenRowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFrozenRowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFrozenRowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(js.undefined)
        ret
    }
  }
  
}

