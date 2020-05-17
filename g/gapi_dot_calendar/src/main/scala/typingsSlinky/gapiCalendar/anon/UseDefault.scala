package typingsSlinky.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[Method]] = js.native
  var useDefault: Boolean = js.native
}

object UseDefault {
  @scala.inline
  def apply(useDefault: Boolean): UseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDefault]
  }
  @scala.inline
  implicit class UseDefaultOps[Self <: UseDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: js.Array[Method]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

