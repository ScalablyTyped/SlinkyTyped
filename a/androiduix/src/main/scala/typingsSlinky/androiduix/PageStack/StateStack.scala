package typingsSlinky.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStack extends js.Object {
  var isRoot: js.UndefOr[Boolean] = js.native
  var pageId: String = js.native
  var stack: js.Array[StateSaved] = js.native
}

object StateStack {
  @scala.inline
  def apply(pageId: String, stack: js.Array[StateSaved]): StateStack = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateStack]
  }
  @scala.inline
  implicit class StateStackOps[Self <: StateStack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: js.Array[StateSaved]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.undefined)
        ret
    }
  }
  
}

