package typingsSlinky.materialUi.appCanvasMod

import slinky.core.TagMod
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCanvasProps extends Props[AppCanvas]

object AppCanvasProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[AppCanvas]] = js.undefined
  ): AppCanvasProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCanvasProps]
  }
}

