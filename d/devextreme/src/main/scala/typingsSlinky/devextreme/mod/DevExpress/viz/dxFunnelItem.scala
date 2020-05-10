package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelItem extends js.Object {
  /** The item's argument. */
  var argument: String | js.Date | Double = js.native
  /** The item's original data object. */
  var data: js.Any = js.native
  /** The item's calculated percentage value. */
  var percent: Double = js.native
  /** The item's value. */
  var value: Double = js.native
  /** Gets the funnel item's color specified in the data source or palette. */
  def getColor(): String = js.native
  /** Changes the funnel item's hover state. */
  def hover(state: Boolean): Unit = js.native
  /** Indicates whether the funnel item is in the hover state. */
  def isHovered(): Boolean = js.native
  /** Indicates whether the funnel item is selected. */
  def isSelected(): Boolean = js.native
  /** Selects or cancels the funnel item's selection. */
  def select(state: Boolean): Unit = js.native
  /** Shows the funnel item's tooltip. */
  def showTooltip(): Unit = js.native
}

object dxFunnelItem {
  @scala.inline
  def apply(
    argument: String | js.Date | Double,
    data: js.Any,
    getColor: () => String,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    percent: Double,
    select: Boolean => Unit,
    showTooltip: () => Unit,
    value: Double
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), percent = percent.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), showTooltip = js.Any.fromFunction0(showTooltip), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFunnelItem]
  }
  @scala.inline
  implicit class dxFunnelItemOps[Self <: dxFunnelItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgument(value: String | js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHover(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsHovered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSelected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

