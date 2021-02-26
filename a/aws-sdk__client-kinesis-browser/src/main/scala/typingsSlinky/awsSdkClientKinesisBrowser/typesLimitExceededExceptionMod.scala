package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.addTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.createStreamExceptionsUnionMod.CreateStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.decreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.deleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.deregisterStreamConsumerExceptionsUnionMod.DeregisterStreamConsumerExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.describeStreamConsumerExceptionsUnionMod.DescribeStreamConsumerExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.describeStreamExceptionsUnionMod.DescribeStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.describeStreamSummaryExceptionsUnionMod.DescribeStreamSummaryExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.disableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.enableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.increaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listTagsForStreamExceptionsUnionMod.ListTagsForStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.mergeShardsExceptionsUnionMod.MergeShardsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.registerStreamConsumerExceptionsUnionMod.RegisterStreamConsumerExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.removeTagsFromStreamExceptionsUnionMod.RemoveTagsFromStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.splitShardExceptionsUnionMod.SplitShardExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.stopStreamEncryptionExceptionsUnionMod.StopStreamEncryptionExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.updateShardCountExceptionsUnionMod.UpdateShardCountExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ @js.native
  trait LimitExceededException
    extends AddTagsToStreamExceptionsUnion
       with CreateStreamExceptionsUnion
       with DecreaseStreamRetentionPeriodExceptionsUnion
       with DeleteStreamExceptionsUnion
       with DeregisterStreamConsumerExceptionsUnion
       with DescribeStreamConsumerExceptionsUnion
       with DescribeStreamExceptionsUnion
       with DescribeStreamSummaryExceptionsUnion
       with DisableEnhancedMonitoringExceptionsUnion
       with EnableEnhancedMonitoringExceptionsUnion
       with IncreaseStreamRetentionPeriodExceptionsUnion
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion
       with ListTagsForStreamExceptionsUnion
       with MergeShardsExceptionsUnion
       with RegisterStreamConsumerExceptionsUnion
       with RemoveTagsFromStreamExceptionsUnion
       with SplitShardExceptionsUnion
       with StartStreamEncryptionExceptionsUnion
       with StopStreamEncryptionExceptionsUnion
       with UpdateShardCountExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException = js.native
  }
  object LimitExceededException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
    ): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitExceededException]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionMutableBuilder[Self <: LimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object LimitExceededExceptionDetails {
    
    @scala.inline
    def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionDetailsMutableBuilder[Self <: LimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
