package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.ArrayBuffer
import typingsSlinky.minappEnv.minappEnvStrings.CONNECT
import typingsSlinky.minappEnv.minappEnvStrings.DELETE
import typingsSlinky.minappEnv.minappEnvStrings.GET
import typingsSlinky.minappEnv.minappEnvStrings.HEAD
import typingsSlinky.minappEnv.minappEnvStrings.OPTIONS
import typingsSlinky.minappEnv.minappEnvStrings.POST
import typingsSlinky.minappEnv.minappEnvStrings.PUT
import typingsSlinky.minappEnv.minappEnvStrings.TRACE
import typingsSlinky.minappEnv.minappEnvStrings.arraybuffer_
import typingsSlinky.minappEnv.minappEnvStrings.json_
import typingsSlinky.minappEnv.minappEnvStrings.text
import typingsSlinky.minappEnv.minappEnvStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestCompleteCallback] = js.native
  
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.native
  
  /** 返回的数据格式
    *
    * 可选值：
    * - 'json': 返回的数据为 JSON，返回后会对返回的数据进行一次 JSON.parse;
    * - '其他': 不对返回的内容进行 JSON.parse; */
  var dataType: js.UndefOr[json_ | 其他] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFailCallback] = js.native
  
  /** 设置请求的 header，header 中不能设置 Referer。
    *
    * `content-type` 默认为 `application/json` */
  var header: js.UndefOr[js.Object] = js.native
  
  /** HTTP 请求方法
    *
    * 可选值：
    * - 'OPTIONS': HTTP 请求 OPTIONS;
    * - 'GET': HTTP 请求 GET;
    * - 'HEAD': HTTP 请求 HEAD;
    * - 'POST': HTTP 请求 POST;
    * - 'PUT': HTTP 请求 PUT;
    * - 'DELETE': HTTP 请求 DELETE;
    * - 'TRACE': HTTP 请求 TRACE;
    * - 'CONNECT': HTTP 请求 CONNECT; */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  
  /** 响应的数据类型
    *
    * 可选值：
    * - 'text': 响应的数据为文本;
    * - 'arraybuffer': 响应的数据为 ArrayBuffer;
    *
    * 最低基础库： `1.7.0` */
  var responseType: js.UndefOr[text | arraybuffer_] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSuccessCallback] = js.native
  
  /** 开发者服务器接口地址 */
  var url: String = js.native
}
object RequestOption {
  
  @scala.inline
  def apply(url: String): RequestOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOption]
  }
  
  @scala.inline
  implicit class RequestOptionOps[Self <: RequestOption] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Object | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataType(value: json_ | 其他): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setResponseType(value: text | arraybuffer_): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ RequestSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
