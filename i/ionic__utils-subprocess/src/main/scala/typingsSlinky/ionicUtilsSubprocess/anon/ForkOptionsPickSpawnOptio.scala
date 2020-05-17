package typingsSlinky.ionicUtilsSubprocess.anon

import typingsSlinky.node.NodeJS.ProcessEnv
import typingsSlinky.node.childProcessMod.SerializationType
import typingsSlinky.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.child_process.ForkOptions & std.Pick<node.child_process.SpawnOptions, 'stdio'> */
@js.native
trait ForkOptionsPickSpawnOptio extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var detached: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var execPath: js.UndefOr[String] = js.native
  var gid: js.UndefOr[Double] = js.native
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stdio: js.UndefOr[StdioOptions] = js.native
  var uid: js.UndefOr[Double] = js.native
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object ForkOptionsPickSpawnOptio {
  @scala.inline
  def apply(): ForkOptionsPickSpawnOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptionsPickSpawnOptio]
  }
  @scala.inline
  implicit class ForkOptionsPickSpawnOptioOps[Self <: ForkOptionsPickSpawnOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
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
    def withExecArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(js.undefined)
        ret
    }
    @scala.inline
    def withExecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialization(value: SerializationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(js.undefined)
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
    def withStdio(value: StdioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
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
    def withWindowsVerbatimArguments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsVerbatimArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsVerbatimArguments")(js.undefined)
        ret
    }
  }
  
}

