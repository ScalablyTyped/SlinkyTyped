package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnUnfixingRefusedEventUIParam extends js.Object {
  /**
  	 * Gets the columnKey or the columnIndex.
  	 */
  var columnIdentifier: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the error message describing the reason fixing has failed.
  	 */
  var errorMessage: js.UndefOr[String] = js.native
  /**
  	 * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
  	 */
  var isGroupHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnUnfixingRefusedEventUIParam {
  @scala.inline
  def apply(): ColumnUnfixingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnUnfixingRefusedEventUIParam]
  }
  @scala.inline
  implicit class ColumnUnfixingRefusedEventUIParamOps[Self <: ColumnUnfixingRefusedEventUIParam] (val x: Self) extends AnyVal {
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
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
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

