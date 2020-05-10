package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailSettings extends js.Object {
  var Scte35SpliceInsert: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte35SpliceInsert] = js.native
  var Scte35TimeSignalApos: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Scte35TimeSignalApos] = js.native
}

object AvailSettings {
  @scala.inline
  def apply(): AvailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSettings]
  }
  @scala.inline
  implicit class AvailSettingsOps[Self <: AvailSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScte35SpliceInsert(value: Scte35SpliceInsert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35SpliceInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35SpliceInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35SpliceInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35TimeSignalApos(value: Scte35TimeSignalApos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35TimeSignalApos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35TimeSignalApos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35TimeSignalApos")(js.undefined)
        ret
    }
  }
  
}

