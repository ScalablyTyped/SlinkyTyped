package typingsSlinky.baseui

import slinky.core.TagMod
import typingsSlinky.baseui.treeDashViewMod.TreeViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPropsReactNode extends js.Object {
  def children(props: TreeViewProps): TagMod[Any]
}

object Anon_ChildrenPropsReactNode {
  @scala.inline
  def apply(children: TreeViewProps => TagMod[Any]): Anon_ChildrenPropsReactNode = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenPropsReactNode]
  }
}

