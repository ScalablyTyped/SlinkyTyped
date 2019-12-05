package typingsSlinky.reactDashWidgets.libCommonPropsMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWidgetsCommonProps[C] extends Props[C] {
  /**
    * Disable the widget, if an Array of values is passed in only those values will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  /**
    * Used to label and annotate aria- attributes
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Mark whether the SelectList should render right-to-left. This property can also be
    * implicitly passed to the widget through a childContext prop (isRtl) this allows higher
    * level application components to specify the direction.
    * @default false
    */
  var isRtl: js.UndefOr[Boolean] = js.undefined
  /**
    * Place the widget in a read-only mode, If an Array of values is passed in only those
    * values will be read-only.
    * @default false
    */
  var readOnly: js.UndefOr[Boolean | js.Array[_]] = js.undefined
}

object ReactWidgetsCommonProps {
  @scala.inline
  def apply[C](
    children: TagMod[Any] = null,
    disabled: Boolean | js.Array[_] = null,
    id: String = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    readOnly: Boolean | js.Array[_] = null,
    ref: LegacyRef[C] = null
  ): ReactWidgetsCommonProps[C] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWidgetsCommonProps[C]]
  }
}

