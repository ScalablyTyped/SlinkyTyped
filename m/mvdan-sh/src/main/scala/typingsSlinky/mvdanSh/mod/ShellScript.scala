package typingsSlinky.mvdanSh.mod

import typingsSlinky.mvdanSh.AnonBinaryNextLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellScript extends js.Object {
  var syntax: AnonBinaryNextLine = js.native
}

object ShellScript {
  @scala.inline
  def apply(syntax: AnonBinaryNextLine): ShellScript = {
    val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellScript]
  }
  @scala.inline
  implicit class ShellScriptOps[Self <: ShellScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyntax(value: AnonBinaryNextLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

