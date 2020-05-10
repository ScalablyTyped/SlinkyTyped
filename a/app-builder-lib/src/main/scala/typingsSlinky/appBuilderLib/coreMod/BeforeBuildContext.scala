package typingsSlinky.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeBuildContext extends js.Object {
  val appDir: String = js.native
  val arch: String = js.native
  val electronVersion: String = js.native
  val platform: Platform = js.native
}

object BeforeBuildContext {
  @scala.inline
  def apply(appDir: String, arch: String, electronVersion: String, platform: Platform): BeforeBuildContext = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronVersion = electronVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBuildContext]
  }
  @scala.inline
  implicit class BeforeBuildContextOps[Self <: BeforeBuildContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectronVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

