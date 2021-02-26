package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod.UnmarshalledApplicationSettingsResource
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateApplicationSettingsOutputMod {
  
  @js.native
  trait UpdateApplicationSettingsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * Application settings.
      */
    var ApplicationSettingsResource: UnmarshalledApplicationSettingsResource = js.native
  }
  object UpdateApplicationSettingsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ApplicationSettingsResource: UnmarshalledApplicationSettingsResource): UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateApplicationSettingsOutput]
    }
    
    @scala.inline
    implicit class UpdateApplicationSettingsOutputMutableBuilder[Self <: UpdateApplicationSettingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationSettingsResource(value: UnmarshalledApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
    }
  }
}
