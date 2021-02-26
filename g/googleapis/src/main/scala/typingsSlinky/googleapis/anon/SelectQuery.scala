package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectQuery extends StObject {
  
  var selectQuery: js.UndefOr[String] = js.native
}
object SelectQuery {
  
  @scala.inline
  def apply(): SelectQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectQuery]
  }
  
  @scala.inline
  implicit class SelectQueryMutableBuilder[Self <: SelectQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectQuery(value: String): Self = StObject.set(x, "selectQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectQueryUndefined: Self = StObject.set(x, "selectQuery", js.undefined)
  }
}
