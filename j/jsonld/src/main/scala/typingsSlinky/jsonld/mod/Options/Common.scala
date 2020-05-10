package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.jsonldSpecMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Common extends DocLoader {
  var base: js.UndefOr[String] = js.native
  var expandContext: js.UndefOr[Context] = js.native
}

object Common {
  @scala.inline
  def apply(): Common = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Common]
  }
  @scala.inline
  implicit class CommonOps[Self <: Common] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandContext")(js.undefined)
        ret
    }
  }
  
}

