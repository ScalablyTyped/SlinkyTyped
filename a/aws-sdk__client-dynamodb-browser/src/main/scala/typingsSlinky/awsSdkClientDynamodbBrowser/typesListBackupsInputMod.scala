package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBackupsInputMod {
  
  @js.native
  trait ListBackupsInput extends InputTypesUnion {
    
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
      * <p>The backups from the table specified by <code>BackupType</code> are listed.</p> <p>Where <code>BackupType</code> can be:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> <li> <p> <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).</p> </li> </ul>
      */
    var BackupType: js.UndefOr[USER | SYSTEM | ALL | String] = js.native
    
    /**
      * <p> <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p>
      */
    var ExclusiveStartBackupArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Maximum number of backups to return at once.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    
    /**
      * <p>The backups from the table specified by <code>TableName</code> are listed. </p>
      */
    var TableName: js.UndefOr[String] = js.native
    
    /**
      * <p>Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.</p>
      */
    var TimeRangeLowerBound: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive. </p>
      */
    var TimeRangeUpperBound: js.UndefOr[js.Date | String | Double] = js.native
  }
  object ListBackupsInput {
    
    @scala.inline
    def apply(): ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBackupsInput]
    }
    
    @scala.inline
    implicit class ListBackupsInputMutableBuilder[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
      
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
      def setBackupType(value: USER | SYSTEM | ALL | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      @scala.inline
      def setExclusiveStartBackupArn(value: String): Self = StObject.set(x, "ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartBackupArnUndefined: Self = StObject.set(x, "ExclusiveStartBackupArn", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTimeRangeLowerBound(value: js.Date | String | Double): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeLowerBoundDate(value: js.Date): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeLowerBoundUndefined: Self = StObject.set(x, "TimeRangeLowerBound", js.undefined)
      
      @scala.inline
      def setTimeRangeUpperBound(value: js.Date | String | Double): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeUpperBoundDate(value: js.Date): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeUpperBoundUndefined: Self = StObject.set(x, "TimeRangeUpperBound", js.undefined)
    }
  }
}
