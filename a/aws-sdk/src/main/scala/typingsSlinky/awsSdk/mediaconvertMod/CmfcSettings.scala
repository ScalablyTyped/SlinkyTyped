package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmfcSettings extends js.Object {
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[CmfcScte35Esam] = js.native
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[CmfcScte35Source] = js.native
}

object CmfcSettings {
  @scala.inline
  def apply(): CmfcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmfcSettings]
  }
  @scala.inline
  implicit class CmfcSettingsOps[Self <: CmfcSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScte35Esam(value: CmfcScte35Esam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Esam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Esam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Esam")(js.undefined)
        ret
    }
    @scala.inline
    def withScte35Source(value: CmfcScte35Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte35Source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte35Source")(js.undefined)
        ret
    }
  }
  
}

