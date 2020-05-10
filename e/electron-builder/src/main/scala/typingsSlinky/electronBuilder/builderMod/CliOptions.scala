package typingsSlinky.electronBuilder.builderMod

import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliOptions
  extends PackagerOptions
     with PublishOptions {
  var arm64: js.UndefOr[Boolean] = js.native
  var armv7l: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[Boolean] = js.native
  var ia32: js.UndefOr[Boolean] = js.native
  var x64: js.UndefOr[Boolean] = js.native
}

object CliOptions {
  @scala.inline
  def apply(): CliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliOptions]
  }
  @scala.inline
  implicit class CliOptionsOps[Self <: CliOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArm64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arm64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArm64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arm64")(js.undefined)
        ret
    }
    @scala.inline
    def withArmv7l(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armv7l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArmv7l: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armv7l")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withIa32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ia32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIa32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ia32")(js.undefined)
        ret
    }
    @scala.inline
    def withX64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x64")(js.undefined)
        ret
    }
  }
  
}

