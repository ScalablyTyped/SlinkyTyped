package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullListener extends js.Object {
  
  def onReceiveMessage(message: js.Any, next: js.Function1[/* message */ js.Any, Unit]): Unit = js.native
  @JSName("onReceiveMessage")
  var onReceiveMessage_Original: MessageListener = js.native
  
  def onReceiveMetadata(metadata: Metadata, next: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  @JSName("onReceiveMetadata")
  var onReceiveMetadata_Original: MetadataListener = js.native
  
  def onReceiveStatus(status: StatusObject, next: js.Function1[/* status */ StatusObject, Unit]): Unit = js.native
  @JSName("onReceiveStatus")
  var onReceiveStatus_Original: StatusListener = js.native
}
