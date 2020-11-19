package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLoggingInfoBrokerLogsS3 extends js.Object {
  
  /**
    * Name of the S3 bucket to deliver logs to.
    */
  var bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean] = js.native
  
  /**
    * Prefix to append to the folder name.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}
object ClusterLoggingInfoBrokerLogsS3 {
  
  @scala.inline
  def apply(enabled: Input[Boolean]): ClusterLoggingInfoBrokerLogsS3 = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsS3]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsS3Ops[Self <: ClusterLoggingInfoBrokerLogsS3] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
