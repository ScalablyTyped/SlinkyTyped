package typingsSlinky.jqueryFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagStrapStatic extends js.Object {
  var flagStrap: js.UndefOr[Unit] = js.native
}

object FlagStrapStatic {
  @scala.inline
  def apply(): FlagStrapStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagStrapStatic]
  }
  @scala.inline
  implicit class FlagStrapStaticOps[Self <: FlagStrapStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlagStrap(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagStrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStrap")(js.undefined)
        ret
    }
  }
  
}

