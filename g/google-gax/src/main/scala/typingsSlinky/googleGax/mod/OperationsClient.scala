package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.operationsClientMod.OperationsClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "OperationsClient")
@js.native
class OperationsClient protected ()
  extends typingsSlinky.googleGax.operationsClientMod.OperationsClient {
  def this(
    gaxGrpc: typingsSlinky.googleGax.fallbackMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
  def this(
    gaxGrpc: typingsSlinky.googleGax.grpcMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
}

