package typingsSlinky.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySerializer extends StObject {
  
  def parse(queryString: String): js.Object = js.native
  
  def stringify(params: Params): String = js.native
}
object QuerySerializer {
  
  @scala.inline
  def apply(parse: String => js.Object, stringify: Params => String): QuerySerializer = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[QuerySerializer]
  }
  
  @scala.inline
  implicit class QuerySerializerMutableBuilder[Self <: QuerySerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: String => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: Params => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
