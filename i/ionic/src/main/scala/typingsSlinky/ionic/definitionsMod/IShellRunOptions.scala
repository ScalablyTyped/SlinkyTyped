package typingsSlinky.ionic.definitionsMod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellRunOptions extends IShellOutputOptions {
  var killOnExit: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
  var truncateErrorOutput: js.UndefOr[Double] = js.native
}

object IShellRunOptions {
  @scala.inline
  def apply(): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellRunOptions]
  }
  @scala.inline
  implicit class IShellRunOptionsOps[Self <: IShellRunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKillOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killOnExit")(js.undefined)
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
    def withTruncateErrorOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateErrorOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateErrorOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateErrorOutput")(js.undefined)
        ret
    }
  }
  
}

