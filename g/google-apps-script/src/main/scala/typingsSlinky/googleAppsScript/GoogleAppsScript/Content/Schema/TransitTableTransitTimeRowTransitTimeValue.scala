package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitTableTransitTimeRowTransitTimeValue extends js.Object {
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}

object TransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(): TransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRowTransitTimeValue]
  }
  @scala.inline
  implicit class TransitTableTransitTimeRowTransitTimeValueOps[Self <: TransitTableTransitTimeRowTransitTimeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTransitTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTransitTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTransitTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTransitTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTransitTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTransitTimeInDays")(js.undefined)
        ret
    }
  }
  
}

