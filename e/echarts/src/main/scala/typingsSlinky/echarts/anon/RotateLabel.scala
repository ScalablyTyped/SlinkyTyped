package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.native
}

object RotateLabel {
  @scala.inline
  def apply(): RotateLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateLabel]
  }
  @scala.inline
  implicit class RotateLabelOps[Self <: RotateLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotateLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLabel")(js.undefined)
        ret
    }
  }
  
}

