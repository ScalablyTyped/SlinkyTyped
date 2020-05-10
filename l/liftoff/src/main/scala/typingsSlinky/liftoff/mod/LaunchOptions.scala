package typingsSlinky.liftoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchOptions extends js.Object {
  var completion: js.UndefOr[String] = js.native
  /**
    * Don't search for a config, use the one provided.
    * **Note**: Liftoff will assume the current working directory is the directory containing the config file
    * unless an alternate location is explicitly specified using `cwd`.
    * @default null
    */
  var configPath: js.UndefOr[String] = js.native
  /**
    * Change the current working directory for this launch. Relative paths are calculated against `process.cwd()`.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Allows you to force node or V8 flags during the launch.
    * This is useful if you need to make sure certain flags will always be enabled
    * or if you need to enable flags that don't show up in `opts.v8flags`
    * (as these flags aren't validated against opts.v8flags).
    * @default null
    */
  var forcedFlags: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])
  ] = js.native
  /**
    * A string or array of modules to attempt requiring from the local
    * working directory before invoking the launch callback.
    * @default null
    */
  var require: js.UndefOr[String | js.Array[_]] = js.native
}

object LaunchOptions {
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
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
    def withForcedFlagsFunction1(value: /* env */ LiftoffEnv => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcedFlags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForcedFlags(value: String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcedFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcedFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcedFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
  }
  
}

