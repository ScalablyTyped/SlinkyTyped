package typingsSlinky.kendoUi.global.kendo.data

import typingsSlinky.kendoUi.anon.TypeofSchedulerEvent
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import typingsSlinky.kendoUi.kendo.data.SchedulerEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
class SchedulerEvent ()
  extends typingsSlinky.kendoUi.kendo.data.SchedulerEvent {
  def this(data: SchedulerEventData) = this()
}

/* static members */
@JSGlobal("kendo.data.SchedulerEvent")
@js.native
object SchedulerEvent extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofSchedulerEvent = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofSchedulerEvent = js.native
}

