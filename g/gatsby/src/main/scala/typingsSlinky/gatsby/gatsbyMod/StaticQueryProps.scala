package typingsSlinky.gatsby.gatsbyMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticQueryProps[T] extends js.Object {
  var children: js.UndefOr[RenderCallback[T]] = js.undefined
  var query: js.Any
  var render: js.UndefOr[RenderCallback[T]] = js.undefined
}

object StaticQueryProps {
  @scala.inline
  def apply[T](query: js.Any, children: T => TagMod[Any] = null, render: T => TagMod[Any] = null): StaticQueryProps[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[StaticQueryProps[T]]
  }
}

