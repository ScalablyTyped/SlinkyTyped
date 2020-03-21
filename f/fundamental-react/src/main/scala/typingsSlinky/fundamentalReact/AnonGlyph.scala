package typingsSlinky.fundamentalReact

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlyph extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.undefined
  var glyph: String
  var label: js.UndefOr[String] = js.undefined
  var menu: js.UndefOr[TagMod[Any]] = js.undefined
  var notificationCount: Double
}

object AnonGlyph {
  @scala.inline
  def apply(
    glyph: String,
    notificationCount: Double,
    callback: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    label: String = null,
    menu: TagMod[Any] = null
  ): AnonGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlyph]
  }
}

