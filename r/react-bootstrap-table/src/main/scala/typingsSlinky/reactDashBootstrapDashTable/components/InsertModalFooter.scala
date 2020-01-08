package typingsSlinky.reactDashBootstrapDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InsertModalFooter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalFooter
    ] {
  @JSImport("react-bootstrap-table", "InsertModalFooter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    beforeClose: /* e */ SyntheticEvent[Event, _] => Unit = null,
    beforeSave: /* e */ SyntheticEvent[Event, _] => Unit = null,
    closeBtnClass: String = null,
    closeBtnContextual: String = null,
    closeBtnText: String = null,
    onModalClose: /* closeModal */ js.Function0[Unit] => Unit = null,
    onSave: /* save */ js.Function0[Unit] => Unit = null,
    saveBtnClass: String = null,
    saveBtnContextual: String = null,
    saveBtnText: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalFooter
  ] = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction1(beforeSave))
    if (closeBtnClass != null) __obj.updateDynamic("closeBtnClass")(closeBtnClass.asInstanceOf[js.Any])
    if (closeBtnContextual != null) __obj.updateDynamic("closeBtnContextual")(closeBtnContextual.asInstanceOf[js.Any])
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText.asInstanceOf[js.Any])
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1(onModalClose))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction1(onSave))
    if (saveBtnClass != null) __obj.updateDynamic("saveBtnClass")(saveBtnClass.asInstanceOf[js.Any])
    if (saveBtnContextual != null) __obj.updateDynamic("saveBtnContextual")(saveBtnContextual.asInstanceOf[js.Any])
    if (saveBtnText != null) __obj.updateDynamic("saveBtnText")(saveBtnText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalFooter
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.InsertModalFooter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InsertModalFooterProps
}

