package typingsSlinky.electronPublish.mod

import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  var arch: Arch | Null = js.native
  var file: String = js.native
  var fileContent: js.UndefOr[Buffer | Null] = js.native
  var safeArtifactName: js.UndefOr[String | Null] = js.native
}

object UploadTask {
  @scala.inline
  def apply(file: String): UploadTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTask]
  }
  @scala.inline
  implicit class UploadTaskOps[Self <: UploadTask] (val x: Self) extends AnyVal {
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
    def withArch(value: Arch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(null)
        ret
    }
    @scala.inline
    def withFileContent(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(js.undefined)
        ret
    }
    @scala.inline
    def withFileContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(null)
        ret
    }
    @scala.inline
    def withSafeArtifactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeArtifactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeArtifactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeArtifactName")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeArtifactNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeArtifactName")(null)
        ret
    }
  }
  
}

