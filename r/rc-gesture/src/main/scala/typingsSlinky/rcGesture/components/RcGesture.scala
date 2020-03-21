package typingsSlinky.rcGesture.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcGesture.mod.IGesture
import typingsSlinky.rcGesture.mod.IGestureStatus
import typingsSlinky.rcGesture.mod.default
import typingsSlinky.rcGesture.rcGestureStrings.all
import typingsSlinky.rcGesture.rcGestureStrings.horizontal
import typingsSlinky.rcGesture.rcGestureStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcGesture
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    direction: all | vertical | horizontal = null,
    enablePinch: js.UndefOr[Boolean] = js.undefined,
    enableRotate: js.UndefOr[Boolean] = js.undefined,
    onPan: /* s */ IGestureStatus => Unit = null,
    onPanCancel: /* s */ IGestureStatus => Unit = null,
    onPanDown: /* s */ IGestureStatus => Unit = null,
    onPanEnd: /* s */ IGestureStatus => Unit = null,
    onPanLeft: /* s */ IGestureStatus => Unit = null,
    onPanMove: /* s */ IGestureStatus => Unit = null,
    onPanRight: /* s */ IGestureStatus => Unit = null,
    onPanStart: /* s */ IGestureStatus => Unit = null,
    onPanUp: /* s */ IGestureStatus => Unit = null,
    onPinch: /* s */ IGestureStatus => Unit = null,
    onPinchCancel: /* s */ IGestureStatus => Unit = null,
    onPinchEnd: /* s */ IGestureStatus => Unit = null,
    onPinchIn: /* s */ IGestureStatus => Unit = null,
    onPinchMove: /* s */ IGestureStatus => Unit = null,
    onPinchOut: /* s */ IGestureStatus => Unit = null,
    onPinchStart: /* s */ IGestureStatus => Unit = null,
    onPress: /* s */ IGestureStatus => Unit = null,
    onPressUp: /* s */ IGestureStatus => Unit = null,
    onRotate: /* s */ IGestureStatus => Unit = null,
    onRotateCancel: /* s */ IGestureStatus => Unit = null,
    onRotateEnd: /* s */ IGestureStatus => Unit = null,
    onRotateMove: /* s */ IGestureStatus => Unit = null,
    onRotateStart: /* s */ IGestureStatus => Unit = null,
    onSwipe: /* s */ IGestureStatus => Unit = null,
    onSwipeDown: /* s */ IGestureStatus => Unit = null,
    onSwipeLeft: /* s */ IGestureStatus => Unit = null,
    onSwipeRight: /* s */ IGestureStatus => Unit = null,
    onSwipeUp: /* s */ IGestureStatus => Unit = null,
    onTap: /* s */ IGestureStatus => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLElement] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinch)) __obj.updateDynamic("enablePinch")(enablePinch.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotate)) __obj.updateDynamic("enableRotate")(enableRotate.asInstanceOf[js.Any])
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(js.Any.fromFunction1(onPanCancel))
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(js.Any.fromFunction1(onPanDown))
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(js.Any.fromFunction1(onPanEnd))
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(js.Any.fromFunction1(onPanLeft))
    if (onPanMove != null) __obj.updateDynamic("onPanMove")(js.Any.fromFunction1(onPanMove))
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(js.Any.fromFunction1(onPanRight))
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(js.Any.fromFunction1(onPanStart))
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(js.Any.fromFunction1(onPanUp))
    if (onPinch != null) __obj.updateDynamic("onPinch")(js.Any.fromFunction1(onPinch))
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(js.Any.fromFunction1(onPinchCancel))
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(js.Any.fromFunction1(onPinchEnd))
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(js.Any.fromFunction1(onPinchIn))
    if (onPinchMove != null) __obj.updateDynamic("onPinchMove")(js.Any.fromFunction1(onPinchMove))
    if (onPinchOut != null) __obj.updateDynamic("onPinchOut")(js.Any.fromFunction1(onPinchOut))
    if (onPinchStart != null) __obj.updateDynamic("onPinchStart")(js.Any.fromFunction1(onPinchStart))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressUp != null) __obj.updateDynamic("onPressUp")(js.Any.fromFunction1(onPressUp))
    if (onRotate != null) __obj.updateDynamic("onRotate")(js.Any.fromFunction1(onRotate))
    if (onRotateCancel != null) __obj.updateDynamic("onRotateCancel")(js.Any.fromFunction1(onRotateCancel))
    if (onRotateEnd != null) __obj.updateDynamic("onRotateEnd")(js.Any.fromFunction1(onRotateEnd))
    if (onRotateMove != null) __obj.updateDynamic("onRotateMove")(js.Any.fromFunction1(onRotateMove))
    if (onRotateStart != null) __obj.updateDynamic("onRotateStart")(js.Any.fromFunction1(onRotateStart))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1(onSwipeUp))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcGesture.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IGesture
}

