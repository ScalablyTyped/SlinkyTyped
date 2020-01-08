package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.Anon_ImageLabel
import typingsSlinky.fundamentalDashReact.libMultiInputMultiInputMod.MultiInputProps
import typingsSlinky.fundamentalDashReact.libMultiInputMultiInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/MultiInput/MultiInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    data: js.Array[String | Double | js.Array[String]],
    onTagsUpdate: js.Array[String] => Unit,
    buttonProps: StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    localizedText: Anon_ImageLabel = null,
    placeHolder: String = null,
    popoverProps: StringDictionary[js.Any] = null,
    tagProps: StringDictionary[js.Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onTagsUpdate = js.Any.fromFunction1(onTagsUpdate))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MultiInputProps
}

