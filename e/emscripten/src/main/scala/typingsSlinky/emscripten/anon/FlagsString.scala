package typingsSlinky.emscripten.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagsString extends js.Object {
  var flags: js.UndefOr[String] = js.native
}

object FlagsString {
  @scala.inline
  def apply(): FlagsString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagsString]
  }
  @scala.inline
  implicit class FlagsStringOps[Self <: FlagsString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
  }
  
}

