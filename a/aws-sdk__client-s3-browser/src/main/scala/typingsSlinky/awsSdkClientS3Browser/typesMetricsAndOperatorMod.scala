package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsAndOperatorMod {
  
  @js.native
  trait MetricsAndOperator extends StObject {
    
    /**
      * <p>The prefix used when evaluating an AND predicate.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>The list of tags used when evaluating an AND predicate.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.native
  }
  object MetricsAndOperator {
    
    @scala.inline
    def apply(): MetricsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricsAndOperator]
    }
    
    @scala.inline
    implicit class MetricsAndOperatorMutableBuilder[Self <: MetricsAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[Tag] | js.Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsIterable(value: js.Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledMetricsAndOperator extends MetricsAndOperator {
    
    /**
      * <p>The list of tags used when evaluating an AND predicate.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
  }
  object UnmarshalledMetricsAndOperator {
    
    @scala.inline
    def apply(): UnmarshalledMetricsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMetricsAndOperator]
    }
    
    @scala.inline
    implicit class UnmarshalledMetricsAndOperatorMutableBuilder[Self <: UnmarshalledMetricsAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
