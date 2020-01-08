package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Table.TableHeaderProps
import typingsSlinky.materialDashUi.tableTableHeaderMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Table/TableHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
    displaySelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    onSelectAll: /* checked */ Boolean => Unit = null,
    selectAllSelected: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(displaySelectAll)) __obj.updateDynamic("displaySelectAll")(displaySelectAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction1(onSelectAll))
    if (!js.isUndefined(selectAllSelected)) __obj.updateDynamic("selectAllSelected")(selectAllSelected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.materialDashUi.tableTableHeaderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableHeaderProps
}

