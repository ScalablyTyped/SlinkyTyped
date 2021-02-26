package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLifecycleConfigurationOutputMod {
  
  @js.native
  trait GetBucketLifecycleConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _LifecycleRules shape
      */
    var Rules: js.UndefOr[js.Array[UnmarshalledLifecycleRule]] = js.native
  }
  object GetBucketLifecycleConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketLifecycleConfigurationOutputMutableBuilder[Self <: GetBucketLifecycleConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
