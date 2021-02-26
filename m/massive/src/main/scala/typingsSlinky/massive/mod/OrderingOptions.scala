package typingsSlinky.massive.mod

import typingsSlinky.massive.massiveStrings.ASC
import typingsSlinky.massive.massiveStrings.DESC
import typingsSlinky.massive.massiveStrings.FIRST
import typingsSlinky.massive.massiveStrings.LAST
import typingsSlinky.massive.massiveStrings.asc_
import typingsSlinky.massive.massiveStrings.desc_
import typingsSlinky.massive.massiveStrings.first_
import typingsSlinky.massive.massiveStrings.last_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderingOptions extends StObject {
  
  var direction: js.UndefOr[ASC | asc_ | DESC | desc_] = js.native
  
  var expr: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var nulls: js.UndefOr[FIRST | first_ | LAST | last_] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OrderingOptions {
  
  @scala.inline
  def apply(): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderingOptions]
  }
  
  @scala.inline
  implicit class OrderingOptionsMutableBuilder[Self <: OrderingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: ASC | asc_ | DESC | desc_): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setNulls(value: FIRST | first_ | LAST | last_): Self = StObject.set(x, "nulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullsUndefined: Self = StObject.set(x, "nulls", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
