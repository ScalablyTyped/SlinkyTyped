package typingsSlinky.antd.rowContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowContextState extends js.Object {
  var gutter: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object RowContextState {
  @scala.inline
  def apply(): RowContextState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowContextState]
  }
  @scala.inline
  implicit class RowContextStateOps[Self <: RowContextState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGutter(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
  }
  
}

