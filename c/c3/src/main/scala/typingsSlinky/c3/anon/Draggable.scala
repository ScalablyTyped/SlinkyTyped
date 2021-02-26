package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.DataSeries
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable extends StObject {
  
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
  implicit class DraggableMutableBuilder[Self <: Draggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    @scala.inline
    def setIsselectable(value: js.ThisFunction1[/* this */ Record[String, _], /* d */ DataSeries, Boolean]): Self = StObject.set(x, "isselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsselectableUndefined: Self = StObject.set(x, "isselectable", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
