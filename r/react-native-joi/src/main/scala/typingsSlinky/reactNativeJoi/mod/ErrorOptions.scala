package typingsSlinky.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOptions extends js.Object {
  /**
    * Boolean value indicating whether the error handler should be used for all errors or only for errors occurring
    * on this property (`true` value).
    * This concept only makes sense for `array` or `object` schemas as other values don't have children.
    * @default false
    */
  var self: js.UndefOr[Boolean] = js.native
}

object ErrorOptions {
  @scala.inline
  def apply(): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOptions]
  }
  @scala.inline
  implicit class ErrorOptionsOps[Self <: ErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(js.undefined)
        ret
    }
  }
  
}

