package typingsSlinky.materialDashUi.internalRenderToLayerMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderToLayerProps extends Props[RenderToLayer] {
  var componentClickAway: js.UndefOr[js.Function] = js.undefined
  var open: Boolean
  var render: js.Function
  var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
}

object RenderToLayerProps {
  @scala.inline
  def apply(
    open: Boolean,
    render: js.Function,
    children: TagMod[Any] = null,
    componentClickAway: js.Function = null,
    key: Key = null,
    ref: LegacyRef[RenderToLayer] = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  ): RenderToLayerProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (componentClickAway != null) __obj.updateDynamic("componentClickAway")(componentClickAway.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderToLayerProps]
  }
}

