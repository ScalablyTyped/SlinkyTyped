package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-table-footer`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-table-header`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSubId extends StObject {
  
  var index: Double = js.native
  
  var subId: `oj-table-footer` | `oj-table-header` = js.native
}
object IndexSubId {
  
  @scala.inline
  def apply(index: Double, subId: `oj-table-footer` | `oj-table-header`): IndexSubId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSubId]
  }
  
  @scala.inline
  implicit class IndexSubIdMutableBuilder[Self <: IndexSubId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: `oj-table-footer` | `oj-table-header`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
