package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreTableFromBackupInputMod {
  
  @js.native
  trait RestoreTableFromBackupInput extends InputTypesUnion {
    
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
      * <p>The ARN associated with the backup.</p>
      */
    var BackupArn: String = js.native
    
    /**
      * <p>The name of the new table to which the backup must be restored.</p>
      */
    var TargetTableName: String = js.native
  }
  object RestoreTableFromBackupInput {
    
    @scala.inline
    def apply(BackupArn: String, TargetTableName: String): RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableFromBackupInput]
    }
    
    @scala.inline
    implicit class RestoreTableFromBackupInputMutableBuilder[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
      
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
      def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTableName(value: String): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    }
  }
}
