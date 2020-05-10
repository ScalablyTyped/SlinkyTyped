package typingsSlinky.actionsOnGoogle.actionssdkActionssdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdkVerification extends js.Object {
  /**
    * Custom error message as a string or a function that returns a string
    * given the original error message set by the library.
    *
    * The message will get sent back in the JSON top level `error` property.
    * @public
    */
  var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.native
  /**
    * Google Cloud Project ID for the Assistant app.
    * @public
    */
  var project: String = js.native
  /**
    * Custom status code to return on verification error.
    * @public
    */
  var status: js.UndefOr[Double] = js.native
}

object ActionsSdkVerification {
  @scala.inline
  def apply(project: String): ActionsSdkVerification = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSdkVerification]
  }
  @scala.inline
  implicit class ActionsSdkVerificationOps[Self <: ActionsSdkVerification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorFunction1(value: /* error */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: String | (js.Function1[/* error */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

