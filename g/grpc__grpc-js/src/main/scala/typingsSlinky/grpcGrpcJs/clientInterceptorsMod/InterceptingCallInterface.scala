package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import typingsSlinky.grpcGrpcJs.anon.PartialInterceptingListen
import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.callStreamMod.MessageContext
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptingCallInterface extends js.Object {
  def cancelWithStatus(status: Status, details: String): Unit = js.native
  def getPeer(): String = js.native
  def halfClose(): Unit = js.native
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessageWithContext(context: MessageContext, message: js.Any): Unit = js.native
  def setCredentials(credentials: CallCredentials): Unit = js.native
  def start(metadata: Metadata): Unit = js.native
  def start(metadata: Metadata, listener: PartialInterceptingListen): Unit = js.native
  def startRead(): Unit = js.native
}

