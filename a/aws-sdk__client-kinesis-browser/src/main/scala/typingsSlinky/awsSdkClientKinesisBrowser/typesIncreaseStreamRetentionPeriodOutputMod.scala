package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIncreaseStreamRetentionPeriodOutputMod {
  
  @js.native
  trait IncreaseStreamRetentionPeriodOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
  }
  object IncreaseStreamRetentionPeriodOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): IncreaseStreamRetentionPeriodOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncreaseStreamRetentionPeriodOutput]
    }
    
    @scala.inline
    implicit class IncreaseStreamRetentionPeriodOutputMutableBuilder[Self <: IncreaseStreamRetentionPeriodOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
