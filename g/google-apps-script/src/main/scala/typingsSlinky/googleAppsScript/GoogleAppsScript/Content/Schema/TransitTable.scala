package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitTable extends js.Object {
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  var rows: js.UndefOr[js.Array[TransitTableTransitTimeRow]] = js.native
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}

object TransitTable {
  @scala.inline
  def apply(): TransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTable]
  }
  @scala.inline
  implicit class TransitTableOps[Self <: TransitTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostalCodeGroupNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[TransitTableTransitTimeRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitTimeLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitTimeLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeLabels")(js.undefined)
        ret
    }
  }
  
}

