package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.Etc1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasisTranscodeConfiguration extends js.Object {
  /**
    * If mipmap levels should be loaded for transcoded images (Default: true)
    */
  var loadMipmapLevels: js.UndefOr[Boolean] = js.native
  /**
    * Index of a single image to load (Default: all images)
    */
  var loadSingleImage: js.UndefOr[Double] = js.native
  /**
    * Supported compression formats used to determine the supported output format of the transcoder
    */
  var supportedCompressionFormats: js.UndefOr[Etc1] = js.native
}

object BasisTranscodeConfiguration {
  @scala.inline
  def apply(): BasisTranscodeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasisTranscodeConfiguration]
  }
  @scala.inline
  implicit class BasisTranscodeConfigurationOps[Self <: BasisTranscodeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadMipmapLevels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMipmapLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMipmapLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMipmapLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSingleImage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSingleImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadSingleImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSingleImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCompressionFormats(value: Etc1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCompressionFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCompressionFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCompressionFormats")(js.undefined)
        ret
    }
  }
  
}

