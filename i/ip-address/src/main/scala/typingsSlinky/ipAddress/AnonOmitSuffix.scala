package typingsSlinky.ipAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOmitSuffix extends js.Object {
  var omitSuffix: Boolean = js.native
}

object AnonOmitSuffix {
  @scala.inline
  def apply(omitSuffix: Boolean): AnonOmitSuffix = {
    val __obj = js.Dynamic.literal(omitSuffix = omitSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOmitSuffix]
  }
  @scala.inline
  implicit class AnonOmitSuffixOps[Self <: AnonOmitSuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOmitSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitSuffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

