package typingsSlinky.atGrpcGrpcDashJs.buildSrcClientDashInterceptorsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials
import typingsSlinky.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptingCallInterface extends js.Object {
  def cancelWithStatus(status: Status, details: String): Unit = js.native
  def getPeer(): String = js.native
  def halfClose(): Unit = js.native
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessageWithContext(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageContext */ js.Any,
    message: js.Any
  ): Unit = js.native
  def setCredentials(credentials: CallCredentials): Unit = js.native
  def start(metadata: Metadata): Unit = js.native
  def start(
    metadata: Metadata,
    listener: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterceptingListener */ _
    ]
  ): Unit = js.native
  def startRead(): Unit = js.native
}

