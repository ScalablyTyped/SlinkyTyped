package typingsSlinky.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.kendoUi.anon.TypeofSchedulerEvent
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import typingsSlinky.kendoUi.kendo.data.SchedulerEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
class SchedulerEvent ()
  extends typingsSlinky.kendoUi.kendo.data.SchedulerEvent {
  def this(data: SchedulerEventData) = this()
}
object SchedulerEvent {
  
  @JSGlobal("kendo.data.SchedulerEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofSchedulerEvent with (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typingsSlinky.kendoUi.kendo.data.SchedulerEvent
  ]) = js.native
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofSchedulerEvent with (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typingsSlinky.kendoUi.kendo.data.SchedulerEvent
  ]) = js.native
  
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  @scala.inline
  def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.idField")
  @js.native
  def idField: String = js.native
  @scala.inline
  def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
