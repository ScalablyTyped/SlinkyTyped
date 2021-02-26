package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCampaignActivitiesOutputMod {
  
  @js.native
  trait GetCampaignActivitiesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Activities for campaign.
      */
    var ActivitiesResponse: UnmarshalledActivitiesResponse = js.native
  }
  object GetCampaignActivitiesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): GetCampaignActivitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCampaignActivitiesOutput]
    }
    
    @scala.inline
    implicit class GetCampaignActivitiesOutputMutableBuilder[Self <: GetCampaignActivitiesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivitiesResponse(value: UnmarshalledActivitiesResponse): Self = StObject.set(x, "ActivitiesResponse", value.asInstanceOf[js.Any])
    }
  }
}
