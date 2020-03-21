package typingsSlinky.reactBootstrapTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTable.AnonText
import typingsSlinky.reactBootstrapTable.mod.DropDirection
import typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizePerPageDropDown
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown] {
  @JSImport("react-bootstrap-table", "SizePerPageDropDown")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden, open */
  def apply(
    btnContextual: String = null,
    currSizePerPage: String = null,
    onClick: /* toggleDropDown */ js.Function0[Unit] => Unit = null,
    options: js.Array[AnonText | Double] = null,
    variation: DropDirection = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown] = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (currSizePerPage != null) __obj.updateDynamic("currSizePerPage")(currSizePerPage.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SizePerPageDropDownProps
}

