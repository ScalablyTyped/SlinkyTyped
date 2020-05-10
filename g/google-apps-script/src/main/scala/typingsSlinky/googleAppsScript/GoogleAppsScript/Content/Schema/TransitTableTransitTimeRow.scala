package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitTableTransitTimeRow extends js.Object {
  var values: js.UndefOr[js.Array[TransitTableTransitTimeRowTransitTimeValue]] = js.native
}

object TransitTableTransitTimeRow {
  @scala.inline
  def apply(): TransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRow]
  }
  @scala.inline
  implicit class TransitTableTransitTimeRowOps[Self <: TransitTableTransitTimeRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[TransitTableTransitTimeRowTransitTimeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

