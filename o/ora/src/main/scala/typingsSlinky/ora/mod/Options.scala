package typingsSlinky.ora.mod

import typingsSlinky.cliSpinners.mod.SpinnerName
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Color of the spinner.
  		@default 'cyan'
  		*/
  val color: js.UndefOr[Color] = js.native
  /**
  		Discard stdin input (except Ctrl+C) while running if it's TTY. This prevents the spinner from twitching on input, outputting broken lines on `Enter` key presses, and prevents buffering of input while the spinner is running.
  		
  		This has no effect on Windows as there's no good way to implement discarding stdin properly there.
  		@default true
  		*/
  val discardStdin: js.UndefOr[Boolean] = js.native
  /**
  		Set to `false` to stop Ora from hiding the cursor.
  		@default true
  		*/
  val hideCursor: js.UndefOr[Boolean] = js.native
  /**
  		Indent the spinner with the given number of spaces.
  		@default 0
  		*/
  val indent: js.UndefOr[Double] = js.native
  /**
  		Interval between each frame.
  		Spinners provide their own recommended interval, so you don't really need to specify this.
  		Default: Provided by the spinner or `100`.
  		*/
  val interval: js.UndefOr[Double] = js.native
  /**
  		Force enable/disable the spinner. If not specified, the spinner will be enabled if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
  		Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner, colors, and other ansi escape codes. It will still log text.
  		*/
  val isEnabled: js.UndefOr[Boolean] = js.native
  /**
  		Text to display before the spinner. No prefix text will be displayed if set to an empty string.
  		*/
  val prefixText: js.UndefOr[String] = js.native
  /**
  		Name of one of the provided spinners. See [`example.js`](https://github.com/BendingBender/ora/blob/master/example.js) in this repo if you want to test out different spinners. On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
  		@default 'dots'
  		Or an object like:
  		@example
  		```
  		{
  			interval: 80, // Optional
  			frames: ['-', '+', '-']
  		}
  		```
  		*/
  val spinner: js.UndefOr[SpinnerName | Spinner] = js.native
  /**
  		Stream to write the output.
  		You could for example set this to `process.stdout` instead.
  		@default process.stderr
  		*/
  val stream: js.UndefOr[WritableStream] = js.native
  /**
  		Text to display after the spinner.
  		*/
  val text: js.UndefOr[String] = js.native
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
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscardStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscardStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardStdin")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinner(value: SpinnerName | Spinner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

