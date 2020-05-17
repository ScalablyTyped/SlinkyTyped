package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.anon.PartialStatusObject
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/status-builder", JSImport.Namespace)
@js.native
object statusBuilderMod extends js.Object {
  @js.native
  class StatusBuilder () extends js.Object {
    var code: js.Any = js.native
    var details: js.Any = js.native
    var metadata: js.Any = js.native
    /**
      * Builds the status object.
      */
    def build(): PartialStatusObject = js.native
    /**
      * Adds a status code to the builder.
      */
    def withCode(code: Status): this.type = js.native
    /**
      * Adds details to the builder.
      */
    def withDetails(details: String): this.type = js.native
    /**
      * Adds metadata to the builder.
      */
    def withMetadata(metadata: Metadata): this.type = js.native
  }
  
}

