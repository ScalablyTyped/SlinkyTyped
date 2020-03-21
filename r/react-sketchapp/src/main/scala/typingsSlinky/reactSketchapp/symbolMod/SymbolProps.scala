package typingsSlinky.reactSketchapp.symbolMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any]
  var id: String
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object SymbolProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any],
    id: String,
    preserveAspectRatio: String = null,
    viewBox: String = null
  ): SymbolProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolProps]
  }
}

