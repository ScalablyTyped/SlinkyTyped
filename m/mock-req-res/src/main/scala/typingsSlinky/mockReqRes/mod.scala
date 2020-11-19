package typingsSlinky.mockReqRes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.sinon.mod.SinonSpy
import typingsSlinky.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-req-res", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Mock = js.native
  
  def mockRequest(): RequestOutput = js.native
  def mockRequest(options: RequestPayload): RequestOutput = js.native
  
  def mockResponse(): ResponseOutput = js.native
  def mockResponse(options: ResponsePayload): ResponseOutput = js.native
  
  @js.native
  trait Mock extends js.Object {
    
    def mockRequest(): RequestOutput = js.native
    def mockRequest(options: RequestPayload): RequestOutput = js.native
    
    def mockResponse(): ResponseOutput = js.native
    def mockResponse(options: ResponsePayload): ResponseOutput = js.native
  }
  
  @js.native
  trait RequestOutput
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    // Methods
    def get(args: js.Any*): js.Any = js.native
    @JSName("get")
    var get_Original: SinonStub = js.native
  }
  
  @js.native
  trait ResponseOutput
    extends Response[js.Any] {
    
    // Methods
    def clearCookie(args: js.Any*): js.Any = js.native
    @JSName("clearCookie")
    var clearCookie_Original: SinonSpy = js.native
    
    // Methods
    def cookie(args: js.Any*): js.Any = js.native
    @JSName("cookie")
    var cookie_Original: SinonSpy = js.native
    
    // Methods
    def download(args: js.Any*): js.Any = js.native
    @JSName("download")
    var download_Original: SinonSpy = js.native
    
    // Methods
    def end(args: js.Any*): js.Any = js.native
    @JSName("end")
    var end_Original: SinonSpy = js.native
    
    // Methods
    def format(args: js.Any*): js.Any = js.native
    @JSName("format")
    var format_Original: SinonSpy = js.native
    
    // Methods
    def get(args: js.Any*): js.Any = js.native
    
    // Methods
    def getHeader(args: js.Any*): js.Any = js.native
    @JSName("getHeader")
    var getHeader_Original: SinonSpy = js.native
    
    @JSName("get")
    var get_Original: SinonStub = js.native
    
    // Methods
    def json(args: js.Any*): js.Any = js.native
    @JSName("json")
    var json_Original_ResponseOutput: SinonSpy = js.native
    
    // Methods
    def jsonp(args: js.Any*): js.Any = js.native
    @JSName("jsonp")
    var jsonp_Original_ResponseOutput: SinonSpy = js.native
    
    // Methods
    def redirect(args: js.Any*): js.Any = js.native
    @JSName("redirect")
    var redirect_Original: SinonSpy = js.native
    
    // Methods
    def render(args: js.Any*): js.Any = js.native
    @JSName("render")
    var render_Original: SinonSpy = js.native
    
    // Methods
    def send(args: js.Any*): js.Any = js.native
    
    // Methods
    def sendFile(args: js.Any*): js.Any = js.native
    @JSName("sendFile")
    var sendFile_Original: SinonSpy = js.native
    
    // Methods
    def sendStatus(args: js.Any*): js.Any = js.native
    @JSName("sendStatus")
    var sendStatus_Original: SinonSpy = js.native
    
    @JSName("send")
    var send_Original_ResponseOutput: SinonSpy = js.native
    
    // Methods
    def set(args: js.Any*): js.Any = js.native
    
    // Methods
    def setHeader(args: js.Any*): js.Any = js.native
    @JSName("setHeader")
    var setHeader_Original: SinonSpy = js.native
    
    @JSName("set")
    var set_Original: SinonSpy = js.native
    
    // Methods
    def status(args: js.Any*): js.Any = js.native
    @JSName("status")
    var status_Original: SinonStub = js.native
    
    // Methods
    def `type`(args: js.Any*): js.Any = js.native
    @JSName("type")
    var type_Original: SinonSpy = js.native
    
    // Methods
    def vary(args: js.Any*): js.Any = js.native
    @JSName("vary")
    var vary_Original: SinonStub = js.native
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type RequestPayload = Dictionary[js.Any]
  
  type ResponsePayload = Dictionary[js.Any]
}
