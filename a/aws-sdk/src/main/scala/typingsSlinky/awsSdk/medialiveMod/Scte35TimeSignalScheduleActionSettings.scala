package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35TimeSignalScheduleActionSettings extends js.Object {
  /**
    * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
    */
  var Scte35Descriptors: listOfScte35Descriptor = js.native
}

object Scte35TimeSignalScheduleActionSettings {
  @scala.inline
  def apply(Scte35Descriptors: listOfScte35Descriptor): Scte35TimeSignalScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Scte35Descriptors = Scte35Descriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35TimeSignalScheduleActionSettings]
  }
  @scala.inline
  implicit class Scte35TimeSignalScheduleActionSettingsOps[Self <: Scte35TimeSignalScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScte35Descriptors(value: listOfScte35Descriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Descriptors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

