package typingsSlinky.gijgo

import typingsSlinky.gijgo.Types.Checkbox
import typingsSlinky.gijgo.Types.CheckboxSettings
import typingsSlinky.gijgo.Types.DatePicker
import typingsSlinky.gijgo.Types.DatePickerSettings
import typingsSlinky.gijgo.Types.DateTimePicker
import typingsSlinky.gijgo.Types.DateTimePickerSettings
import typingsSlinky.gijgo.Types.Dialog
import typingsSlinky.gijgo.Types.DialogSettings
import typingsSlinky.gijgo.Types.DropDown
import typingsSlinky.gijgo.Types.DropDownSettings
import typingsSlinky.gijgo.Types.Editor
import typingsSlinky.gijgo.Types.EditorSettings
import typingsSlinky.gijgo.Types.Grid
import typingsSlinky.gijgo.Types.GridSettings
import typingsSlinky.gijgo.Types.Slider
import typingsSlinky.gijgo.Types.SliderSettings
import typingsSlinky.gijgo.Types.TimePicker
import typingsSlinky.gijgo.Types.TimePickerSettings
import typingsSlinky.gijgo.Types.Tree
import typingsSlinky.gijgo.Types.TreeSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def checkbox(settings: CheckboxSettings): Checkbox = js.native
  
  def datepicker(settings: DatePickerSettings): DatePicker = js.native
  
  def datetimepicker(settings: DateTimePickerSettings): DateTimePicker = js.native
  
  def dialog(settings: DialogSettings): Dialog = js.native
  
  def dropdown(settings: DropDownSettings): DropDown = js.native
  
  def editor(settings: EditorSettings): Editor = js.native
  
  def grid(settings: GridSettings[_]): Grid[_, _] = js.native
  @JSName("grid")
  def grid_Entity[Entity](settings: GridSettings[Entity]): Grid[Entity, _] = js.native
  @JSName("grid")
  def grid_EntityParams[Entity, Params](settings: GridSettings[Entity]): Grid[Entity, Params] = js.native
  
  def slider(settings: SliderSettings): Slider = js.native
  
  def timepicker(settings: TimePickerSettings): TimePicker = js.native
  
  def tree(settings: TreeSettings): Tree = js.native
}
