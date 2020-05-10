package typingsSlinky.reduxAuthWrapper.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthConfig extends js.Object {
  var AuthenticatingComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  var wrapperDisplayName: js.UndefOr[String] = js.native
}

object AuthConfig {
  @scala.inline
  def apply(): AuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthConfig]
  }
  @scala.inline
  implicit class AuthConfigOps[Self <: AuthConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatingComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticatingComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticatingComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticatingComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatingComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperDisplayName")(js.undefined)
        ret
    }
  }
  
}

