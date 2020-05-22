package typingsSlinky.linguiMacro.renderMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[TagMod[Any]] = js.undefined
}

object RenderProps {
  @scala.inline
  def apply(className: String = null, description: String = null, render: TagMod[Any] = null): RenderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

