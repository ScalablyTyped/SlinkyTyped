package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImage
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyleProps
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyles
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardImageBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardImage.base", "DocumentCardImageBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    componentRef: IRefObject[IDocumentCardImage] = null,
    height: Int | Double = null,
    iconProps: IIconProps = null,
    imageFit: ImageFit = null,
    imageSrc: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles] = null,
    theme: ITheme = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase
  ] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (imageFit != null) __obj.updateDynamic("imageFit")(imageFit.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDocumentCardImageProps
}

