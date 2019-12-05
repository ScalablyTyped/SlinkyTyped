package typingsSlinky.reactDashSketchapp.libComponentsSvgClipPathMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipPathProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.undefined
  var id: String
}

object ClipPathProps {
  @scala.inline
  def apply(id: String, children: js.Array[TagMod[Any]] | TagMod[Any] = null): ClipPathProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathProps]
  }
}

