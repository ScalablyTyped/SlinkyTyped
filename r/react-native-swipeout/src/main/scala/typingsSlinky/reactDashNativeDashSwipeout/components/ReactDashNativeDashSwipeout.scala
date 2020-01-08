package typingsSlinky.reactDashNativeDashSwipeout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutMod.SwipeoutButtonProperties
import typingsSlinky.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutMod.SwipeoutProperties
import typingsSlinky.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashSwipeout
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    buttonWidth: Int | Double = null,
    close: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProperties] = null,
    onClose: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit = null,
    onOpen: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit = null,
    openLeft: js.UndefOr[Boolean] = js.undefined,
    openRight: js.UndefOr[Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProperties] = null,
    rowId: Int | Double = null,
    scroll: /* scrollEnabled */ Boolean => Unit = null,
    sectionId: Int | Double = null,
    sensitivity: Int | Double = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction3(onOpen))
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (sectionId != null) __obj.updateDynamic("sectionId")(sectionId.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwipeoutProperties
}

