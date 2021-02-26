package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequest extends IBase {
  
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}
object IRequest {
  
  @scala.inline
  def apply(): IRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequest]
  }
  
  @scala.inline
  implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
