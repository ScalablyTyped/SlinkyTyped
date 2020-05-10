package typingsSlinky.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSpecNameString extends js.Object {
  var specName: js.UndefOr[String] = js.native
}

object AnonSpecNameString {
  @scala.inline
  def apply(): AnonSpecNameString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSpecNameString]
  }
  @scala.inline
  implicit class AnonSpecNameStringOps[Self <: AnonSpecNameString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specName")(js.undefined)
        ret
    }
  }
  
}

