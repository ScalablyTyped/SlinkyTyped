package typingsSlinky.hexo.anon

import typingsSlinky.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  val args: ParsedArgs = js.native
  val debug: Boolean = js.native
  val env: String = js.native
  val init: Boolean = js.native
  val safe: Boolean = js.native
  val silent: Boolean = js.native
  val version: String = js.native
}

object Args {
  @scala.inline
  def apply(
    args: ParsedArgs,
    debug: Boolean,
    env: String,
    init: Boolean,
    safe: Boolean,
    silent: Boolean,
    version: String
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: ParsedArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

