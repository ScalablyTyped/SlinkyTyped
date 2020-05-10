package typingsSlinky.appBuilderLib.snapOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.appBuilderLib.appBuilderLibStrings.classic
import typingsSlinky.appBuilderLib.appBuilderLibStrings.devel
import typingsSlinky.appBuilderLib.appBuilderLibStrings.devmode
import typingsSlinky.appBuilderLib.appBuilderLibStrings.stable
import typingsSlinky.appBuilderLib.appBuilderLibStrings.strict
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import typingsSlinky.appBuilderLib.linuxOptionsMod.CommonLinuxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  /**
    * Specifies any [parts](https://snapcraft.io/docs/reference/parts) that should be built before this part.
    * Defaults to `["desktop-gtk2""]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom parts `foo` in addition to defaults.
    */
  val after: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The list of features that must be supported by the core in order for this snap to install.
    */
  val assumes: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * The list of debian packages needs to be installed for building this snap.
    */
  val buildPackages: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The type of [confinement](https://snapcraft.io/docs/reference/confinement) supported by the snap.
    * @default strict
    */
  val confinement: js.UndefOr[devmode | strict | classic | Null] = js.native
  /**
    * The custom environment. Defaults to `{"TMPDIR: "$XDG_RUNTIME_DIR"}`. If you set custom, it will be merged with default.
    */
  val environment: js.UndefOr[StringDictionary[String] | Null] = js.native
  /**
    * The quality grade of the snap. It can be either `devel` (i.e. a development version of the snap, so not to be published to the “stable” or “candidate” channels) or “stable” (i.e. a stable release or release candidate, which can be released to all channels).
    * @default stable
    */
  val grade: js.UndefOr[devel | stable | Null] = js.native
  /**
    * The [hooks](https://docs.snapcraft.io/build-snaps/hooks) directory, relative to `build` (build resources directory).
    * @default build/snap-hooks
    */
  val hooks: js.UndefOr[String | Null] = js.native
  /**
    * The list of [plugs](https://snapcraft.io/docs/reference/interfaces).
    * Defaults to `["desktop", "desktop-legacy", "home", "x11", "unity7", "browser-support", "network", "gsettings", "pulseaudio", "opengl"]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom plug `foo` in addition to defaults.
    *
    * Additional attributes can be specified using object instead of just name of plug:
    * ```
    *[
    *  {
    *    "browser-sandbox": {
    *      "interface": "browser-support",
    *      "allow-sandbox": true
    *    },
    *  },
    *  "another-simple-plug-name"
    *]
    * ```
    */
  val plugs: js.UndefOr[(js.Array[String | PlugDescriptor]) | PlugDescriptor | Null] = js.native
  /**
    * The list of Ubuntu packages to use that are needed to support the `app` part creation. Like `depends` for `deb`.
    * Defaults to `["libasound2", "libgconf2-4", "libnotify4", "libnspr4", "libnss3", "libpcre3", "libpulse0", "libxss1", "libxtst6"]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom package `foo` in addition to defaults.
    */
  val stagePackages: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The 78 character long summary. Defaults to [productName](/configuration/configuration#Configuration-productName).
    */
  val summary: js.UndefOr[String | Null] = js.native
  /**
    * Whether to use template snap. Defaults to `true` if `stagePackages` not specified.
    */
  val useTemplateApp: js.UndefOr[Boolean] = js.native
}

object SnapOptions {
  @scala.inline
  def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  @scala.inline
  implicit class SnapOptionsOps[Self <: SnapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(null)
        ret
    }
    @scala.inline
    def withAssumes(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumes")(js.undefined)
        ret
    }
    @scala.inline
    def withAssumesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumes")(null)
        ret
    }
    @scala.inline
    def withBuildPackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPackages")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildPackagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPackages")(null)
        ret
    }
    @scala.inline
    def withConfinement(value: devmode | strict | classic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confinement")(js.undefined)
        ret
    }
    @scala.inline
    def withConfinementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confinement")(null)
        ret
    }
    @scala.inline
    def withEnvironment(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(null)
        ret
    }
    @scala.inline
    def withGrade(value: devel | stable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(js.undefined)
        ret
    }
    @scala.inline
    def withGradeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(null)
        ret
    }
    @scala.inline
    def withHooks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(null)
        ret
    }
    @scala.inline
    def withPlugs(value: (js.Array[String | PlugDescriptor]) | PlugDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugs")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugs")(null)
        ret
    }
    @scala.inline
    def withStagePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withStagePackagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePackages")(null)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(null)
        ret
    }
    @scala.inline
    def withUseTemplateApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTemplateApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTemplateApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTemplateApp")(js.undefined)
        ret
    }
  }
  
}

