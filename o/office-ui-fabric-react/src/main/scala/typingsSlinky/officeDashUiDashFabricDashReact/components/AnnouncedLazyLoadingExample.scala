package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsAnnouncedExamplesAnnouncedDotLazyLoadingDotExampleMod.IAnnouncedLazyLoadingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AnnouncedLazyLoadingExample
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsAnnouncedExamplesAnnouncedDotLazyLoadingDotExampleMod.AnnouncedLazyLoadingExample
    ] {
  @JSImport("office-ui-fabric-react/lib/components/Announced/examples/Announced.LazyLoading.Example", "AnnouncedLazyLoadingExample")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsAnnouncedExamplesAnnouncedDotLazyLoadingDotExampleMod.AnnouncedLazyLoadingExample
  ] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAnnouncedLazyLoadingExampleProps
}

