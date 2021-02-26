package typingsSlinky.layuiSrc.layui

import typingsSlinky.layuiSrc.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerTabOptions extends LayerOptions {
  
  var tab: js.Array[Content] = js.native
}
object LayerTabOptions {
  
  @scala.inline
  def apply(tab: js.Array[Content]): LayerTabOptions = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerTabOptions]
  }
  
  @scala.inline
  implicit class LayerTabOptionsMutableBuilder[Self <: LayerTabOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: js.Array[Content]): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabVarargs(value: Content*): Self = StObject.set(x, "tab", js.Array(value :_*))
  }
}
