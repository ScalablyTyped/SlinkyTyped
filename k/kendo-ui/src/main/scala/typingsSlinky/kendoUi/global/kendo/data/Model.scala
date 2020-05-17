package typingsSlinky.kendoUi.global.kendo.data

import typingsSlinky.kendoUi.anon.TypeofModel
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsSlinky.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Model")
@js.native
class Model ()
  extends typingsSlinky.kendoUi.kendo.data.Model {
  def this(data: js.Any) = this()
}

/* static members */
@JSGlobal("kendo.data.Model")
@js.native
object Model extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofModel = js.native
}

