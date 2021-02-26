package typingsSlinky.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQLResultSetRowList extends StObject {
  
  def item(index: Double): js.Any = js.native
  
  var length: Double = js.native
}
object SQLResultSetRowList {
  
  @scala.inline
  def apply(item: Double => js.Any, length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSetRowList]
  }
  
  @scala.inline
  implicit class SQLResultSetRowListMutableBuilder[Self <: SQLResultSetRowList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
