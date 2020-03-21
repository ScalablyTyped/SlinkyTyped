package typingsSlinky.reactTypingAnimation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactTypingAnimation.mod.TypingProps
import typingsSlinky.reactTypingAnimation.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTypingAnimation
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, loop */
  def apply(
    cursor: TagMod[Any] = null,
    cursorClassName: String = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    onAfterType: () => Unit = null,
    onBeforeType: () => Unit = null,
    onFinishedTyping: () => Unit = null,
    onStartedTyping: () => Unit = null,
    speed: Int | Double = null,
    startDelay: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.asInstanceOf[js.Any])
    if (onAfterType != null) __obj.updateDynamic("onAfterType")(js.Any.fromFunction0(onAfterType))
    if (onBeforeType != null) __obj.updateDynamic("onBeforeType")(js.Any.fromFunction0(onBeforeType))
    if (onFinishedTyping != null) __obj.updateDynamic("onFinishedTyping")(js.Any.fromFunction0(onFinishedTyping))
    if (onStartedTyping != null) __obj.updateDynamic("onStartedTyping")(js.Any.fromFunction0(onStartedTyping))
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactTypingAnimation.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TypingProps
}

