package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationProperties extends js.Object {
  /**
    * The ARN of the resource to publish to.
    */
  var DestinationArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the KMS key to use for encryption.
    */
  var KmsKeyArn: js.UndefOr[String] = js.native
}

object DestinationProperties {
  @scala.inline
  def apply(): DestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationProperties]
  }
  @scala.inline
  implicit class DestinationPropertiesOps[Self <: DestinationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(js.undefined)
        ret
    }
  }
  
}

