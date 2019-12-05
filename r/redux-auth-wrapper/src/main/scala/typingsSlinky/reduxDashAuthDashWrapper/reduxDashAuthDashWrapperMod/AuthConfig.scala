package typingsSlinky.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var AuthenticatingComponent: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var wrapperDisplayName: js.UndefOr[String] = js.undefined
}

object AuthConfig {
  @scala.inline
  def apply(AuthenticatingComponent: ReactComponentClass[_] = null, wrapperDisplayName: String = null): AuthConfig = {
    val __obj = js.Dynamic.literal()
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthConfig]
  }
}

