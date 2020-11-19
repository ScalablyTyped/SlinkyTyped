package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiBoom.mod.Boom
import typingsSlinky.hapiHapi.mod.PluginsStates
import typingsSlinky.hapiHapi.mod.RequestApplicationState
import typingsSlinky.hapiHapi.mod.RequestAuth
import typingsSlinky.hapiHapi.mod.RequestEvents
import typingsSlinky.hapiHapi.mod.RequestInfo
import typingsSlinky.hapiHapi.mod.RequestLog
import typingsSlinky.hapiHapi.mod.RequestOrig
import typingsSlinky.hapiHapi.mod.RequestQuery
import typingsSlinky.hapiHapi.mod.RequestRoute
import typingsSlinky.hapiHapi.mod.ResponseObject
import typingsSlinky.hapiHapi.mod.Server_
import typingsSlinky.hapiHapi.mod.Util.Dictionary
import typingsSlinky.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import typingsSlinky.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import typingsSlinky.hapiPodium.mod.Events
import typingsSlinky.hapiPodium.mod.Listener
import typingsSlinky.hapiPodium.mod.Podium
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@hapi/hapi.@hapi/hapi.Request> */
@js.native
trait ReadonlyRequest extends js.Object {
  
  def active(): Boolean = js.native
  
  def addListener(criteria: String, listener: Listener): Unit = js.native
  
  val app: RequestApplicationState = js.native
  
  val auth: RequestAuth = js.native
  
  def emit(criteria: String, data: js.Any): Unit = js.native
  
  val events: RequestEvents = js.native
  
  def generateResponse(): ResponseObject = js.native
  def generateResponse(source: String): ResponseObject = js.native
  def generateResponse(source: String, options: Close): ResponseObject = js.native
  def generateResponse(source: js.Object): ResponseObject = js.native
  def generateResponse(source: js.Object, options: Close): ResponseObject = js.native
  def generateResponse(source: Null, options: Close): ResponseObject = js.native
  
  def hasListeners(name: String): Boolean = js.native
  
  val headers: Dictionary[String] = js.native
  
  val info: RequestInfo = js.native
  
  def log(tags: String): Unit = js.native
  def log(tags: String, data: String): Unit = js.native
  def log(tags: String, data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: String, data: js.Object): Unit = js.native
  def log(tags: js.Array[String]): Unit = js.native
  def log(tags: js.Array[String], data: String): Unit = js.native
  def log(tags: js.Array[String], data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: js.Array[String], data: js.Object): Unit = js.native
  
  val logs: js.Array[RequestLog] = js.native
  
  val method: HTTP_METHODS_PARTIAL_LOWERCASE = js.native
  
  val mime: String = js.native
  
  def on(criteria: String, listener: Listener): Unit = js.native
  
  def once(criteria: String, listener: Listener): Unit = js.native
  
  val orig: RequestOrig = js.native
  
  val params: Dictionary[String] = js.native
  
  val paramsArray: js.Array[String] = js.native
  
  val path: String = js.native
  
  val payload: Readable | Buffer | String | js.Object = js.native
  
  val plugins: PluginsStates = js.native
  
  val pre: Dictionary[_] = js.native
  
  val preResponses: Dictionary[_] = js.native
  
  val query: RequestQuery = js.native
  
  val raw: Req = js.native
  
  def registerEvent(events: js.Array[Events]): Unit = js.native
  
  def registerPodium(podiums: js.Array[Podium]): Unit = js.native
  
  def removeAllListeners(name: String): Podium = js.native
  
  def removeListener(name: String, listener: Listener): Podium = js.native
  
  val response: ResponseObject | Boom[_] = js.native
  
  val route: RequestRoute = js.native
  
  val server: Server_ = js.native
  
  def setMethod(method: HTTP_METHODS_PARTIAL): Unit = js.native
  
  def setUrl(url: String): Unit = js.native
  def setUrl(url: String, stripTrailingSlash: Boolean): Unit = js.native
  def setUrl(url: URL_): Unit = js.native
  def setUrl(url: URL_, stripTrailingSlash: Boolean): Unit = js.native
  
  val state: Dictionary[_] = js.native
  
  val url: URL_ = js.native
}
