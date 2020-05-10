package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnGap extends js.Object {
  var columnGap: AnonUnit = js.native
  var rowGap: AnonUnit = js.native
}

object AnonColumnGap {
  @scala.inline
  def apply(columnGap: AnonUnit, rowGap: AnonUnit): AnonColumnGap = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnGap]
  }
  @scala.inline
  implicit class AnonColumnGapOps[Self <: AnonColumnGap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnGap(value: AnonUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowGap(value: AnonUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

