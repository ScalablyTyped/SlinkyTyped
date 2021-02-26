package typingsSlinky.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxOptions extends ScrollableTextOptions {
  
  var bindings: js.UndefOr[js.Any] = js.native
}
object BoxOptions {
  
  @scala.inline
  def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  
  @scala.inline
  implicit class BoxOptionsMutableBuilder[Self <: BoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Any): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
  }
}
