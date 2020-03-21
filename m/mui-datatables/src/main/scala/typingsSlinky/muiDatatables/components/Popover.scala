package typingsSlinky.muiDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.muiDatatables.mod.MUIDataTablePopover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Any with js.Object] {
  @JSImport("mui-datatables", "Popover")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    action: /* args */ js.Any => _ = null,
    anchorEl: TagMod[Any] = null,
    anchorOrigin: js.Any = null,
    elevation: Int | Double = null,
    onClose: /* args */ js.Any => _ = null,
    onExited: /* args */ js.Any => _ = null,
    option: js.UndefOr[Boolean] = js.undefined,
    transformOrigin: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Any with js.Object] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (!js.isUndefined(option)) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Any with js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Any with js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MUIDataTablePopover
}

