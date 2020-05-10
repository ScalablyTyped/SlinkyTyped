package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFixingEventUIParam extends js.Object {
  /**
  	 * Gets the columnKey or the columnIndex.
  	 */
  var columnIdentifier: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets whether the header cell has children(use this argument ONLY when multi-column-headers are enabled).
  	 */
  var isGroupHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnFixingEventUIParam {
  @scala.inline
  def apply(): ColumnFixingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFixingEventUIParam]
  }
  @scala.inline
  implicit class ColumnFixingEventUIParamOps[Self <: ColumnFixingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIdentifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGroupHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGroupHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupHeader")(js.undefined)
        ret
    }
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
  }
  
}

