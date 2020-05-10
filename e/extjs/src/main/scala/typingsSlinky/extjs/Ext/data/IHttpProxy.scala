package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.data.proxy.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpProxy extends IServer {
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

object IHttpProxy {
  @scala.inline
  def apply(): IHttpProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpProxy]
  }
  @scala.inline
  implicit class IHttpProxyOps[Self <: IHttpProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

