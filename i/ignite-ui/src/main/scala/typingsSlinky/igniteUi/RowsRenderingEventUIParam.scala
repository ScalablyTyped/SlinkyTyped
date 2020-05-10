package typingsSlinky.igniteUi

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsRenderingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets reference to the grid's table body.
  	 */
  var tbody: js.UndefOr[Element] = js.native
}

object RowsRenderingEventUIParam {
  @scala.inline
  def apply(): RowsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRenderingEventUIParam]
  }
  @scala.inline
  implicit class RowsRenderingEventUIParamOps[Self <: RowsRenderingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withTbody(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(js.undefined)
        ret
    }
  }
  
}

