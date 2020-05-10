package typingsSlinky.ink.mod

import typingsSlinky.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdoutProps extends js.Object {
  /**
  	 * Stdout stream passed to `render()` in `options.stdout` or `process.stdout` by default.
  	 */
  val stdout: WriteStream = js.native
}

object StdoutProps {
  @scala.inline
  def apply(stdout: WriteStream): StdoutProps = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdoutProps]
  }
  @scala.inline
  implicit class StdoutPropsOps[Self <: StdoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdout(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

