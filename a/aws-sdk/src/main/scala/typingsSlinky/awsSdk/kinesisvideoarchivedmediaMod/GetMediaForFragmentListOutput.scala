package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMediaForFragmentListOutput extends StObject {
  
  /**
    * The content type of the requested media.
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ContentType] = js.native
  
  /**
    * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see PutMedia. The chunks that Kinesis Video Streams returns in the GetMediaForFragmentList call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.   The following tags will be included if an exception occurs:   AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception   AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception   AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception  
    */
  var Payload: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.Payload] = js.native
}
object GetMediaForFragmentListOutput {
  
  @scala.inline
  def apply(): GetMediaForFragmentListOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaForFragmentListOutput]
  }
  
  @scala.inline
  implicit class GetMediaForFragmentListOutputMutableBuilder[Self <: GetMediaForFragmentListOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
