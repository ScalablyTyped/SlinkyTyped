package typingsSlinky.pulumiAws.outputMod.redshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLogging extends js.Object {
  
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
    * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
    */
  var bucketName: String = js.native
  
  /**
    * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  var enable: Boolean = js.native
  
  /**
    * The prefix applied to the log file names.
    */
  var s3KeyPrefix: String = js.native
}
object ClusterLogging {
  
  @scala.inline
  def apply(bucketName: String, enable: Boolean, s3KeyPrefix: String): ClusterLogging = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLogging]
  }
  
  @scala.inline
  implicit class ClusterLoggingOps[Self <: ClusterLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
  }
}
