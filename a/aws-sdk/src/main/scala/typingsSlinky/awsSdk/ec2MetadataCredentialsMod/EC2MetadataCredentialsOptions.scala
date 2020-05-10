package typingsSlinky.awsSdk.ec2MetadataCredentialsMod

import typingsSlinky.awsSdk.AnonTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2MetadataCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[AnonTimeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object EC2MetadataCredentialsOptions {
  @scala.inline
  def apply(): EC2MetadataCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2MetadataCredentialsOptions]
  }
  @scala.inline
  implicit class EC2MetadataCredentialsOptionsOps[Self <: EC2MetadataCredentialsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpOptions(value: AnonTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
  }
  
}

