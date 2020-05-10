package typingsSlinky.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeStart extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.native
  var excludeStart: js.UndefOr[Boolean] = js.native
}

object AnonExcludeStart {
  @scala.inline
  def apply(): AnonExcludeStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExcludeStart]
  }
  @scala.inline
  implicit class AnonExcludeStartOps[Self <: AnonExcludeStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeStart")(js.undefined)
        ret
    }
  }
  
}

