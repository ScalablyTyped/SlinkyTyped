package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleMod.LifecycleRule
import typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketLifecycleConfigurationMod {
  
  @js.native
  trait BucketLifecycleConfiguration extends StObject {
    
    /**
      * _LifecycleRules shape
      */
    var Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule] = js.native
  }
  object BucketLifecycleConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): BucketLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfiguration]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationMutableBuilder[Self <: BucketLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesIterable(value: js.Iterable[LifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledBucketLifecycleConfiguration extends BucketLifecycleConfiguration {
    
    /**
      * _LifecycleRules shape
      */
    @JSName("Rules")
    var Rules_UnmarshalledBucketLifecycleConfiguration: js.Array[UnmarshalledLifecycleRule] = js.native
  }
  object UnmarshalledBucketLifecycleConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[UnmarshalledLifecycleRule]): UnmarshalledBucketLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledBucketLifecycleConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledBucketLifecycleConfigurationMutableBuilder[Self <: UnmarshalledBucketLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
