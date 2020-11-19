package typingsSlinky.extjs.Ext.data.proxy

import typingsSlinky.extjs.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAjax extends IServer {
  
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the HTTP method name for a given request
    * @param request Ext.data.Request The request object
    * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE')
    */
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
}
object IAjax {
  
  @scala.inline
  def apply(): IAjax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjax]
  }
  
  @scala.inline
  implicit class IAjaxOps[Self <: IAjax] (val x: Self) extends AnyVal {
    
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
    def setActionMethods(value: js.Any): Self = this.set("actionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionMethods: Self = this.set("actionMethods", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = this.set("getMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
