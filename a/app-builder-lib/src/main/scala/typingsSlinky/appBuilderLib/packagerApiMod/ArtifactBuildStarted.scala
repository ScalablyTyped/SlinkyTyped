package typingsSlinky.appBuilderLib.packagerApiMod

import typingsSlinky.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactBuildStarted extends js.Object {
  val arch: Arch | Null = js.native
  val file: String = js.native
  val targetPresentableName: String = js.native
}

object ArtifactBuildStarted {
  @scala.inline
  def apply(file: String, targetPresentableName: String): ArtifactBuildStarted = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], targetPresentableName = targetPresentableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactBuildStarted]
  }
  @scala.inline
  implicit class ArtifactBuildStartedOps[Self <: ArtifactBuildStarted] (val x: Self) extends AnyVal {
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
    def withTargetPresentableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPresentableName")(value.asInstanceOf[js.Any])
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
  }
  
}

