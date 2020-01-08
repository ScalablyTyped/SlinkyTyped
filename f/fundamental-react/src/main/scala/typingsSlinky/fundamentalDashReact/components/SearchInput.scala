package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.fundamentalDashReact.Anon_Callback
import typingsSlinky.fundamentalDashReact.libSearchInputSearchInputMod.SearchInputProps
import typingsSlinky.fundamentalDashReact.libSearchInputSearchInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onChange, placeholder */
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inShellbar: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    noSearchBtn: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit = null,
    searchBtnProps: StringDictionary[js.Any] = null,
    searchList: js.Array[Anon_Callback] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(inShellbar)) __obj.updateDynamic("inShellbar")(inShellbar.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (!js.isUndefined(noSearchBtn)) __obj.updateDynamic("noSearchBtn")(noSearchBtn.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (searchBtnProps != null) __obj.updateDynamic("searchBtnProps")(searchBtnProps.asInstanceOf[js.Any])
    if (searchList != null) __obj.updateDynamic("searchList")(searchList.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.input.tag.type, 
  typingsSlinky.fundamentalDashReact.libSearchInputSearchInputMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SearchInputProps
}

