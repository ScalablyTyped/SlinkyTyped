package typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  def apply(
    client: typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(
    client: typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.Client,
    deadline: Date,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

