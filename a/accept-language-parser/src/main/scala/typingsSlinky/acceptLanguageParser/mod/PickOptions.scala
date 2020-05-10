package typingsSlinky.acceptLanguageParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickOptions extends js.Object {
  var loose: js.UndefOr[Boolean] = js.native
}

object PickOptions {
  @scala.inline
  def apply(): PickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptions]
  }
  @scala.inline
  implicit class PickOptionsOps[Self <: PickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loose")(js.undefined)
        ret
    }
  }
  
}

