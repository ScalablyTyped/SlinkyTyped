package typingsSlinky.reactDashInstantsearchDashDom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInstantsearchDashDom.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stats
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod.Stats
    ] {
  @JSImport("react-instantsearch-dom", "Stats")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    translations: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod.Stats
  ] = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod.Stats
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod.Stats](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = Anon_Key
}

