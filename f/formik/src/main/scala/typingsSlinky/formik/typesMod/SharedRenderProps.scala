package typingsSlinky.formik.typesMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ T, TagMod[Any]]] = js.undefined
  var component: js.UndefOr[String | (ReactComponentClass[T | Unit])] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ T, TagMod[Any]]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[T](
    children: /* props */ T => TagMod[Any] = null,
    component: String | (ReactComponentClass[T | Unit]) = null,
    render: /* props */ T => TagMod[Any] = null
  ): SharedRenderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[SharedRenderProps[T]]
  }
}

