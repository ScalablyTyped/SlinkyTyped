package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoUnitOptions extends InfoOptions {
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
}

object InfoUnitOptions {
  @scala.inline
  def apply(): InfoUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoUnitOptions]
  }
  @scala.inline
  implicit class InfoUnitOptionsOps[Self <: InfoUnitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberingSystem(value: NumberingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(js.undefined)
        ret
    }
  }
  
}

