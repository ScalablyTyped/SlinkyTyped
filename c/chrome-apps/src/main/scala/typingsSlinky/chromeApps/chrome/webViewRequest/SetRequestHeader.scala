package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the request header of the specified name to the specified value.
  * If a header with the specified name did not exist before, a new one is created.
  * Header name comparison is always case-insensitive.
  * Each request header name occurs only once in each request.
  */
@js.native
trait SetRequestHeader extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.SetRequestHeader = js.native
}

object SetRequestHeader {
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.SetRequestHeader): SetRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestHeader]
  }
  @scala.inline
  implicit class SetRequestHeaderOps[Self <: SetRequestHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.SetRequestHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeGuard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

