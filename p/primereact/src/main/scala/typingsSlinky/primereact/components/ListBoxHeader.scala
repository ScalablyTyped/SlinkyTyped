package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_OriginalEventValue
import typingsSlinky.primereact.componentsListboxListBoxHeaderMod.ListBoxHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBoxHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsListboxListBoxHeaderMod.ListBoxHeader] {
  @JSImport("primereact/components/listbox/ListBoxHeader", "ListBoxHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    filter: String = null,
    onFilter: /* e */ Anon_OriginalEventValue => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.componentsListboxListBoxHeaderMod.ListBoxHeader] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.componentsListboxListBoxHeaderMod.ListBoxHeader] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.componentsListboxListBoxHeaderMod.ListBoxHeader](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListBoxHeaderProps
}

