package typingsSlinky.reactReduxToastr.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactReduxToastr.AnonCancelText
import typingsSlinky.reactReduxToastr.mod.ReduxToastrProps
import typingsSlinky.reactReduxToastr.mod.ToastrState
import typingsSlinky.reactReduxToastr.mod.default
import typingsSlinky.reactReduxToastr.mod.positionType
import typingsSlinky.reactReduxToastr.mod.transitionInType
import typingsSlinky.reactReduxToastr.mod.transitionOutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactReduxToastr
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    closeOnToastrClick: js.UndefOr[Boolean] = js.undefined,
    confirmOptions: AnonCancelText = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    position: positionType = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    timeOut: Int | Double = null,
    toastr: ToastrState = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnToastrClick)) __obj.updateDynamic("closeOnToastrClick")(closeOnToastrClick.asInstanceOf[js.Any])
    if (confirmOptions != null) __obj.updateDynamic("confirmOptions")(confirmOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (toastr != null) __obj.updateDynamic("toastr")(toastr.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactReduxToastr.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReduxToastrProps
}

