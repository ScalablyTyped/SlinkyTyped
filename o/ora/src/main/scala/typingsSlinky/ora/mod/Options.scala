package typingsSlinky.ora.mod

import typingsSlinky.cliSpinners.mod.SpinnerName
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  		Disable the spinner and all log text. All output is suppressed and `isEnabled` will be considered `false`.
  		@default false
  		*/
  val isSilent: js.UndefOr[Boolean] = js.native
  
  /**
  		Text or a function that returns text to display before the spinner. No prefix text will be displayed if set to an empty string.
  		*/
  val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDiscardStdin(value: Boolean): Self = this.set("discardStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscardStdin: Self = this.set("discardStdin", js.undefined)
    
    @scala.inline
    def setHideCursor(value: Boolean): Self = this.set("hideCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideCursor: Self = this.set("hideCursor", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setIsSilent(value: Boolean): Self = this.set("isSilent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSilent: Self = this.set("isSilent", js.undefined)
    
    @scala.inline
    def setPrefixTextFunction0(value: () => String): Self = this.set("prefixText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixText(value: String | PrefixTextGenerator): Self = this.set("prefixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixText: Self = this.set("prefixText", js.undefined)
    
    @scala.inline
    def setSpinner(value: SpinnerName | Spinner): Self = this.set("spinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinner: Self = this.set("spinner", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
