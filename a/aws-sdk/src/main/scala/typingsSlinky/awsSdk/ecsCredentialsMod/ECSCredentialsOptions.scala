package typingsSlinky.awsSdk.ecsCredentialsMod

import typingsSlinky.awsSdk.AnonTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[AnonTimeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object ECSCredentialsOptions {
  @scala.inline
  def apply(): ECSCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSCredentialsOptions]
  }
  @scala.inline
  implicit class ECSCredentialsOptionsOps[Self <: ECSCredentialsOptions] (val x: Self) extends AnyVal {
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

