package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var TdtInterval: js.UndefOr[integerMin1000Max30000] = js.native
}

object DvbTdtSettings {
  @scala.inline
  def apply(): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbTdtSettings]
  }
  @scala.inline
  implicit class DvbTdtSettingsOps[Self <: DvbTdtSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTdtInterval(value: integerMin1000Max30000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdtInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdtInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdtInterval")(js.undefined)
        ret
    }
  }
  
}

