package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transcode Settings
  */
@js.native
trait SchemaTranscodeSetting extends js.Object {
  /**
    * Whitelist of video formats to be served to this placement. Set this list
    * to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#transcodeSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTranscodeSetting {
  @scala.inline
  def apply(): SchemaTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranscodeSetting]
  }
  @scala.inline
  implicit class SchemaTranscodeSettingOps[Self <: SchemaTranscodeSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabledVideoFormats(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledVideoFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledVideoFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledVideoFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

