package typingsSlinky.reactDashLazylog.buildLinePartMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashLazylog.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ String, TagMod[Any]]] = js.undefined
  var part: Anon_Text
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LinePartProps {
  @scala.inline
  def apply(part: Anon_Text, format: /* text */ String => TagMod[Any] = null, style: CSSProperties = null): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartProps]
  }
}

