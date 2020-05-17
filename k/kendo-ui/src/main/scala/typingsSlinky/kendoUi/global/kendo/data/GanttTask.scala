package typingsSlinky.kendoUi.global.kendo.data

import typingsSlinky.kendoUi.anon.TypeofGanttTask
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask ()
  extends typingsSlinky.kendoUi.kendo.data.GanttTask {
  def this(data: js.Any) = this()
}

/* static members */
@JSGlobal("kendo.data.GanttTask")
@js.native
object GanttTask extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttTask = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttTask = js.native
}

