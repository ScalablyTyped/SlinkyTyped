package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreTableToPointInTimeInputMod {
  
  @js.native
  trait RestoreTableToPointInTimeInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>Time in the past to restore the table to.</p>
      */
    var RestoreDateTime: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>Name of the source table that is being restored.</p>
      */
    var SourceTableName: String = js.native
    
    /**
      * <p>The name of the new table to which it must be restored to.</p>
      */
    var TargetTableName: String = js.native
    
    /**
      * <p>Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    var UseLatestRestorableTime: js.UndefOr[Boolean] = js.native
  }
  object RestoreTableToPointInTimeInput {
    
    @scala.inline
    def apply(SourceTableName: String, TargetTableName: String): RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableToPointInTimeInput]
    }
    
    @scala.inline
    implicit class RestoreTableToPointInTimeInputMutableBuilder[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setRestoreDateTime(value: js.Date | String | Double): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreDateTimeDate(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
      
      @scala.inline
      def setSourceTableName(value: String): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTableName(value: String): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLatestRestorableTime(value: Boolean): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
    }
  }
}
