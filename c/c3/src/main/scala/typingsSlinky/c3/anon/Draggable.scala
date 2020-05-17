package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.DataSeries
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggable extends js.Object {
  /**
    * Enable to select data points by dragging.
    * If this option set `true`, data points can be selected by dragging.
    *
    * **Note**: If this option set `true`, scrolling on the chart will be disabled because dragging event will handle the event.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable selecting data.
    * If this option is set `true`, we can select the data points and get/set its state of selection by API (e.g. `select`, `unselect`, `selected`).
    * Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Set grouped selection enabled.
    * If this option set `true`, multiple data points that have same x value will be selected by one selection.
    * Defaults to `false`.
    */
  var grouped: js.UndefOr[Boolean] = js.native
  /**
    * Prevent specific data from being selected. Only called if `selection.enabled` is `true`.
    * @param d The data series to decide for.
    * @returns `false` if selection should be disabled for this data.
    */
  var isselectable: js.UndefOr[js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]] = js.native
  /**
    * Set multiple data points selection enabled.
    * If this option set `true`, multiple data points can have the selected
    * state at the same time. If `false` set, only one data point can have
    * the selected state and the others will be unselected when the new data point is selected.
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object Draggable {
  @scala.inline
  def apply(): Draggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draggable]
  }
  @scala.inline
  implicit class DraggableOps[Self <: Draggable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withIsselectable(value: js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isselectable")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
  }
  
}

