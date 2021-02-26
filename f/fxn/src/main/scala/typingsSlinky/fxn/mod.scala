package typingsSlinky.fxn

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fxn", "Application")
  @js.native
  abstract class Application protected () extends StObject {
    def this(string: String) = this()
    
    var send: js.Function = js.native
  }
  
  @JSImport("fxn", "Controller")
  @js.native
  abstract class Controller protected () extends StObject {
    def this(path: String, method: String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
    
    var _headers: js.Object = js.native
    
    var _method: HttpMethod = js.native
    
    var _path: String = js.native
    
    var _requestHeaders: js.Object = js.native
    
    var _responder: js.Function = js.native
    
    var _securityPolicies: js.Object = js.native
    
    var _status: Double = js.native
    
    def after(): Unit = js.native
    
    def allowOrigin(value: String): this.type = js.native
    
    def appendHeader(key: String, value: String): String = js.native
    
    def before(): Unit = js.native
    
    def code(code: Double): Double = js.native
    
    def convertMethod(method: HttpMethod, id: Double): String = js.native
    
    def create(): Unit = js.native
    
    def del(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get(): Unit = js.native
    
    def getHeader(key: String, value: String): String = js.native
    
    def getStatus(): Double = js.native
    
    def index(): Unit = js.native
    
    def notImplemented(msg: String, details: js.Object): Boolean = js.native
    
    def options(): Unit = js.native
    
    var params: js.Any = js.native
    
    def post(): Unit = js.native
    
    def put(): Unit = js.native
    
    def redirect(location: String): Unit = js.native
    
    def render(data: String): Unit = js.native
    def render(data: js.Object): Unit = js.native
    def render(data: Buffer): Unit = js.native
    
    def run(): Unit = js.native
    
    def securityPolicy(directive: String, src: String): String = js.native
    
    def setHeader(key: String, value: String): String = js.native
    
    def setHeaders(): HttpHeaders = js.native
    
    def show(): Unit = js.native
    
    def status(value: Double): Boolean = js.native
    
    def update(): Unit = js.native
  }
  
  @JSImport("fxn", "Daemon")
  @js.native
  abstract class Daemon protected () extends StObject {
    def this(string: String) = this()
  }
  
  @JSImport("fxn", "Router")
  @js.native
  abstract class Router () extends StObject
  
  @JSImport("fxn", "Scheduler")
  @js.native
  abstract class Scheduler () extends StObject
  
  type HttpHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fxn.fxnStrings.GET
    - typingsSlinky.fxn.fxnStrings.POST
    - typingsSlinky.fxn.fxnStrings.PUT
    - typingsSlinky.fxn.fxnStrings.DELETE
    - typingsSlinky.fxn.fxnStrings.OPTIONS
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def DELETE: typingsSlinky.fxn.fxnStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.fxn.fxnStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.fxn.fxnStrings.GET = "GET".asInstanceOf[typingsSlinky.fxn.fxnStrings.GET]
    
    @scala.inline
    def OPTIONS: typingsSlinky.fxn.fxnStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.fxn.fxnStrings.OPTIONS]
    
    @scala.inline
    def POST: typingsSlinky.fxn.fxnStrings.POST = "POST".asInstanceOf[typingsSlinky.fxn.fxnStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.fxn.fxnStrings.PUT = "PUT".asInstanceOf[typingsSlinky.fxn.fxnStrings.PUT]
  }
}
