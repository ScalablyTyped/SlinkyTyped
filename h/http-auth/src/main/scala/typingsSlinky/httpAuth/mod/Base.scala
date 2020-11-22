package typingsSlinky.httpAuth.mod

import typingsSlinky.httpAuth.httpAuthBooleans.`false`
import typingsSlinky.httpAuth.httpAuthBooleans.`true`
import typingsSlinky.httpAuth.httpAuthStrings.error
import typingsSlinky.httpAuth.httpAuthStrings.fail
import typingsSlinky.httpAuth.httpAuthStrings.success
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends EventEmitter {
  
  /* private */ def ask(res: ServerResponse, result: BasicResult[Boolean]): Unit = js.native
  /* private */ def ask(res: ServerResponse, result: DigestResult[Boolean]): Unit = js.native
  
  def check(): CheckedRequestListener = js.native
  def check(callback: CheckedRequestListener): CheckedRequestListener = js.native
  
  def findUser(req: IncomingMessage, hashOrClientOptions: String, callback: ResultEmitter): Unit = js.native
  def findUser(req: IncomingMessage, hashOrClientOptions: ClientOptions, callback: ResultEmitter): Unit = js.native
  
  def generateHeader(): String = js.native
  def generateHeader(result: DigestResult[Boolean]): String = js.native
  
  /* private */ def isAuthenticated(req: IncomingMessage, callback: ResultEmitter): Unit = js.native
  
  /* private */ def loadUsers(): Unit = js.native
  
  def on(
    event: fail,
    callback: js.Function1[/* result */ BasicResult[`false`] | DigestResult[`false`], Unit]
  ): this.type = js.native
  def on(
    event: success,
    callback: js.Function1[/* result */ BasicResult[`true`] | DigestResult[`true`], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  
  def parseAuthorization(header: String): js.UndefOr[String | ClientOptions] = js.native
  
  def processLine(userLine: String): Unit = js.native
}
