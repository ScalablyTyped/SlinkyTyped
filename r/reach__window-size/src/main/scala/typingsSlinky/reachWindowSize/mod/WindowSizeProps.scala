package typingsSlinky.reachWindowSize.mod

import slinky.core.TagMod
import typingsSlinky.reachWindowSize.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowSizeProps extends js.Object {
  def children(size: AnonHeight): TagMod[Any] = js.native
}

object WindowSizeProps {
  @scala.inline
  def apply(children: AnonHeight => TagMod[Any]): WindowSizeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WindowSizeProps]
  }
  @scala.inline
  implicit class WindowSizePropsOps[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: AnonHeight => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

