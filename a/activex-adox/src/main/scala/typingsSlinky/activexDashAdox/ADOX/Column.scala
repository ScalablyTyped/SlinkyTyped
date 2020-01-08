package typingsSlinky.activexDashAdox.ADOX

import typingsSlinky.activexDashAdodb.ADODB.DataTypeEnum
import typingsSlinky.activexDashAdodb.ADODB.Properties
import typingsSlinky.activexDashAdodb.ADODB.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Column")
@js.native
class Column protected () extends js.Object {
  @JSName("ADOX.Column_typekey")
  var ADOXDotColumn_typekey: Column = js.native
  var Attributes: ColumnAttributesEnum = js.native
  var DefinedSize: Double = js.native
  var Name: String = js.native
  var NumericScale: Double = js.native
  var ParentCatalog: Catalog = js.native
  var Precision: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var RelatedColumn: String = js.native
  var SortOrder: SortOrderEnum = js.native
  var Type: DataTypeEnum = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

