package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameOnDeviceBackButton
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.ascend
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fade
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fall
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.lift
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toast
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.Toast] {
  @JSImport("react-onsenui", "Toast")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    isOpen: Boolean,
    animation: default | ascend | lift | fall | fade | none = null,
    animationOptions: AnimationOptions = null,
    modifier: String = null,
    onDeviceBackButton: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Toast] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onDeviceBackButton != null) __obj.updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(onDeviceBackButton))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HTMLAttributesidclassNameOnDeviceBackButton
}

