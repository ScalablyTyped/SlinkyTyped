package typingsSlinky.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDependencyConfig extends js.Object {
  // An array of commands that ship with the dependency
  var commands: js.Array[Command] = js.native
  // Additional dependency settings
  var dependency: js.UndefOr[typingsSlinky.reactNativeCommunityCli.anon.Hooks] = js.native
  // Haste config defined by legacy `rnpm`
  var haste: js.UndefOr[typingsSlinky.reactNativeCommunityCli.anon.Platforms] = js.native
  // An array of extra platforms to load
  var platforms: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object UserDependencyConfig {
  @scala.inline
  def apply(commands: js.Array[Command]): UserDependencyConfig = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDependencyConfig]
  }
  @scala.inline
  implicit class UserDependencyConfigOps[Self <: UserDependencyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: js.Array[Command]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependency(value: typingsSlinky.reactNativeCommunityCli.anon.Hooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(js.undefined)
        ret
    }
    @scala.inline
    def withHaste(value: typingsSlinky.reactNativeCommunityCli.anon.Platforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haste")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
  }
  
}

