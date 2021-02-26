package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.addTagsToStreamExceptionsUnionMod.AddTagsToStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.createStreamExceptionsUnionMod.CreateStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.decreaseStreamRetentionPeriodExceptionsUnionMod.DecreaseStreamRetentionPeriodExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.deleteStreamExceptionsUnionMod.DeleteStreamExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.disableEnhancedMonitoringExceptionsUnionMod.DisableEnhancedMonitoringExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.enableEnhancedMonitoringExceptionsUnionMod.EnableEnhancedMonitoringExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.increaseStreamRetentionPeriodExceptionsUnionMod.IncreaseStreamRetentionPeriodExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
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

object typesResourceInUseExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceInUseExceptionDetails> * / any */ @js.native
  trait ResourceInUseException
    extends AddTagsToStreamExceptionsUnion
       with CreateStreamExceptionsUnion
       with DecreaseStreamRetentionPeriodExceptionsUnion
       with DeleteStreamExceptionsUnion
       with DisableEnhancedMonitoringExceptionsUnion
       with EnableEnhancedMonitoringExceptionsUnion
       with IncreaseStreamRetentionPeriodExceptionsUnion
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion
       with MergeShardsExceptionsUnion
       with RegisterStreamConsumerExceptionsUnion
       with RemoveTagsFromStreamExceptionsUnion
       with SplitShardExceptionsUnion
       with StartStreamEncryptionExceptionsUnion
       with StopStreamEncryptionExceptionsUnion
       with UpdateShardCountExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException = js.native
  }
  object ResourceInUseException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException
    ): ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceInUseException]
    }
    
    @scala.inline
    implicit class ResourceInUseExceptionMutableBuilder[Self <: ResourceInUseException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceInUseExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ResourceInUseExceptionDetails {
    
    @scala.inline
    def apply(): ResourceInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceInUseExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceInUseExceptionDetailsMutableBuilder[Self <: ResourceInUseExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
