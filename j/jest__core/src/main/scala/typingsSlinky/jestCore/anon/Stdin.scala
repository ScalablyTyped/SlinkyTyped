package typingsSlinky.jestCore.anon

import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stdin extends js.Object {
  var stdin: ReadStream = js.native
  var stdout: WriteStream = js.native
}

object Stdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): Stdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdin]
  }
  @scala.inline
  implicit class StdinOps[Self <: Stdin] (val x: Self) extends AnyVal {
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

