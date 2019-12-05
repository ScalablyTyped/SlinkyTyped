package typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.MetadataOptions
import typingsSlinky.node.http2Mod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "Metadata")
@js.native
class Metadata ()
  extends typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata {
  def this(options: MetadataOptions) = this()
}

/* static members */
@JSImport("@grpc/grpc-js", "Metadata")
@js.native
object Metadata extends js.Object {
  /**
    * Returns a new Metadata object based fields in a given IncomingHttpHeaders
    * object.
    * @param headers An IncomingHttpHeaders object.
    */
  def fromHttp2Headers(headers: IncomingHttpHeaders): typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata = js.native
}

