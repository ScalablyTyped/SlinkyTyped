package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveDimensionRequest extends js.Object {
  var destinationIndex: js.UndefOr[Double] = js.native
  var source: js.UndefOr[DimensionRange] = js.native
}

object MoveDimensionRequest {
  @scala.inline
  def apply(): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveDimensionRequest]
  }
  @scala.inline
  implicit class MoveDimensionRequestOps[Self <: MoveDimensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: DimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

