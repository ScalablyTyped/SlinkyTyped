package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivity
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivityPerson
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivityProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivityStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivityStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActivityBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotBaseMod.DocumentCardActivityBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.base", "DocumentCardActivityBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    activity: String,
    people: js.Array[IDocumentCardActivityPerson],
    componentRef: IRefObject[IDocumentCardActivity] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotBaseMod.DocumentCardActivityBase
  ] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardActivityProps
}

