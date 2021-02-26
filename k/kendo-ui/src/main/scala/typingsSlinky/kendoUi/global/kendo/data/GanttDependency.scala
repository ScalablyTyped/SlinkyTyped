package typingsSlinky.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.kendoUi.anon.TypeofGanttDependency
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.GanttDependency")
@js.native
class GanttDependency ()
  extends typingsSlinky.kendoUi.kendo.data.GanttDependency {
  def this(data: js.Any) = this()
}
object GanttDependency {
  
  @JSGlobal("kendo.data.GanttDependency")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttDependency with (Instantiable1[/* data */ js.UndefOr[js.Any], typingsSlinky.kendoUi.kendo.data.GanttDependency]) = js.native
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttDependency with (Instantiable1[/* data */ js.UndefOr[js.Any], typingsSlinky.kendoUi.kendo.data.GanttDependency]) = js.native
  
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  @scala.inline
  def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.idField")
  @js.native
  def idField: String = js.native
  @scala.inline
  def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
