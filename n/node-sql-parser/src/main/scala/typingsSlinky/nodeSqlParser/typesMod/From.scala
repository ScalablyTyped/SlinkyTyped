package typingsSlinky.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends StObject {
  
  var as: String | Null = js.native
  
  var db: String | Null = js.native
  
  var table: String = js.native
}
object From {
  
  @scala.inline
  def apply(table: String): From = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNull: Self = StObject.set(x, "as", null)
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNull: Self = StObject.set(x, "db", null)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
