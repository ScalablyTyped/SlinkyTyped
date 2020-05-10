package typingsSlinky.appBuilderLib.configurationMod

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterPackContext extends js.Object {
  val appOutDir: String = js.native
  val arch: Arch = js.native
  val electronPlatformName: String = js.native
  val outDir: String = js.native
  val packager: PlatformPackager[_] = js.native
  val targets: js.Array[Target] = js.native
}

object AfterPackContext {
  @scala.inline
  def apply(
    appOutDir: String,
    arch: Arch,
    electronPlatformName: String,
    outDir: String,
    packager: PlatformPackager[_],
    targets: js.Array[Target]
  ): AfterPackContext = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronPlatformName = electronPlatformName.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterPackContext]
  }
  @scala.inline
  implicit class AfterPackContextOps[Self <: AfterPackContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appOutDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArch(value: Arch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectronPlatformName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronPlatformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackager(value: PlatformPackager[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[Target]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

