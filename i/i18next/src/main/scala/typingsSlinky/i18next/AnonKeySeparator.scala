package typingsSlinky.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeySeparator extends js.Object {
  var keySeparator: js.UndefOr[String] = js.native
}

object AnonKeySeparator {
  @scala.inline
  def apply(): AnonKeySeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKeySeparator]
  }
  @scala.inline
  implicit class AnonKeySeparatorOps[Self <: AnonKeySeparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(js.undefined)
        ret
    }
  }
  
}

