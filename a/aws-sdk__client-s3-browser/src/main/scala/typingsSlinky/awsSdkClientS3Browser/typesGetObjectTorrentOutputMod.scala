package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetObjectTorrentOutputMod {
  
  @js.native
  trait GetObjectTorrentOutput[StreamType] extends MetadataBearer {
    
    /**
      * _Body shape
      */
    var Body: js.UndefOr[StreamType] = js.native
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  object GetObjectTorrentOutput {
    
    @scala.inline
    def apply[StreamType]($metadata: ResponseMetadata): GetObjectTorrentOutput[StreamType] = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectTorrentOutput[StreamType]]
    }
    
    @scala.inline
    implicit class GetObjectTorrentOutputMutableBuilder[Self <: GetObjectTorrentOutput[_], StreamType] (val x: Self with GetObjectTorrentOutput[StreamType]) extends AnyVal {
      
      @scala.inline
      def setBody(value: StreamType): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    }
  }
}
