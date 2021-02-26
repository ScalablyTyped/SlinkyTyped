package typingsSlinky.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasOptions[T /* <: IOptions */] extends StObject {
  
  var options: T = js.native
}
object IHasOptions {
  
  @scala.inline
  def apply[T /* <: IOptions */](options: T): IHasOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHasOptions[T]]
  }
  
  @scala.inline
  implicit class IHasOptionsMutableBuilder[Self <: IHasOptions[_], T /* <: IOptions */] (val x: Self with IHasOptions[T]) extends AnyVal {
    
    @scala.inline
    def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
