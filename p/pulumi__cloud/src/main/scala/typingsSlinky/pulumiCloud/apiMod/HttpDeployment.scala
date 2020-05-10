package typingsSlinky.pulumiCloud.apiMod

import typingsSlinky.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpDeployment extends js.Object {
  /**
    * An optional list of custom domain names, each corresponding to a
    * previous call to attachCustomDomain on the API.  Each name
    * should be mapped using a DNS A record.
    */
  var customDomainNames: js.Array[Output_[String]] = js.native
  /**
    * The URL at which the HttpDeployment is available to the Internet.
    */
  var url: Output_[String] = js.native
}

object HttpDeployment {
  @scala.inline
  def apply(customDomainNames: js.Array[Output_[String]], url: Output_[String]): HttpDeployment = {
    val __obj = js.Dynamic.literal(customDomainNames = customDomainNames.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDeployment]
  }
  @scala.inline
  implicit class HttpDeploymentOps[Self <: HttpDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDomainNames(value: js.Array[Output_[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Output_[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

