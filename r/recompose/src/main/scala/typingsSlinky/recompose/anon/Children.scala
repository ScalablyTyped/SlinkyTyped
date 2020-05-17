package typingsSlinky.recompose.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children[TInner] extends js.Object {
  def children(props: TInner): ReactElement = js.native
}

object Children {
  @scala.inline
  def apply[TInner](children: TInner => ReactElement): Children[TInner] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[TInner]]
  }
  @scala.inline
  implicit class ChildrenOps[Self[tinner] <: Children[tinner], TInner] (val x: Self[TInner]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInner] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInner]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInner] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInner] with Other]
    @scala.inline
    def withChildren(value: TInner => ReactElement): Self[TInner] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

