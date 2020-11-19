package typingsSlinky.activexAdox.ADOX

import typingsSlinky.activexAdodb.ADODB.Properties
import typingsSlinky.activexAdodb.ADODB.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  @JSName("ADOX.Index_typekey")
  var ADOXDotIndex_typekey: Index = js.native
  
  var Clustered: Boolean = js.native
  
  def Columns(Item: String): Column = js.native
  def Columns(Item: Double): Column = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  
  var IndexNulls: AllowNullsEnum = js.native
  
  var Name: String = js.native
  
  var PrimaryKey: Boolean = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Unique: Boolean = js.native
}
