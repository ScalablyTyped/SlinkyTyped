package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import typingsSlinky.baseui.Anon_ListItem
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionListProps extends js.Object {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.native
  var item: js.Any = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  var overrides: js.UndefOr[Anon_ListItem] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  var size: js.UndefOr[default_ | compact] = js.native
  def getItemLabel(item: js.Any): TagMod[Any] = js.native
}

