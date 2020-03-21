package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.fundamentalReact.AnonCallback
import typingsSlinky.fundamentalReact.searchInputMod.SearchInputProps
import typingsSlinky.fundamentalReact.searchInputMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/SearchInput/SearchInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, placeholder */
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inShellbar: js.UndefOr[Boolean] = js.undefined,
    noSearchBtn: js.UndefOr[Boolean] = js.undefined,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    onEnter: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit = null,
    searchList: js.Array[AnonCallback] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(inShellbar)) __obj.updateDynamic("inShellbar")(inShellbar.asInstanceOf[js.Any])
    if (!js.isUndefined(noSearchBtn)) __obj.updateDynamic("noSearchBtn")(noSearchBtn.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (searchList != null) __obj.updateDynamic("searchList")(searchList.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.input.tag.type, 
  typingsSlinky.fundamentalReact.searchInputMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SearchInputProps
}

