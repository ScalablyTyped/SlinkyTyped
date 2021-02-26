package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayUniqueOptions extends StObject {
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
}
object ArrayUniqueOptions {
  
  @scala.inline
  def apply(): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
  
  @scala.inline
  implicit class ArrayUniqueOptionsMutableBuilder[Self <: ArrayUniqueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
  }
}
