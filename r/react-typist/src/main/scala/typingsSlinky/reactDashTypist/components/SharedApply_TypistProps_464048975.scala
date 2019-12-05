package typingsSlinky.reactDashTypist.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTypist.reactDashTypistMod.Typist.CurrentTextProps
import typingsSlinky.reactDashTypist.reactDashTypistMod.Typist.CursorProps
import typingsSlinky.reactDashTypist.reactDashTypistMod.TypistProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TypistProps_464048975[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    avgTypingDelay: Int | Double = null,
    cursor: CursorProps = null,
    delayGenerator: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double = null,
    onCharacterTyped: (/* char */ String, /* charIndex */ Double) => Unit = null,
    onLineTyped: (/* line */ String, /* lineIndex */ Double) => Unit = null,
    onTypingDone: () => Unit = null,
    startDelay: Int | Double = null,
    stdTypingDelay: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (avgTypingDelay != null) __obj.updateDynamic("avgTypingDelay")(avgTypingDelay.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (delayGenerator != null) __obj.updateDynamic("delayGenerator")(js.Any.fromFunction3(delayGenerator))
    if (onCharacterTyped != null) __obj.updateDynamic("onCharacterTyped")(js.Any.fromFunction2(onCharacterTyped))
    if (onLineTyped != null) __obj.updateDynamic("onLineTyped")(js.Any.fromFunction2(onLineTyped))
    if (onTypingDone != null) __obj.updateDynamic("onTypingDone")(js.Any.fromFunction0(onTypingDone))
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (stdTypingDelay != null) __obj.updateDynamic("stdTypingDelay")(stdTypingDelay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TypistProps
}

