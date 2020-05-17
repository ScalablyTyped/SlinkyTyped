package typingsSlinky.foreverMonitor.mod

import typingsSlinky.foreverMonitor.anon.Args
import typingsSlinky.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var command: js.UndefOr[String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var errFile: js.UndefOr[String] = js.native
  var killTree: js.UndefOr[Boolean] = js.native
  var logFile: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var minUptime: js.UndefOr[Double] = js.native
  var outFile: js.UndefOr[String] = js.native
  var parser: js.UndefOr[js.Function2[/* command */ String, /* args */ js.Array[String], Args]] = js.native
  var pidFile: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var sourceDir: js.UndefOr[String] = js.native
  var spawnWith: js.UndefOr[SpawnWith] = js.native
  var spinSleepTime: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchDirectory: js.UndefOr[String] = js.native
  var watchIgnoreDotFiles: js.UndefOr[Boolean] = js.native
  var watchIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withErrFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKillTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killTree")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMinUptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minUptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinUptime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minUptime")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: (/* command */ String, /* args */ js.Array[String]) => Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPidFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPidFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pidFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSpawnWith(value: SpawnWith): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpawnWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnWith")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinSleepTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinSleepTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinSleepTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinSleepTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchIgnoreDotFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIgnoreDotFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchIgnoreDotFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIgnoreDotFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchIgnorePatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchIgnorePatterns")(js.undefined)
        ret
    }
  }
  
}

