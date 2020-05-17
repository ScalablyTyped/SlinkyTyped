package typingsSlinky.chocolatechipjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackName extends js.Object {
  /**
    * The optional name for the callback when the server response will execute.
    * The default value is "callback".
    * However some sites may use a different name for their JSONP function.
    * Consult the documentation on the site to ascertain the correct value for this callback.
    */
  var callbackName: js.UndefOr[String] = js.native
  /**
    * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
    */
  var clear: js.UndefOr[Boolean] = js.native
  /**
    * A number representing milliseconds to express when to refect a JSONP request.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object CallbackName {
  @scala.inline
  def apply(): CallbackName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackName]
  }
  @scala.inline
  implicit class CallbackNameOps[Self <: CallbackName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackName")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

