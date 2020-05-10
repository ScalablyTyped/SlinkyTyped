package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedContentReference extends js.Object {
  var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.native
}

object LinkedContentReference {
  @scala.inline
  def apply(): LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedContentReference]
  }
  @scala.inline
  implicit class LinkedContentReferenceOps[Self <: LinkedContentReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheetsChartReference(value: SheetsChartReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsChartReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartReference")(js.undefined)
        ret
    }
  }
  
}

