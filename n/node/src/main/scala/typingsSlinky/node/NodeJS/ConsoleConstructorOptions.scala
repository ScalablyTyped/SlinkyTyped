package typingsSlinky.node.NodeJS

import typingsSlinky.node.nodeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleConstructorOptions extends js.Object {
  var colorMode: js.UndefOr[Boolean | auto] = js.native
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  var inspectOptions: js.UndefOr[InspectOptions] = js.native
  var stderr: js.UndefOr[WritableStream] = js.native
  var stdout: WritableStream = js.native
}

object ConsoleConstructorOptions {
  @scala.inline
  def apply(stdout: WritableStream): ConsoleConstructorOptions = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleConstructorOptions]
  }
  @scala.inline
  implicit class ConsoleConstructorOptionsOps[Self <: ConsoleConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdout(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectOptions(value: InspectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
  }
  
}

