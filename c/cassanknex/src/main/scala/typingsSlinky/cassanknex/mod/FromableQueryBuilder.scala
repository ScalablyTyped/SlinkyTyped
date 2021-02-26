package typingsSlinky.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromableQueryBuilder extends StObject {
  
  def from(table: String): this.type = js.native
}
object FromableQueryBuilder {
  
  @scala.inline
  def apply(from: String => FromableQueryBuilder): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[FromableQueryBuilder]
  }
  
  @scala.inline
  implicit class FromableQueryBuilderMutableBuilder[Self <: FromableQueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String => FromableQueryBuilder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
  }
}
