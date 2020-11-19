package typingsSlinky.activexAdox.ADOX

import typingsSlinky.activexAdodb.ADODB.DataTypeEnum
import typingsSlinky.activexAdodb.ADODB.Properties
import typingsSlinky.activexAdodb.ADODB.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  @JSName("ADOX.Column_typekey")
  var ADOXDotColumn_typekey: Column = js.native
  
  var Attributes: ColumnAttributesEnum = js.native
  
  var DefinedSize: Double = js.native
  
  var Name: String = js.native
  
  var NumericScale: Double = js.native
  
  var ParentCatalog: Catalog = js.native
  
  var Precision: Double = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var RelatedColumn: String = js.native
  
  var SortOrder: SortOrderEnum = js.native
  
  var Type: DataTypeEnum = js.native
}
