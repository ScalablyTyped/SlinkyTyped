package typingsSlinky.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCli.AnonAssets
import typingsSlinky.reactNativeCommunityCli.AnonDictname
import typingsSlinky.reactNativeCommunityCli.AnonPlatforms
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends js.Object {
  // An array of assets as defined by the user
  var assets: js.Array[String] = js.native
  // An array of commands that are present in 3rd party packages
  var commands: js.Array[Command] = js.native
  // Map of the dependencies that are present in the project
  var dependencies: StringDictionary[AnonAssets] = js.native
  // Haste configuration resolved based on available plugins
  var haste: AnonPlatforms = js.native
  // Map of available platforms (built-ins and dynamically loaded)
  var platforms: AnonDictname = js.native
  // Object that contains configuration for a project (null, when platform not available)
  var project: Record[String, _] = js.native
  // Path to React Native source
  var reactNativePath: String = js.native
  // Root where the configuration has been resolved from
  var root: String = js.native
}

object Config_ {
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command],
    dependencies: StringDictionary[AnonAssets],
    haste: AnonPlatforms,
    platforms: AnonDictname,
    project: Record[String, _],
    reactNativePath: String,
    root: String
  ): Config_ = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: js.Array[Command]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: StringDictionary[AnonAssets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaste(value: AnonPlatforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatforms(value: AnonDictname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactNativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactNativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

