package typingsSlinky.eslint

import typingsSlinky.eslint.mod.AST.SourceLocation
import typingsSlinky.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoc extends ReportDescriptorLocation {
  var loc: SourceLocation | AnonColumn = js.native
}

object AnonLoc {
  @scala.inline
  def apply(loc: SourceLocation | AnonColumn): AnonLoc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoc]
  }
  @scala.inline
  implicit class AnonLocOps[Self <: AnonLoc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoc(value: SourceLocation | AnonColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

