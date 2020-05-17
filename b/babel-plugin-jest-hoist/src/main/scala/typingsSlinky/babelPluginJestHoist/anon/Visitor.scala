package typingsSlinky.babelPluginJestHoist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  var visitor: typingsSlinky.babelTraverse.mod.Visitor[js.Object] = js.native
}

object Visitor {
  @scala.inline
  def apply(visitor: typingsSlinky.babelTraverse.mod.Visitor[js.Object]): Visitor = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitor(value: typingsSlinky.babelTraverse.mod.Visitor[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

