package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  /**
    * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
    */
  var CustomRedirectDomain: js.UndefOr[typingsSlinky.awsSdk.sesMod.CustomRedirectDomain] = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomRedirectDomain(value: CustomRedirectDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRedirectDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRedirectDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRedirectDomain")(js.undefined)
        ret
    }
  }
  
}

