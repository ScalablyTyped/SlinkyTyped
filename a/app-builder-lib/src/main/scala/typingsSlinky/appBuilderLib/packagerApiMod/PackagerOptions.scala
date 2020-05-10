package typingsSlinky.appBuilderLib.packagerApiMod

import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.appBuilderLib.coreMod.Platform
import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackagerOptions extends js.Object {
  val config: js.UndefOr[Configuration | String | Null] = js.native
  val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[Boolean]]] = js.native
  var linux: js.UndefOr[js.Array[String]] = js.native
  var mac: js.UndefOr[js.Array[String]] = js.native
  var platformPackagerFactory: js.UndefOr[
    (js.Function2[/* info */ Packager, /* platform */ Platform, PlatformPackager[_]]) | Null
  ] = js.native
  val prepackaged: js.UndefOr[String | Null] = js.native
  var projectDir: js.UndefOr[String | Null] = js.native
  var targets: js.UndefOr[Map[Platform, Map[Arch, js.Array[String]]]] = js.native
  var win: js.UndefOr[js.Array[String]] = js.native
}

object PackagerOptions {
  @scala.inline
  def apply(): PackagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagerOptions]
  }
  @scala.inline
  implicit class PackagerOptionsOps[Self <: PackagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Configuration | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(null)
        ret
    }
    @scala.inline
    def withEffectiveOptionComputed(value: /* options */ js.Any => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEffectiveOptionComputed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveOptionComputed")(js.undefined)
        ret
    }
    @scala.inline
    def withLinux(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(js.undefined)
        ret
    }
    @scala.inline
    def withMac(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformPackagerFactory(value: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlatformPackagerFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformPackagerFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformPackagerFactoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformPackagerFactory")(null)
        ret
    }
    @scala.inline
    def withPrepackaged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepackaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepackaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepackaged")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepackagedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepackaged")(null)
        ret
    }
    @scala.inline
    def withProjectDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDir")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectDirNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDir")(null)
        ret
    }
    @scala.inline
    def withTargets(value: Map[Platform, Map[Arch, js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withWin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(js.undefined)
        ret
    }
  }
  
}

