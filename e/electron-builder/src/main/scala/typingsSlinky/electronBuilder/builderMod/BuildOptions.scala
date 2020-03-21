package typingsSlinky.electronBuilder.builderMod

import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.appBuilderLib.coreMod.Platform
import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.electronPublish.mod.PublishOptions
import typingsSlinky.electronPublish.mod.PublishPolicy
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions
  extends PackagerOptions
     with PublishOptions

object BuildOptions {
  @scala.inline
  def apply(
    config: Configuration | String = null,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platformPackagerFactory: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_] = null,
    prepackaged: String = null,
    projectDir: String = null,
    publish: PublishPolicy = null,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(platformPackagerFactory))
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged.asInstanceOf[js.Any])
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
}

