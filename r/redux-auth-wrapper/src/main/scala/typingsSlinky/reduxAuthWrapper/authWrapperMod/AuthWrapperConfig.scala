package typingsSlinky.reduxAuthWrapper.authWrapperMod

import slinky.core.ReactComponentClass
import typingsSlinky.reduxAuthWrapper.mod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthWrapperConfig extends AuthConfig {
  var FailureComponent: js.UndefOr[ReactComponentClass[_]] = js.native
}

object AuthWrapperConfig {
  @scala.inline
  def apply(): AuthWrapperConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthWrapperConfig]
  }
  @scala.inline
  implicit class AuthWrapperConfigOps[Self <: AuthWrapperConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureComponent")(js.undefined)
        ret
    }
  }
  
}

