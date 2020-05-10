package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaDataDataTableRows extends js.Object {
  var c: js.UndefOr[js.Array[GaDataDataTableRowsC]] = js.native
}

object GaDataDataTableRows {
  @scala.inline
  def apply(): GaDataDataTableRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaDataDataTableRows]
  }
  @scala.inline
  implicit class GaDataDataTableRowsOps[Self <: GaDataDataTableRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: js.Array[GaDataDataTableRowsC]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
  }
  
}

