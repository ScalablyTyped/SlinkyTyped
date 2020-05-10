package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The location where the comma-separated value (.csv) files are stored before being uploaded to the S3 bucket. 
    */
  var BucketFolder: js.UndefOr[String] = js.native
  /**
    * The name of the S3 bucket you want to use
    */
  var BucketName: js.UndefOr[String] = js.native
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
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS. To use SSE_S3, create an AWS Identity and Access Management (IAM) role with a policy that allows "arn:aws:s3:::*" to use the following actions: "s3:PutObject", "s3:ListBucket" 
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.native
  /**
    * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults to 10.
    */
  var FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.native
  /**
    * The amount of time to wait (in milliseconds) before timing out, beginning from when you begin loading.
    */
  var LoadTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum size (in KB) of any .csv file used to transfer data to Amazon Redshift. This accepts a value from 1 through 1,048,576. It defaults to 32,768 KB (32 MB).
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
    * The size of the write buffer to use in rows. Valid values range from 1 through 2,048. The default is 1,024. Use this setting to tune performance. 
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
    def withAcceptAnyDate(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptAnyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptAnyDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptAnyDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterConnectScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterConnectScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterConnectScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterConnectScript")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyAsNull(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyAsNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyAsNull")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionMode(value: EncryptionModeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTransferUploadStreams(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileTransferUploadStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTransferUploadStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileTransferUploadStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadTimeout(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: SecretString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveQuotes(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceChars")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceInvalidChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceInvalidChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceInvalidChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceInvalidChars")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryptionKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryptionKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerSideEncryptionKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimBlanks(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrimBlanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrimBlanks")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateColumns(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TruncateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TruncateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteBufferSize(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteBufferSize")(js.undefined)
        ret
    }
  }
  
}

