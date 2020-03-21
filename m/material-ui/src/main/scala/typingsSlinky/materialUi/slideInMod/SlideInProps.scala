package typingsSlinky.materialUi.slideInMod

import slinky.core.TagMod
import typingsSlinky.materialUi.MaterialUI.propTypes.direction
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var direction: js.UndefOr[typingsSlinky.materialUi.MaterialUI.propTypes.direction] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SlideInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: TagMod[Any] = null,
    direction: direction = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[SlideIn] = null,
    style: CSSProperties = null
  ): SlideInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
}

