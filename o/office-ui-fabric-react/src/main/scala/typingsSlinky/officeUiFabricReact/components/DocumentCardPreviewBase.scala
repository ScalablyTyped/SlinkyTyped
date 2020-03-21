package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreview
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewImage
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyleProps
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardPreviewBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardPreviewBaseMod.DocumentCardPreviewBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.base", "DocumentCardPreviewBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    previewImages: js.Array[IDocumentCardPreviewImage],
    componentRef: IRefObject[IDocumentCardPreview] = null,
    getOverflowDocumentCountText: /* overflowCount */ Double => String = null,
    styles: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardPreviewBaseMod.DocumentCardPreviewBase
  ] = {
    val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getOverflowDocumentCountText != null) __obj.updateDynamic("getOverflowDocumentCountText")(js.Any.fromFunction1(getOverflowDocumentCountText))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardPreviewProps
}

