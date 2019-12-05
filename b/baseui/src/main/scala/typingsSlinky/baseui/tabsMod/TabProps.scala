package typingsSlinky.baseui.tabsMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps extends js.Object {
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
  var onSelect: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[TabOverrides[SharedProps]] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
}

