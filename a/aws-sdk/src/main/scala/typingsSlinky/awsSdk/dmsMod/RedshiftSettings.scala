package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftSettings extends js.Object {
  
  /**
    * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be loaded without generating an error. You can choose true or false (the default). This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a NULL value into that field. 
    */
  var AcceptAnyDate: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing the code.
    */
  var AfterConnectScript: js.UndefOr[String] = js.native
  
  /**
    * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift cluster.  For full load mode, AWS DMS converts source records into .csv files and loads them to the BucketFolder/TableID path. AWS DMS uses the Redshift COPY command to upload the .csv files to the target table. The files are deleted once the COPY operation has finished. For more information, see Amazon Redshift Database Developer Guide  For change-data-capture (CDC) mode, AWS DMS creates a NetChanges table, and loads the .csv files to this BucketFolder/NetChangesTableID path.
    */
  var BucketFolder: js.UndefOr[String] = js.native
  
  /**
    * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
    */
  var BucketName: js.UndefOr[String] = js.native
  
  /**
    * If Amazon Redshift is configured to support case sensitive schema names, set CaseSensitiveNames to true. The default is false.
    */
  var CaseSensitiveNames: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * If you set CompUpdate to true Amazon Redshift applies automatic compression if the table is empty. This applies even if the table columns already have encodings other than RAW. If you set CompUpdate to false, automatic compression is disabled and existing column encodings aren't changed. The default is true.
    */
  var CompUpdate: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you initially establish a connection.
    */
  var ConnectionTimeout: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the Amazon Redshift data warehouse (service) that you are working with.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The date format that you are using. Valid values are auto (case-sensitive), your date format string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using auto recognizes most strings, even some that aren't supported when you use a date format string.  If your date and time values use formats different from each other, set this to auto. 
    */
  var DateFormat: js.UndefOr[String] = js.native
  
  /**
    * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of true sets empty CHAR and VARCHAR fields to null. The default is false.
    */
  var EmptyAsNull: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS.   For the ModifyEndpoint operation, you can change the existing value of the EncryptionMode parameter from SSE_KMS to SSE_S3. But you can’t change the existing value from SSE_S3 to SSE_KMS.  To use SSE_S3, create an AWS Identity and Access Management (IAM) role with a policy that allows "arn:aws:s3:::*" to use the following actions: "s3:PutObject", "s3:ListBucket" 
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.native
  
  /**
    * This setting is only valid for a full-load migration task. Set ExplicitIds to true to have tables with IDENTITY columns override their auto-generated values with explicit values loaded from the source data files used to populate the tables. The default is false.
    */
  var ExplicitIds: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults to 10. The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For more information, see Multipart upload overview.   FileTransferUploadStreams accepts a value from 1 through 64. It defaults to 10.
    */
  var FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
    */
  var LoadTimeout: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift. It defaults to 1048576KB (1 GB).
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The password for the user named in the username property.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * The port number for Amazon Redshift. The default value is 5439.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters within the quotation marks, including delimiters, are retained. Choose true to remove quotation marks. The default is false.
    */
  var RemoveQuotes: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that specifies to replaces the invalid characters specified in ReplaceInvalidChars, substituting the specified characters instead. The default is "?".
    */
  var ReplaceChars: js.UndefOr[String] = js.native
  
  /**
    * A list of characters that you want to replace. Use with ReplaceChars.
    */
  var ReplaceInvalidChars: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon Redshift cluster you are using.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key ID. If you are using SSE_KMS for the EncryptionMode, provide this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The time format that you want to use. Valid values are auto (case-sensitive), 'timeformat_string', 'epochsecs', or 'epochmillisecs'. It defaults to 10. Using auto recognizes most strings, even some that aren't supported when you use a time format string.  If your date and time values use formats different from each other, set this parameter to auto. 
    */
  var TimeFormat: js.UndefOr[String] = js.native
  
  /**
    * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter applies only to columns with a VARCHAR data type. Choose true to remove unneeded white space. The default is false.
    */
  var TrimBlanks: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4 MB or less. Choose true to truncate data. The default is false.
    */
  var TruncateColumns: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * An Amazon Redshift user name for a registered user.
    */
  var Username: js.UndefOr[String] = js.native
  
  /**
    * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
    */
  var WriteBufferSize: js.UndefOr[IntegerOptional] = js.native
}
object RedshiftSettings {
  
  @scala.inline
  def apply(): RedshiftSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftSettings]
  }
  
  @scala.inline
  implicit class RedshiftSettingsOps[Self <: RedshiftSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptAnyDate(value: BooleanOptional): Self = this.set("AcceptAnyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptAnyDate: Self = this.set("AcceptAnyDate", js.undefined)
    
    @scala.inline
    def setAfterConnectScript(value: String): Self = this.set("AfterConnectScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterConnectScript: Self = this.set("AfterConnectScript", js.undefined)
    
    @scala.inline
    def setBucketFolder(value: String): Self = this.set("BucketFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketFolder: Self = this.set("BucketFolder", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    
    @scala.inline
    def setCaseSensitiveNames(value: BooleanOptional): Self = this.set("CaseSensitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveNames: Self = this.set("CaseSensitiveNames", js.undefined)
    
    @scala.inline
    def setCompUpdate(value: BooleanOptional): Self = this.set("CompUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompUpdate: Self = this.set("CompUpdate", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: IntegerOptional): Self = this.set("ConnectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("ConnectionTimeout", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("DateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("DateFormat", js.undefined)
    
    @scala.inline
    def setEmptyAsNull(value: BooleanOptional): Self = this.set("EmptyAsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyAsNull: Self = this.set("EmptyAsNull", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionModeValue): Self = this.set("EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMode: Self = this.set("EncryptionMode", js.undefined)
    
    @scala.inline
    def setExplicitIds(value: BooleanOptional): Self = this.set("ExplicitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitIds: Self = this.set("ExplicitIds", js.undefined)
    
    @scala.inline
    def setFileTransferUploadStreams(value: IntegerOptional): Self = this.set("FileTransferUploadStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTransferUploadStreams: Self = this.set("FileTransferUploadStreams", js.undefined)
    
    @scala.inline
    def setLoadTimeout(value: IntegerOptional): Self = this.set("LoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadTimeout: Self = this.set("LoadTimeout", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = this.set("MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("MaxFileSize", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setRemoveQuotes(value: BooleanOptional): Self = this.set("RemoveQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveQuotes: Self = this.set("RemoveQuotes", js.undefined)
    
    @scala.inline
    def setReplaceChars(value: String): Self = this.set("ReplaceChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceChars: Self = this.set("ReplaceChars", js.undefined)
    
    @scala.inline
    def setReplaceInvalidChars(value: String): Self = this.set("ReplaceInvalidChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceInvalidChars: Self = this.set("ReplaceInvalidChars", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionKmsKeyId(value: String): Self = this.set("ServerSideEncryptionKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryptionKmsKeyId: Self = this.set("ServerSideEncryptionKmsKeyId", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("TimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("TimeFormat", js.undefined)
    
    @scala.inline
    def setTrimBlanks(value: BooleanOptional): Self = this.set("TrimBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimBlanks: Self = this.set("TrimBlanks", js.undefined)
    
    @scala.inline
    def setTruncateColumns(value: BooleanOptional): Self = this.set("TruncateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncateColumns: Self = this.set("TruncateColumns", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
    
    @scala.inline
    def setWriteBufferSize(value: IntegerOptional): Self = this.set("WriteBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteBufferSize: Self = this.set("WriteBufferSize", js.undefined)
  }
}
