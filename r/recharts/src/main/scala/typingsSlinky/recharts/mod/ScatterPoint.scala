package typingsSlinky.recharts.mod

import typingsSlinky.recharts.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPoint extends js.Object {
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
  var node: js.UndefOr[X] = js.native
  var payload: js.UndefOr[js.Any] = js.native
  var size: js.UndefOr[Double] = js.native
}

object ScatterPoint {
  @scala.inline
  def apply(): ScatterPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterPoint]
  }
  @scala.inline
  implicit class ScatterPointOps[Self <: ScatterPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

