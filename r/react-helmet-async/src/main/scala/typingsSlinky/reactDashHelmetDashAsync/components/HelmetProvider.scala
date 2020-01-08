package typingsSlinky.reactDashHelmetDashAsync.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HelmetProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod.HelmetProvider
    ] {
  @JSImport("react-helmet-async", "HelmetProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(context: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod.HelmetProvider
  ] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod.HelmetProvider
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod.HelmetProvider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ProviderProps
}

