package typingsSlinky.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WinswConfig extends js.Object {
  var dependencies: String | js.Array[String] = js.native
  var description: js.UndefOr[String] = js.native
  var env: EnvironmentPair | js.Array[EnvironmentPair] = js.native
  var id: String = js.native
  var logOnAs: User = js.native
  var logmode: LogMode = js.native
  var logpath: String = js.native
  var name: String = js.native
  var nodeOptions: js.UndefOr[String | js.Array[String]] = js.native
  var script: String = js.native
  var workingdirectory: String = js.native
  var wrapperArgs: String = js.native
}

object WinswConfig {
  @scala.inline
  def apply(
    dependencies: String | js.Array[String],
    env: EnvironmentPair | js.Array[EnvironmentPair],
    id: String,
    logOnAs: User,
    logmode: LogMode,
    logpath: String,
    name: String,
    script: String,
    workingdirectory: String,
    wrapperArgs: String
  ): WinswConfig = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logOnAs = logOnAs.asInstanceOf[js.Any], logmode = logmode.asInstanceOf[js.Any], logpath = logpath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], workingdirectory = workingdirectory.asInstanceOf[js.Any], wrapperArgs = wrapperArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinswConfig]
  }
  @scala.inline
  implicit class WinswConfigOps[Self <: WinswConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogOnAs(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOnAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogmode(value: LogMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingdirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeOptions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOptions")(js.undefined)
        ret
    }
  }
  
}

