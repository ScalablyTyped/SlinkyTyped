package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionsMessage extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.native
}

object OptionGroupOptionsMessage {
  @scala.inline
  def apply(): OptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOptionsMessage]
  }
  @scala.inline
  implicit class OptionGroupOptionsMessageOps[Self <: OptionGroupOptionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupOptions(value: OptionGroupOptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupOptions")(js.undefined)
        ret
    }
  }
  
}

