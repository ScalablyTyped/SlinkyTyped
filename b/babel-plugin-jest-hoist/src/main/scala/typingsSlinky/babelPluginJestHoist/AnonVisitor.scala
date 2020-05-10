package typingsSlinky.babelPluginJestHoist

import typingsSlinky.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVisitor extends js.Object {
  var visitor: Visitor[js.Object] = js.native
}

object AnonVisitor {
  @scala.inline
  def apply(visitor: Visitor[js.Object]): AnonVisitor = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisitor]
  }
  @scala.inline
  implicit class AnonVisitorOps[Self <: AnonVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitor(value: Visitor[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

