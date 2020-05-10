package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableLoggingMessage extends js.Object {
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Constraints:   Must be in the same region as the cluster   The cluster must have read bucket and put object permissions  
    */
  var BucketName: String = js.native
  /**
    * The identifier of the cluster on which logging is to be started. Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
  /**
    * The prefix applied to the log file names. Constraints:   Cannot exceed 512 characters   Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The hexadecimal codes for invalid characters are:    x00 to x20   x22   x27   x5c   x7f or larger    
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
}

object EnableLoggingMessage {
  @scala.inline
  def apply(BucketName: String, ClusterIdentifier: String): EnableLoggingMessage = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingMessage]
  }
  @scala.inline
  implicit class EnableLoggingMessageOps[Self <: EnableLoggingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(js.undefined)
        ret
    }
  }
  
}

