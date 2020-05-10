package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothAdditionalManifest extends js.Object {
  /**
    * Specify a name modifier that the service adds to the name of this manifest to make it different from the file names of the other main manifests in the output group. For example, say that the default main manifest for your Microsoft Smooth group is film-name.ismv. If you enter "-no-premium" for this setting, then the file name the service generates for this top-level manifest is film-name-no-premium.ismv.
    */
  var ManifestNameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * Specify the outputs that you want this additional top-level manifest to reference.
    */
  var SelectedOutputs: js.UndefOr[listOfStringMin1] = js.native
}

object MsSmoothAdditionalManifest {
  @scala.inline
  def apply(): MsSmoothAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothAdditionalManifest]
  }
  @scala.inline
  implicit class MsSmoothAdditionalManifestOps[Self <: MsSmoothAdditionalManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestNameModifier(value: stringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestNameModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestNameModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestNameModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOutputs(value: listOfStringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedOutputs")(js.undefined)
        ret
    }
  }
  
}

