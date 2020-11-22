package typingsSlinky.s3Streams.mod

import typingsSlinky.awsSdk.mod.S3
import typingsSlinky.awsSdk.s3Mod.CreateMultipartUploadRequest
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("s3-streams", "WriteStream")
@js.native
class WriteStream protected () extends Writable {
  def this(client: S3, options: CreateMultipartUploadRequest) = this()
  def this(client: S3, options: CreateMultipartUploadRequest, streamOptions: StreamOptions) = this()
}
