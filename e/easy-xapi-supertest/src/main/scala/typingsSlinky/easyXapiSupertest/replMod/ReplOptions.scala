package typingsSlinky.easyXapiSupertest.replMod

import typingsSlinky.easyXapiSupertest.NodeJS.ReadableStream
import typingsSlinky.easyXapiSupertest.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplOptions extends js.Object {
  var eval: js.UndefOr[js.Function] = js.native
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[ReadableStream] = js.native
  var output: js.UndefOr[WritableStream] = js.native
  var prompt: js.UndefOr[String] = js.native
  var terminal: js.UndefOr[Boolean] = js.native
  var useColors: js.UndefOr[Boolean] = js.native
  var useGlobal: js.UndefOr[Boolean] = js.native
  var writer: js.UndefOr[js.Function] = js.native
}

object ReplOptions {
  @scala.inline
  def apply(): ReplOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplOptions]
  }
  @scala.inline
  implicit class ReplOptionsOps[Self <: ReplOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEval(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(js.undefined)
        ret
    }
    @scala.inline
    def withUseColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGlobal")(js.undefined)
        ret
    }
    @scala.inline
    def withWriter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.undefined)
        ret
    }
  }
  
}

