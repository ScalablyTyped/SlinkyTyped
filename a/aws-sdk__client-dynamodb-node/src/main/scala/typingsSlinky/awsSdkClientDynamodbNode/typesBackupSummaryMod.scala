package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupSummaryMod {
  
  @js.native
  trait BackupSummary extends StObject {
    
    /**
      * <p>ARN associated with the backup.</p>
      */
    var BackupArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Time at which the backup was created.</p>
      */
    var BackupCreationDateTime: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    var BackupExpiryDateTime: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>Name of the specified backup.</p>
      */
    var BackupName: js.UndefOr[String] = js.native
    
    /**
      * <p>Size of the backup in bytes.</p>
      */
    var BackupSizeBytes: js.UndefOr[Double] = js.native
    
    /**
      * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED.</p>
      */
    var BackupStatus: js.UndefOr[CREATING | DELETED | AVAILABLE | String] = js.native
    
    /**
      * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
      */
    var BackupType: js.UndefOr[USER | SYSTEM | String] = js.native
    
    /**
      * <p>ARN associated with the table.</p>
      */
    var TableArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Unique identifier for the table.</p>
      */
    var TableId: js.UndefOr[String] = js.native
    
    /**
      * <p>Name of the table.</p>
      */
    var TableName: js.UndefOr[String] = js.native
  }
  object BackupSummary {
    
    @scala.inline
    def apply(): BackupSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupSummary]
    }
    
    @scala.inline
    implicit class BackupSummaryMutableBuilder[Self <: BackupSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
      
      @scala.inline
      def setBackupCreationDateTime(value: js.Date | String | Double): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTimeDate(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
      
      @scala.inline
      def setBackupExpiryDateTime(value: js.Date | String | Double): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeDate(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      @scala.inline
      def setBackupName(value: String): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
      
      @scala.inline
      def setBackupSizeBytes(value: Double): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      @scala.inline
      def setBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
      
      @scala.inline
      def setBackupType(value: USER | SYSTEM | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      @scala.inline
      def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledBackupSummary extends BackupSummary {
    
    /**
      * <p>Time at which the backup was created.</p>
      */
    @JSName("BackupCreationDateTime")
    var BackupCreationDateTime_UnmarshalledBackupSummary: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    @JSName("BackupExpiryDateTime")
    var BackupExpiryDateTime_UnmarshalledBackupSummary: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledBackupSummary {
    
    @scala.inline
    def apply(): UnmarshalledBackupSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBackupSummary]
    }
    
    @scala.inline
    implicit class UnmarshalledBackupSummaryMutableBuilder[Self <: UnmarshalledBackupSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupCreationDateTime(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
      
      @scala.inline
      def setBackupExpiryDateTime(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    }
  }
}
