package typingsSlinky.reactDashBootstrapDashTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrapDashTable.Anon_Text
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DropDirection
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SizePerPageDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizePerPageDropDown
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SizePerPageDropDown
    ] {
  @JSImport("react-bootstrap-table", "SizePerPageDropDown")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden, onClick, open */
  def apply(
    btnContextual: String = null,
    currSizePerPage: String = null,
    options: js.Array[Anon_Text | Double] = null,
    variation: DropDirection = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SizePerPageDropDown
  ] = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (currSizePerPage != null) __obj.updateDynamic("currSizePerPage")(currSizePerPage.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SizePerPageDropDownProps
}

