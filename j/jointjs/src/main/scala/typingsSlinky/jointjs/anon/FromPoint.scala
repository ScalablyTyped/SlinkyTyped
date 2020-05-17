package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromPoint extends js.Object {
  var fromPoint: js.UndefOr[Boolean] = js.native
}

object FromPoint {
  @scala.inline
  def apply(): FromPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromPoint]
  }
  @scala.inline
  implicit class FromPointOps[Self <: FromPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPoint")(js.undefined)
        ret
    }
  }
  
}

