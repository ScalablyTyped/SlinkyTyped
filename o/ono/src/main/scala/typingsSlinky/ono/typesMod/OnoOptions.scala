package typingsSlinky.ono.typesMod

import typingsSlinky.ono.onoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoOptions extends js.Object {
  /**
    * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
    * is appended to the new error message.
    *
    * Defaults to `true`.
    */
  var concatMessages: js.UndefOr[Boolean] = js.native
  /**
    * A function that replaces placeholders like "%s" or "%d" in error messages with values.
    * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
    *
    * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
    */
  var format: js.UndefOr[MessageFormatter | `false`] = js.native
}

object OnoOptions {
  @scala.inline
  def apply(): OnoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnoOptions]
  }
  @scala.inline
  implicit class OnoOptionsOps[Self <: OnoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcatMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction2(value: (/* message */ String, /* repeated */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormat(value: MessageFormatter | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

