package typingsSlinky.node.replMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.readlineMod.AsyncCompleter
import typingsSlinky.node.readlineMod.Completer
import typingsSlinky.node.readlineMod.CompleterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplOptions extends js.Object {
  /**
    * Stop evaluating the current piece of code when `SIGINT` is received, i.e. `Ctrl+C` is
    * pressed. This cannot be used together with a custom `eval` function.
    * Default: `false`.
    */
  var breakEvalOnSigint: js.UndefOr[Boolean] = js.native
  /**
    * An optional function used for custom Tab auto completion.
    *
    * @see https://nodejs.org/dist/latest-v11.x/docs/api/readline.html#readline_use_of_the_completer_function
    */
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.native
  /**
    * The function to be used when evaluating each given line of input.
    * Default: an async wrapper for the JavaScript `eval()` function. An `eval` function can
    * error with `repl.Recoverable` to indicate the input was incomplete and prompt for
    * additional lines.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_default_evaluation
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_custom_evaluation_functions
    */
  var eval: js.UndefOr[REPLEval] = js.native
  /**
    * If `true`, specifies that the default writer will not output the return value of a
    * command if it evaluates to `undefined`.
    * Default: `false`.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  /**
    * The `Readable` stream from which REPL input will be read.
    * Default: `process.stdin`
    */
  var input: js.UndefOr[ReadableStream] = js.native
  /**
    * The `Writable` stream to which REPL output will be written.
    * Default: `process.stdout`
    */
  var output: js.UndefOr[WritableStream] = js.native
  /**
    * Defines if the repl prints output previews or not.
    * @default `true` Always `false` in case `terminal` is falsy.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * The input prompt to display.
    * Default: `"> "`
    */
  var prompt: js.UndefOr[String] = js.native
  /**
    * A flag that specifies whether the default evaluator executes all JavaScript commands in
    * strict mode or default (sloppy) mode.
    * Accepted values are:
    * - `repl.REPL_MODE_SLOPPY` - evaluates expressions in sloppy mode.
    * - `repl.REPL_MODE_STRICT` - evaluates expressions in strict mode. This is equivalent to
    *   prefacing every repl statement with `'use strict'`.
    */
  var replMode: js.UndefOr[js.Symbol] = js.native
  /**
    * If `true`, specifies that the output should be treated as a TTY terminal, and have
    * ANSI/VT100 escape codes written to it.
    * Default: checking the value of the `isTTY` property on the output stream upon
    * instantiation.
    */
  var terminal: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, specifies that the default `writer` function should include ANSI color
    * styling to REPL output. If a custom `writer` function is provided then this has no
    * effect.
    * Default: the REPL instance's `terminal` value.
    */
  var useColors: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, specifies that the default evaluation function will use the JavaScript
    * `global` as the context as opposed to creating a new separate context for the REPL
    * instance. The node CLI REPL sets this value to `true`.
    * Default: `false`.
    */
  var useGlobal: js.UndefOr[Boolean] = js.native
  /**
    * The function to invoke to format the output of each command before writing to `output`.
    * Default: a wrapper for `util.inspect`.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_customizing_repl_output
    */
  var writer: js.UndefOr[REPLWriter] = js.native
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
    def withBreakEvalOnSigint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakEvalOnSigint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakEvalOnSigint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakEvalOnSigint")(js.undefined)
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
    def withEval(value: REPLEval): Self = {
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
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
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
    def withReplMode(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replMode")(js.undefined)
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
    def withWriter(value: REPLWriter): Self = {
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

