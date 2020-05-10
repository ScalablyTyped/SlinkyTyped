package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.adaptive_
import typingsSlinky.chromeApps.chromeAppsStrings.asynchronous_
import typingsSlinky.chromeApps.chromeAppsStrings.synchronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonADAPTIVE extends js.Object {
  var ADAPTIVE: adaptive_ = js.native
  var ASYNCHRONOUS: asynchronous_ = js.native
  var SYNCHRONOUS: synchronous_ = js.native
}

object AnonADAPTIVE {
  @scala.inline
  def apply(ADAPTIVE: adaptive_, ASYNCHRONOUS: asynchronous_, SYNCHRONOUS: synchronous_): AnonADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = ADAPTIVE.asInstanceOf[js.Any], ASYNCHRONOUS = ASYNCHRONOUS.asInstanceOf[js.Any], SYNCHRONOUS = SYNCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonADAPTIVE]
  }
  @scala.inline
  implicit class AnonADAPTIVEOps[Self <: AnonADAPTIVE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADAPTIVE(value: adaptive_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADAPTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withASYNCHRONOUS(value: asynchronous_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASYNCHRONOUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYNCHRONOUS(value: synchronous_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYNCHRONOUS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

