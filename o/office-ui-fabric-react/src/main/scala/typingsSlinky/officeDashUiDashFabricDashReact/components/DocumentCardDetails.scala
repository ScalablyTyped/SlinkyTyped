package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDetailsDotTypesMod.IDocumentCardDetails
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDetailsDotTypesMod.IDocumentCardDetailsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDetailsDotTypesMod.IDocumentCardDetailsStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDetailsDotTypesMod.IDocumentCardDetailsStyles
import typingsSlinky.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardDetails
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react/lib/DocumentCard", "DocumentCardDetails")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    componentRef: IRefObject[IDocumentCardDetails] = null,
    styles: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.react.reactMod.LegacyRef[js.Any] with js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDocumentCardDetailsProps
}

