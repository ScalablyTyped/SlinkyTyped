package typingsSlinky.s3Streams

import typingsSlinky.awsSdk.mod.S3
import typingsSlinky.awsSdk.s3Mod.CreateMultipartUploadRequest
import typingsSlinky.awsSdk.s3Mod.GetObjectRequest
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3-streams", "ReadStream")
  @js.native
  class ReadStream protected () extends Readable {
    def this(client: S3, options: GetObjectRequest) = this()
    def this(client: S3, options: GetObjectRequest, streamOptions: StreamOptions) = this()
  }
  
  @JSImport("s3-streams", "WriteStream")
  @js.native
  class WriteStream protected () extends Writable {
    def this(client: S3, options: CreateMultipartUploadRequest) = this()
    def this(client: S3, options: CreateMultipartUploadRequest, streamOptions: StreamOptions) = this()
  }
  
  @js.native
  trait StreamOptions extends StObject {
    
    /**
      * Number of bytes to read or write before emitting a chunk to the stream.
      * Must be above 5MB for {@link WriteStream}
      *
      * @default 4MB for {@link ReadStream}
      * @default 10MB for {@link WriteStream}
      */
    var highWaterMark: js.UndefOr[Double] = js.native
  }
  object StreamOptions {
    
    @scala.inline
    def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
}
