package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchStrategySymbol extends EnumSymbol {
  
  var foo: js.Any = js.native
}
object FetchStrategySymbol {
  
  @scala.inline
  def apply(foo: js.Any, getName: () => String, parentEnum: IEnum): FetchStrategySymbol = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStrategySymbol]
  }
  
  @scala.inline
  implicit class FetchStrategySymbolMutableBuilder[Self <: FetchStrategySymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoo(value: js.Any): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
  }
}
