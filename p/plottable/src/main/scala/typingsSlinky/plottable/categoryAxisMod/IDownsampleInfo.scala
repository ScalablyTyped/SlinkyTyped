package typingsSlinky.plottable.categoryAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDownsampleInfo extends js.Object {
  var domain: js.Array[String] = js.native
  var stepWidth: Double = js.native
}

object IDownsampleInfo {
  @scala.inline
  def apply(domain: js.Array[String], stepWidth: Double): IDownsampleInfo = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], stepWidth = stepWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownsampleInfo]
  }
  @scala.inline
  implicit class IDownsampleInfoOps[Self <: IDownsampleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

