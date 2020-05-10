package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkOptionsVisit[NodeType /* <: CssNode */] extends js.Object {
  var enter: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  var leave: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any = js.native
}

object WalkOptionsVisit {
  @scala.inline
  def apply[NodeType](
    visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
  ): WalkOptionsVisit[NodeType] = {
    val __obj = js.Dynamic.literal(visit = visit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsVisit[NodeType]]
  }
  @scala.inline
  implicit class WalkOptionsVisitOps[Self[nodetype] <: WalkOptionsVisit[nodetype], NodeType] (val x: Self[NodeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NodeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NodeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[NodeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[NodeType] with Other]
    @scala.inline
    def withVisit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
    ): Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnter(value: EnterOrLeaveFn[NodeType]): Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: EnterOrLeaveFn[NodeType]): Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeave: Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self[NodeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
  }
  
}

