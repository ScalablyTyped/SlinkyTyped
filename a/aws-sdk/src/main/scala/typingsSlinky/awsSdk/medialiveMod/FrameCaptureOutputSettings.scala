package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureOutputSettings extends js.Object {
  /**
    * Required if the output group contains more than one output. This modifier forms part of the output file name.
    */
  var NameModifier: js.UndefOr[string] = js.native
}

object FrameCaptureOutputSettings {
  @scala.inline
  def apply(): FrameCaptureOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureOutputSettings]
  }
  @scala.inline
  implicit class FrameCaptureOutputSettingsOps[Self <: FrameCaptureOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameModifier(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(js.undefined)
        ret
    }
  }
  
}

