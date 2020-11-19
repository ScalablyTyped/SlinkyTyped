package typingsSlinky.kendoUi.global.kendo.data

import typingsSlinky.kendoUi.anon.TypeofTreeListModel
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.TreeListModel")
@js.native
class TreeListModel ()
  extends typingsSlinky.kendoUi.kendo.data.TreeListModel {
  def this(data: js.Any) = this()
}
/* static members */
@JSGlobal("kendo.data.TreeListModel")
@js.native
object TreeListModel extends js.Object {
  
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofTreeListModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofTreeListModel = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var idField: String = js.native
}
