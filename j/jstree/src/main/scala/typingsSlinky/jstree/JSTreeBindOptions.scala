package typingsSlinky.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeBindOptions extends StObject {
  
  var args: js.UndefOr[js.Any] = js.native
  
  var inst: js.UndefOr[js.Any] = js.native
  
  var rlbk: js.UndefOr[js.Any] = js.native
  
  var rslt: js.UndefOr[js.Any] = js.native
}
object JSTreeBindOptions {
  
  @scala.inline
  def apply(): JSTreeBindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeBindOptions]
  }
  
  @scala.inline
  implicit class JSTreeBindOptionsMutableBuilder[Self <: JSTreeBindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setInst(value: js.Any): Self = StObject.set(x, "inst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstUndefined: Self = StObject.set(x, "inst", js.undefined)
    
    @scala.inline
    def setRlbk(value: js.Any): Self = StObject.set(x, "rlbk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRlbkUndefined: Self = StObject.set(x, "rlbk", js.undefined)
    
    @scala.inline
    def setRslt(value: js.Any): Self = StObject.set(x, "rslt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsltUndefined: Self = StObject.set(x, "rslt", js.undefined)
  }
}
