package typingsSlinky.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeltaScaleX extends js.Object {
  var deltaScaleX: js.UndefOr[Double] = js.native
  var deltaScaleY: js.UndefOr[Double] = js.native
}

object AnonDeltaScaleX {
  @scala.inline
  def apply(): AnonDeltaScaleX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeltaScaleX]
  }
  @scala.inline
  implicit class AnonDeltaScaleXOps[Self <: AnonDeltaScaleX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScaleY")(js.undefined)
        ret
    }
  }
  
}

