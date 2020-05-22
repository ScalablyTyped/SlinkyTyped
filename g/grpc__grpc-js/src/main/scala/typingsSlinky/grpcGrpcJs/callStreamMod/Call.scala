package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Call extends js.Object {
  def cancelWithStatus(status: Status, details: String): Unit
  def getCredentials(): CallCredentials
  def getDeadline(): Deadline
  def getHost(): String
  def getMethod(): String
  def getPeer(): String
  def halfClose(): Unit
  def sendMessageWithContext(context: MessageContext, message: Buffer): Unit
  def setCredentials(credentials: CallCredentials): Unit
  def start(metadata: Metadata, listener: InterceptingListener): Unit
  def startRead(): Unit
}

object Call {
  @scala.inline
  def apply(
    cancelWithStatus: (Status, String) => Unit,
    getCredentials: () => CallCredentials,
    getDeadline: () => Deadline,
    getHost: () => String,
    getMethod: () => String,
    getPeer: () => String,
    halfClose: () => Unit,
    sendMessageWithContext: (MessageContext, Buffer) => Unit,
    setCredentials: CallCredentials => Unit,
    start: (Metadata, InterceptingListener) => Unit,
    startRead: () => Unit
  ): Call = {
    val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), halfClose = js.Any.fromFunction0(halfClose), sendMessageWithContext = js.Any.fromFunction2(sendMessageWithContext), setCredentials = js.Any.fromFunction1(setCredentials), start = js.Any.fromFunction2(start), startRead = js.Any.fromFunction0(startRead))
    __obj.asInstanceOf[Call]
  }
}

