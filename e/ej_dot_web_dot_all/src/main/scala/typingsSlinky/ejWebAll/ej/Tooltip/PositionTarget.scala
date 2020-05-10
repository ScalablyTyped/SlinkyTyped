package typingsSlinky.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionTarget extends js.Object {
  /** Sets the Tooltip position against target based on horizontal(x) value.
    * @Default {center}
    */
  var horizontal: js.UndefOr[String | Double] = js.native
  /** Sets the Tooltip position against target based on vertical(y) value.
    * @Default {top}
    */
  var vertical: js.UndefOr[String | Double] = js.native
}

object PositionTarget {
  @scala.inline
  def apply(): PositionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionTarget]
  }
  @scala.inline
  implicit class PositionTargetOps[Self <: PositionTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

