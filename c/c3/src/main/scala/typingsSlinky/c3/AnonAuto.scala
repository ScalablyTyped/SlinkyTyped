package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuto extends js.Object {
  /**
    * Indicate if the chart should automatically get resized when the window gets resized.
    */
  var auto: js.UndefOr[Boolean] = js.native
}

object AnonAuto {
  @scala.inline
  def apply(): AnonAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuto]
  }
  @scala.inline
  implicit class AnonAutoOps[Self <: AnonAuto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
  }
  
}

