package typingsSlinky.jsonRpcWs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  def close(): Unit = js.native
  def close(error: js.Any): Unit = js.native
  
  def hangup(): Unit = js.native
  def hangup(callback: js.Function0[Unit]): Unit = js.native
  
  var id: String = js.native
  
  def message(data: js.Any): Unit = js.native
  
  var parent: Base[_] = js.native
  
  def processPayload[ParamType](payload: Payload[ParamType]): Unit = js.native
  
  var responseHandlers: StringDictionary[ReplyCallback[_]] = js.native
  
  def sendError(error: js.Any): Unit = js.native
  def sendError(error: js.Any, id: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
  def sendError(error: js.Any, id: String): Unit = js.native
  def sendError(error: js.Any, id: String, data: js.Any): Unit = js.native
  
  def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType): Unit = js.native
  def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): Unit = js.native
  
  def sendRaw[ParamType](payload: Payload[ParamType]): Unit = js.native
  
  def sendResult(id: String): Unit = js.native
  def sendResult(id: String, error: js.UndefOr[scala.Nothing], result: js.Any): Unit = js.native
  def sendResult(id: String, error: js.Any): Unit = js.native
  def sendResult(id: String, error: js.Any, result: js.Any): Unit = js.native
  
  var socket: ^ = js.native
}
