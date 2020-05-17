package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.callStreamMod.Deadline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  def apply(
    client: typingsSlinky.grpcGrpcJs.clientMod.Client,
    deadline: Deadline,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

