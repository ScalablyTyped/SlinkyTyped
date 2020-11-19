package typingsSlinky.grpcGrpcJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  
  def apply(
    client: typingsSlinky.grpcGrpcJs.clientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(
    client: typingsSlinky.grpcGrpcJs.clientMod.Client,
    deadline: js.Date,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}
