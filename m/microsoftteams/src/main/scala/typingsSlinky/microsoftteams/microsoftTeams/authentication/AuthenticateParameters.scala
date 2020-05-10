package typingsSlinky.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateParameters extends js.Object {
  /**
    * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.native
  /**
    * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
    */
  var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.native
  /**
    * The URL for the authentication pop-up.
    */
  var url: String = js.native
  /**
    * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var width: js.UndefOr[Double] = js.native
}

object AuthenticateParameters {
  @scala.inline
  def apply(url: String): AuthenticateParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateParameters]
  }
  @scala.inline
  implicit class AuthenticateParametersOps[Self <: AuthenticateParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureCallback(value: /* reason */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFailureCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCallback(value: /* result */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccessCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

