package typingsSlinky.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueriesFunctions extends StObject {
  
  /**
    * Search in all of the properties of the provided single record
    *
    * @param record A data object with all the properties of the current line
    * @param queryValue The researched value
    * @return A boolean indicating if a match was found
    */
  def search(record: js.Any, queryValue: String): Boolean = js.native
}
object QueriesFunctions {
  
  @scala.inline
  def apply(search: (js.Any, String) => Boolean): QueriesFunctions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[QueriesFunctions]
  }
  
  @scala.inline
  implicit class QueriesFunctionsMutableBuilder[Self <: QueriesFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: (js.Any, String) => Boolean): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
  }
}
