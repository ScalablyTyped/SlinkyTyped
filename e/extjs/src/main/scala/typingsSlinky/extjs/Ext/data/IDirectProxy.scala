package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.data.proxy.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectProxy extends IServer {
  
  /** [Method] inherit docs
    * @returns String The url
    */
  @JSName("buildUrl")
  var buildUrl_IDirectProxy: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("doRequest")
  var doRequest_IDirectProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
}
object IDirectProxy {
  
  @scala.inline
  def apply(): IDirectProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectProxy]
  }
  
  @scala.inline
  implicit class IDirectProxyOps[Self <: IDirectProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildUrl(value: () => String): Self = this.set("buildUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBuildUrl: Self = this.set("buildUrl", js.undefined)
    
    @scala.inline
    def setDirectFn(value: js.Any): Self = this.set("directFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectFn: Self = this.set("directFn", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    
    @scala.inline
    def setParamOrder(value: js.Any): Self = this.set("paramOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamOrder: Self = this.set("paramOrder", js.undefined)
    
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = this.set("paramsAsHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamsAsHash: Self = this.set("paramsAsHash", js.undefined)
  }
}
