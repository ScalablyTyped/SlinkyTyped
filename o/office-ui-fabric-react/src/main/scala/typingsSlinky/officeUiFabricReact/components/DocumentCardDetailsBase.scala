package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetails
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsProps
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyleProps
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardDetailsBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardDetails.base", "DocumentCardDetailsBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    componentRef: IRefObject[IDocumentCardDetails] = null,
    styles: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase
  ] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDocumentCardDetailsProps
}

