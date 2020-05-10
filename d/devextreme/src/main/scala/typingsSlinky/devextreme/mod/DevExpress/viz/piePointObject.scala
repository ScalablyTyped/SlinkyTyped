package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait piePointObject extends basePointObject {
  /** Gets the percentage value of the specific point. */
  var percent: String | Double | js.Date = js.native
  /** Hides a specific point. */
  def hide(): Unit = js.native
  /** Provides information about the visibility state of a point. */
  def isVisible(): Boolean = js.native
  /** Makes a specific point visible. */
  def show(): Unit = js.native
}

object piePointObject {
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    data: js.Any,
    fullState: Double,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hide: () => Unit,
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    isVisible: () => Boolean,
    originalArgument: String | Double | js.Date,
    originalValue: String | Double | js.Date,
    percent: String | Double | js.Date,
    select: () => Unit,
    series: js.Any,
    show: () => Unit,
    showTooltip: () => Unit,
    tag: js.Any
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hide = js.Any.fromFunction0(hide), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), isVisible = js.Any.fromFunction0(isVisible), originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), series = series.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), showTooltip = js.Any.fromFunction0(showTooltip), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[piePointObject]
  }
  @scala.inline
  implicit class piePointObjectOps[Self <: piePointObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPercentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

