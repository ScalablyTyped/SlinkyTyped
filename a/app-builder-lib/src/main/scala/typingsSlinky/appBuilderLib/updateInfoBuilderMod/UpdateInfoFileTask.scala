package typingsSlinky.appBuilderLib.updateInfoBuilderMod

import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsSlinky.builderUtilRuntime.updateInfoMod.UpdateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfoFileTask extends js.Object {
  val file: String = js.native
  val info: UpdateInfo = js.native
  val packager: PlatformPackager[_] = js.native
  val publishConfiguration: PublishConfiguration = js.native
}

object UpdateInfoFileTask {
  @scala.inline
  def apply(
    file: String,
    info: UpdateInfo,
    packager: PlatformPackager[_],
    publishConfiguration: PublishConfiguration
  ): UpdateInfoFileTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], publishConfiguration = publishConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfoFileTask]
  }
  @scala.inline
  implicit class UpdateInfoFileTaskOps[Self <: UpdateInfoFileTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: UpdateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackager(value: PlatformPackager[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishConfiguration(value: PublishConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

