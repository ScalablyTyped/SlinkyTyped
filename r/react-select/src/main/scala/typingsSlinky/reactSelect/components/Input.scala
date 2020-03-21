package typingsSlinky.reactSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.componentsInputMod.InputProps
import typingsSlinky.reactSelect.componentsInputMod.default
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-select/src/components/Input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    cx: (Null | String, ClassNamesState, String) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    innerRef: Ref[_] => Unit,
    isHidden: Boolean,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), innerRef = js.Any.fromFunction1(innerRef), isHidden = isHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InputProps
}

