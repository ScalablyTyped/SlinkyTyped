package typingsSlinky.reactDashBootstrapDashTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ShowSelectedButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShowSelectedOnlyButton
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ShowSelectedOnlyButton
    ] {
  @JSImport("react-bootstrap-table", "ShowSelectedOnlyButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick */
  def apply(
    btnContextual: String = null,
    btnGlyphicon: String = null,
    showAllText: String = null,
    showOnlySelectText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ShowSelectedOnlyButton
  ] = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (btnGlyphicon != null) __obj.updateDynamic("btnGlyphicon")(btnGlyphicon.asInstanceOf[js.Any])
    if (showAllText != null) __obj.updateDynamic("showAllText")(showAllText.asInstanceOf[js.Any])
    if (showOnlySelectText != null) __obj.updateDynamic("showOnlySelectText")(showOnlySelectText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ShowSelectedOnlyButton
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ShowSelectedOnlyButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ShowSelectedButtonProps
}

