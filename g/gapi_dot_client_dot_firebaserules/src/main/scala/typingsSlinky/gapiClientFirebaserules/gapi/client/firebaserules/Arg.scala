package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arg extends js.Object {
  /** Argument matches any value provided. */
  var anyValue: js.UndefOr[js.Any] = js.native
  /** Argument exactly matches value provided. */
  var exactValue: js.UndefOr[js.Any] = js.native
}

object Arg {
  @scala.inline
  def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  @scala.inline
  implicit class ArgOps[Self <: Arg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExactValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactValue")(js.undefined)
        ret
    }
  }
  
}

