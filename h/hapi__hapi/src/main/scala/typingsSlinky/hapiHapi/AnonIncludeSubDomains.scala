package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeSubDomains extends js.Object {
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubDomains: Boolean = js.native
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: Double = js.native
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: Boolean = js.native
}

object AnonIncludeSubDomains {
  @scala.inline
  def apply(includeSubDomains: Boolean, maxAge: Double, preload: Boolean): AnonIncludeSubDomains = {
    val __obj = js.Dynamic.literal(includeSubDomains = includeSubDomains.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSubDomains]
  }
  @scala.inline
  implicit class AnonIncludeSubDomainsOps[Self <: AnonIncludeSubDomains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeSubDomains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

