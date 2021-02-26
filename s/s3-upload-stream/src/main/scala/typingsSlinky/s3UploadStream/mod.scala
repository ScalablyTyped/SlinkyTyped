package typingsSlinky.s3UploadStream

import typingsSlinky.awsSdk.mod.S3
import typingsSlinky.awsSdk.s3Mod.PutObjectRequest
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3-upload-stream", JSImport.Namespace)
  @js.native
  def apply(client: S3): S3StreamUploader = js.native
  
  @js.native
  trait S3StreamUploader extends StObject {
    
    def upload(destinationDetails: PutObjectRequest): S3WriteStream = js.native
    def upload(destinationDetails: PutObjectRequest, sessionDetails: js.Any): S3WriteStream = js.native
  }
  
  @js.native
  trait S3WriteStream extends Writable {
    
    def concurrentParts(numberOfParts: Double): Unit = js.native
    
    def maxPartSize(sizeInBytes: Double): Unit = js.native
  }
}
