package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssManifest extends js.Object {
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.native
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.StreamSelection] = js.native
}

object MssManifest {
  @scala.inline
  def apply(): MssManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssManifest]
  }
  @scala.inline
  implicit class MssManifestOps[Self <: MssManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSelection(value: StreamSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(js.undefined)
        ret
    }
  }
  
}

