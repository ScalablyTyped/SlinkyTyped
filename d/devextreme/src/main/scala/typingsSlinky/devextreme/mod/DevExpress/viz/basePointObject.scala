package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait basePointObject extends js.Object {
  /** Contains the data object that the series point represents. */
  var data: js.Any = js.native
  /** Provides information about the state of the point object. */
  var fullState: Double = js.native
  /** Returns the point's argument value that was set in the data source. */
  var originalArgument: String | Double | js.Date = js.native
  /** Returns the point's value that was set in the data source. */
  var originalValue: String | Double | js.Date = js.native
  /** Returns the series object to which the point belongs. */
  var series: js.Any = js.native
  /** Returns the tag of the point. */
  var tag: js.Any = js.native
  /** Switches the point from the hover state back to normal. */
  def clearHover(): Unit = js.native
  /** Deselects the point. */
  def clearSelection(): Unit = js.native
  /** Gets the color of a particular point. */
  def getColor(): String = js.native
  /** Allows you to obtain the label(s) of the series point. */
  def getLabel(): baseLabelObject with js.Array[baseLabelObject] = js.native
  /** Hides the tooltip of the point. */
  def hideTooltip(): Unit = js.native
  /** Switches the point into the hover state, the same as when a user places the mouse pointer on it. */
  def hover(): Unit = js.native
  /** Provides information about the hover state of a point. */
  def isHovered(): Boolean = js.native
  /** Provides information about the selection state of a point. */
  def isSelected(): Boolean = js.native
  /** Selects the point. The point is displayed in a 'selected' style until another point is selected or the current point is deselected programmatically. */
  def select(): Unit = js.native
  /** Shows the tooltip of the point. */
  def showTooltip(): Unit = js.native
}

object basePointObject {
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    data: js.Any,
    fullState: Double,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    originalArgument: String | Double | js.Date,
    originalValue: String | Double | js.Date,
    select: () => Unit,
    series: js.Any,
    showTooltip: () => Unit,
    tag: js.Any
  ): basePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), series = series.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction0(showTooltip), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[basePointObject]
  }
  @scala.inline
  implicit class basePointObjectOps[Self <: basePointObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearHover(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearHover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabel(value: () => baseLabelObject with js.Array[baseLabelObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHover(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction0(value))
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
    def withOriginalArgumentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalArgument(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalValue(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

