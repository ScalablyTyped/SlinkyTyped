package typingsSlinky.jqueryMatchHeight

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryMatchHeight.JQueryMatchHeight.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMatchHeight_ extends js.Object {
  
  /**
    * Set all selected elements to the height of the tallest.
    * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
    */
  def apply(): JQuery = js.native
  def apply(options: Options): JQuery = js.native
  
  def _afterUpdate(event: JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  
  def _apply(elements: js.Any, options: js.Any): Unit = js.native
  
  def _beforeUpdate(event: JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  
  var _groups: js.Array[_] = js.native
  
  var _maintainScroll: Boolean = js.native
  
  def _rows($item: JQuery): js.Array[_] = js.native
  
  var _throttle: Double = js.native
  
  def _update(): Unit = js.native
}
