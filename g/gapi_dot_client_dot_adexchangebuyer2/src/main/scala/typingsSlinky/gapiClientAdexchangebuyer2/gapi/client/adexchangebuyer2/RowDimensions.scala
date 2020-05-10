package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDimensions extends js.Object {
  /** The time interval that this row represents. */
  var timeInterval: js.UndefOr[TimeInterval] = js.native
}

object RowDimensions {
  @scala.inline
  def apply(): RowDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDimensions]
  }
  @scala.inline
  implicit class RowDimensionsOps[Self <: RowDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeInterval(value: TimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(js.undefined)
        ret
    }
  }
  
}

