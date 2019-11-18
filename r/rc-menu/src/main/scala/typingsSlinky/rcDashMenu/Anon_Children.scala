package typingsSlinky.rcDashMenu

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    eventKey: Key = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

