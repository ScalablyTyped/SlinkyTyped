package typingsSlinky.baseui

import slinky.core.TagMod
import typingsSlinky.baseui.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  def children(props: PopoverProps with js.Object): TagMod[Any]
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(children: PopoverProps with js.Object => TagMod[Any]): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

