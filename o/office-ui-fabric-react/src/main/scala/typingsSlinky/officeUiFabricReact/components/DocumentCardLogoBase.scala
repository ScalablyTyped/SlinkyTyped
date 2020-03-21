package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogo
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoProps
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyleProps
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardLogoBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardLogoBaseMod.DocumentCardLogoBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLogo.base", "DocumentCardLogoBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    logoIcon: String,
    componentRef: IRefObject[IDocumentCardLogo] = null,
    logoName: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardLogoBaseMod.DocumentCardLogoBase
  ] = {
    val __obj = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (logoName != null) __obj.updateDynamic("logoName")(logoName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardLogoProps
}

