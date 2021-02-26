package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISortedQuery extends IFinalizable {
  
  /** Specifies next order field (ascending) */
  def ThenBy(fieldInternalName: String): js.Any = js.native
  
  /** Specifies next order field (descending) */
  def ThenByDesc(fieldInternalName: String): js.Any = js.native
}
object ISortedQuery {
  
  @scala.inline
  def apply(
    ThenBy: String => js.Any,
    ThenByDesc: String => js.Any,
    ToCamlQuery: () => js.Any,
    ToString: () => String
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal(ThenBy = js.Any.fromFunction1(ThenBy), ThenByDesc = js.Any.fromFunction1(ThenByDesc), ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[ISortedQuery]
  }
  
  @scala.inline
  implicit class ISortedQueryMutableBuilder[Self <: ISortedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThenBy(value: String => js.Any): Self = StObject.set(x, "ThenBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenByDesc(value: String => js.Any): Self = StObject.set(x, "ThenByDesc", js.Any.fromFunction1(value))
  }
}
