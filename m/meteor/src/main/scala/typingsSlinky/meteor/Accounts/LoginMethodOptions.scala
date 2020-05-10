package typingsSlinky.meteor.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginMethodOptions extends js.Object {
  /**
    * The arguments for the method
    */
  var methodArguments: js.UndefOr[js.Array[_]] = js.native
  /**
    * The method to call (default 'login')
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * Will be called with no arguments once the user is fully
    * logged in, or with the error on error.
    */
  var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * If provided, will be called with the result of the
    * method. If it throws, the client will not be logged in (and
    * its error will be passed to the callback).
    */
  var validateResult: js.UndefOr[js.Function] = js.native
}

object LoginMethodOptions {
  @scala.inline
  def apply(): LoginMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginMethodOptions]
  }
  @scala.inline
  implicit class LoginMethodOptionsOps[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodArguments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUserCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateResult(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResult")(js.undefined)
        ret
    }
  }
  
}

