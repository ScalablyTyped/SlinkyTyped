package typingsSlinky.kendoUi.global.kendo.data

import typingsSlinky.kendoUi.anon.TypeofGanttDependency
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttDependency")
@js.native
class GanttDependency ()
  extends typingsSlinky.kendoUi.kendo.data.GanttDependency {
  def this(data: js.Any) = this()
}

/* static members */
@JSGlobal("kendo.data.GanttDependency")
@js.native
object GanttDependency extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttDependency = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttDependency = js.native
}

