package typingsSlinky.rax

import typingsSlinky.rax.mod.RaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :rax.rax.RaxNode}> */
@js.native
trait ReadonlychildrenRaxNode extends js.Object {
  val children: js.UndefOr[RaxNode] = js.native
}

object ReadonlychildrenRaxNode {
  @scala.inline
  def apply(): ReadonlychildrenRaxNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlychildrenRaxNode]
  }
  @scala.inline
  implicit class ReadonlychildrenRaxNodeOps[Self <: ReadonlychildrenRaxNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: RaxNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
  }
  
}

