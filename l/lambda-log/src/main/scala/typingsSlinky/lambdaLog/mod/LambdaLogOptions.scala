package typingsSlinky.lambdaLog.mod

import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaLogOptions extends js.Object {
  // Enable debugging mode (log.debug messages)
  var debug: js.UndefOr[Boolean] = js.native
  // Enable development mode which pretty-prints the log object to the console
  var dev: js.UndefOr[Boolean] = js.native
  // Optional function which will run for every log to inject dynamic metadata
  var dynamicMeta: js.UndefOr[js.Function1[/* message */ LogMessage, _]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  // Optional replacer function for `JSON.stringify`
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  // Disables logging to the console (used for testing)
  var silent: js.UndefOr[Boolean] = js.native
  // Optional stream to write stderr messages to
  var stderrStream: js.UndefOr[WriteStream] = js.native
  // Optional stream to write stdout messages to
  var stdoutStream: js.UndefOr[WriteStream] = js.native
  // Global tags array to include with every log
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object LambdaLogOptions {
  @scala.inline
  def apply(): LambdaLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaLogOptions]
  }
  @scala.inline
  implicit class LambdaLogOptionsOps[Self <: LambdaLogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicMeta(value: /* message */ LogMessage => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMeta")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDynamicMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
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
    def withStderrStream(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderrStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrStream")(js.undefined)
        ret
    }
    @scala.inline
    def withStdoutStream(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStream")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

