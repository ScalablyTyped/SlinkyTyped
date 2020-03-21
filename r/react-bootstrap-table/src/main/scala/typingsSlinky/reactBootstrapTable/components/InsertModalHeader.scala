package typingsSlinky.reactBootstrapTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapTable.mod.BootstrapVersion
import typingsSlinky.reactBootstrapTable.mod.InsertModalHeaderProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InsertModalHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTable.mod.InsertModalHeader] {
  @JSImport("react-bootstrap-table", "InsertModalHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, title */
  def apply(
    beforeClose: /* e */ SyntheticEvent[Event_, _] => Unit = null,
    hideClose: js.UndefOr[Boolean] = js.undefined,
    onModalClose: /* closeModal */ js.Function0[Unit] => Unit = null,
    version: BootstrapVersion = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.InsertModalHeader] = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (!js.isUndefined(hideClose)) __obj.updateDynamic("hideClose")(hideClose.asInstanceOf[js.Any])
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1(onModalClose))
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.InsertModalHeader] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactBootstrapTable.mod.InsertModalHeader](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InsertModalHeaderProps
}

