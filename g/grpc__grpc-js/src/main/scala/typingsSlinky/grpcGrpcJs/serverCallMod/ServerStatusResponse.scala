package typingsSlinky.grpcGrpcJs.serverCallMod

import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> */
trait ServerStatusResponse extends js.Object {
  var code: js.UndefOr[Status] = js.undefined
  var details: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
}

object ServerStatusResponse {
  @scala.inline
  def apply(code: Status = null, details: String = null, metadata: Metadata = null): ServerStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStatusResponse]
  }
}

