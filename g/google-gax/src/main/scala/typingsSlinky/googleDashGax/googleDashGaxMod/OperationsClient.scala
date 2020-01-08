package typingsSlinky.googleDashGax.googleDashGaxMod

import typingsSlinky.googleDashGax.buildSrcOperationsClientMod.OperationsClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "OperationsClient")
@js.native
class OperationsClient protected ()
  extends typingsSlinky.googleDashGax.buildSrcOperationsClientMod.OperationsClient {
  def this(
    gaxGrpc: typingsSlinky.googleDashGax.buildSrcFallbackMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
  def this(
    gaxGrpc: typingsSlinky.googleDashGax.buildSrcGrpcMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
}

