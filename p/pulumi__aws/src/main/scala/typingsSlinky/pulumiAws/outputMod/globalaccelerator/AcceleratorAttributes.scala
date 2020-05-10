package typingsSlinky.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorAttributes extends js.Object {
  /**
    * Indicates whether flow logs are enabled.
    */
  var flowLogsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Prefix: js.UndefOr[String] = js.native
}

object AcceleratorAttributes {
  @scala.inline
  def apply(): AcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorAttributes]
  }
  @scala.inline
  implicit class AcceleratorAttributesOps[Self <: AcceleratorAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowLogsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLogsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowLogsS3Bucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsS3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLogsS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsS3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowLogsS3Prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsS3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLogsS3Prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLogsS3Prefix")(js.undefined)
        ret
    }
  }
  
}

