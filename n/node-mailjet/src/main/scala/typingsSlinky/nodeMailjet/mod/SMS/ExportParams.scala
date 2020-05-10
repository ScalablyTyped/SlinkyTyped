package typingsSlinky.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportParams extends js.Object {
  var FromTS: Double = js.native
  var ToTS: Double = js.native
}

object ExportParams {
  @scala.inline
  def apply(FromTS: Double, ToTS: Double): ExportParams = {
    val __obj = js.Dynamic.literal(FromTS = FromTS.asInstanceOf[js.Any], ToTS = ToTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParams]
  }
  @scala.inline
  implicit class ExportParamsOps[Self <: ExportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToTS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

