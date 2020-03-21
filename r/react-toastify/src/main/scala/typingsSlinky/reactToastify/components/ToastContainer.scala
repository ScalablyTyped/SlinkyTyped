package typingsSlinky.reactToastify.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactToastify.mod.PositionOptions
import typingsSlinky.reactToastify.mod.ToastContainerProps
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactToastify.mod.ToastContainer] {
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: draggable */
  def apply(
    autoClose: Double | `false` = null,
    bodyClassName: String | js.Object = null,
    className: String | js.Object = null,
    closeButton: TagMod[Any] | Boolean = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    containerId: String | Double = null,
    draggablePercent: Int | Double = null,
    enableMultiContainer: js.UndefOr[Boolean] = js.undefined,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: PositionOptions = null,
    progressClassName: String | js.Object = null,
    progressStyle: js.Object = null,
    role: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    toastClassName: String | js.Object = null,
    transition: ReactComponentClass[js.Object] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactToastify.mod.ToastContainer] = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiContainer)) __obj.updateDynamic("enableMultiContainer")(enableMultiContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocusLoss)) __obj.updateDynamic("pauseOnFocusLoss")(pauseOnFocusLoss.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName.asInstanceOf[js.Any])
    if (progressStyle != null) __obj.updateDynamic("progressStyle")(progressStyle.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toastClassName != null) __obj.updateDynamic("toastClassName")(toastClassName.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactToastify.mod.ToastContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactToastify.mod.ToastContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ToastContainerProps
}

