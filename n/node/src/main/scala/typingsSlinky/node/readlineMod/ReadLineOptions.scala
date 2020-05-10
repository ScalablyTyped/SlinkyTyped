package typingsSlinky.node.readlineMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.native
  var crlfDelay: js.UndefOr[Double] = js.native
  var escapeCodeTimeout: js.UndefOr[Double] = js.native
  var historySize: js.UndefOr[Double] = js.native
  var input: ReadableStream = js.native
  var output: js.UndefOr[WritableStream] = js.native
  var prompt: js.UndefOr[String] = js.native
  var removeHistoryDuplicates: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var terminal: js.UndefOr[Boolean] = js.native
}

object ReadLineOptions {
  @scala.inline
  def apply(input: ReadableStream): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
  @scala.inline
  implicit class ReadLineOptionsOps[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleterFunction2(
      value: (/* line */ String, /* callback */ js.Function2[
          /* err */ js.UndefOr[Null | js.Error], 
          /* result */ js.UndefOr[CompleterResult], 
          Unit
        ]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompleterFunction1(value: /* line */ String => CompleterResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompleter(value: Completer | AsyncCompleter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(js.undefined)
        ret
    }
    @scala.inline
    def withCrlfDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlfDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrlfDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlfDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeCodeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeCodeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeCodeTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeCodeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHistorySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistorySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historySize")(js.undefined)
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
    def withRemoveHistoryDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHistoryDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveHistoryDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHistoryDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
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
  }
  
}

