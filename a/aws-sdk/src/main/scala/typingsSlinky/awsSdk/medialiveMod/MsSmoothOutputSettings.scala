package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothOutputSettings extends js.Object {
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType] = js.native
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.native
}

object MsSmoothOutputSettings {
  @scala.inline
  def apply(): MsSmoothOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothOutputSettings]
  }
  @scala.inline
  implicit class MsSmoothOutputSettingsOps[Self <: MsSmoothOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH265PackagingType(value: MsSmoothH265PackagingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265PackagingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH265PackagingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265PackagingType")(js.undefined)
        ret
    }
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

