package typingsSlinky.ink.mod

import typingsSlinky.node.processMod._Global_.NodeJS.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdinProps extends js.Object {
  /**
  	 * A boolean flag determining if the current `stdin` supports `setRawMode`. A component using `setRawMode` might want to use `isRawModeSupported` to nicely fall back in environments where raw mode is not supported.
  	 */
  val isRawModeSupported: Boolean = js.native
  /**
  	 * Ink exposes this function via own `<StdinContext>` to be able to handle Ctrl+C, that's why you should use Ink's `setRawMode` instead of `process.stdin.setRawMode`.
  	 * If the `stdin` stream passed to Ink does not support setRawMode, this function does nothing.
  	 */
  val setRawMode: js.Function1[/* mode */ Boolean, this.type] = js.native
  /**
  	 * Stdin stream passed to `render()` in `options.stdin` or `process.stdin` by default. Useful if your app needs to handle user input.
  	 */
  val stdin: ReadStream = js.native
}

object StdinProps {
  @scala.inline
  def apply(isRawModeSupported: Boolean, setRawMode: /* mode */ Boolean => StdinProps, stdin: ReadStream): StdinProps = {
    val __obj = js.Dynamic.literal(isRawModeSupported = isRawModeSupported.asInstanceOf[js.Any], setRawMode = js.Any.fromFunction1(setRawMode), stdin = stdin.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdinProps]
  }
  @scala.inline
  implicit class StdinPropsOps[Self <: StdinProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRawModeSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRawModeSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRawMode(value: /* mode */ Boolean => StdinProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStdin(value: ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

