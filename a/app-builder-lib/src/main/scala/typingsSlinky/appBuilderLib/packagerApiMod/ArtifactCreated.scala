package typingsSlinky.appBuilderLib.packagerApiMod

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsSlinky.electronPublish.mod.UploadTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactCreated extends UploadTask {
  val isWriteUpdateInfo: js.UndefOr[Boolean] = js.native
  val packager: PlatformPackager[_] = js.native
  val publishConfig: js.UndefOr[PublishConfiguration | Null] = js.native
  val target: Target | Null = js.native
  var updateInfo: js.UndefOr[js.Any] = js.native
}

object ArtifactCreated {
  @scala.inline
  def apply(file: String, packager: PlatformPackager[_]): ArtifactCreated = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactCreated]
  }
  @scala.inline
  implicit class ArtifactCreatedOps[Self <: ArtifactCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackager(value: PlatformPackager[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWriteUpdateInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteUpdateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWriteUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteUpdateInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishConfig(value: PublishConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishConfig")(null)
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withUpdateInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(js.undefined)
        ret
    }
  }
  
}

