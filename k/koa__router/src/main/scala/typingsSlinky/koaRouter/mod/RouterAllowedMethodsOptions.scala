package typingsSlinky.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterAllowedMethodsOptions extends js.Object {
  /**
    * throw the returned value in place of the default MethodNotAllowed error
    */
  var methodNotAllowed: js.UndefOr[js.Function0[_]] = js.native
  /**
    * throw the returned value in place of the default NotImplemented error
    */
  var notImplemented: js.UndefOr[js.Function0[_]] = js.native
  /**
    * throw error instead of setting status and header
    */
  var `throw`: js.UndefOr[Boolean] = js.native
}

object RouterAllowedMethodsOptions {
  @scala.inline
  def apply(): RouterAllowedMethodsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterAllowedMethodsOptions]
  }
  @scala.inline
  implicit class RouterAllowedMethodsOptionsOps[Self <: RouterAllowedMethodsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodNotAllowed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodNotAllowed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMethodNotAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodNotAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withNotImplemented(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notImplemented")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotImplemented: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notImplemented")(js.undefined)
        ret
    }
    @scala.inline
    def withThrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.undefined)
        ret
    }
  }
  
}

