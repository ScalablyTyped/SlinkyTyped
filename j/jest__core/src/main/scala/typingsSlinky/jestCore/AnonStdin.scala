package typingsSlinky.jestCore

import typingsSlinky.node.processMod._Global_.NodeJS.ReadStream
import typingsSlinky.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStdin extends js.Object {
  var stdin: ReadStream = js.native
  var stdout: WriteStream = js.native
}

object AnonStdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): AnonStdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStdin]
  }
  @scala.inline
  implicit class AnonStdinOps[Self <: AnonStdin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStdin(value: ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

