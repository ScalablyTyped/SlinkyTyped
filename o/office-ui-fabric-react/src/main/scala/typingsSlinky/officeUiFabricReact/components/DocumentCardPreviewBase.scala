package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreview
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewImage
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyleProps
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardPreviewBase {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.base", "DocumentCardPreviewBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardPreviewBaseMod.DocumentCardPreviewBase
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardPreview | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardPreview]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardPreview]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def getOverflowDocumentCountText(value: /* overflowCount */ Double => String): this.type = set("getOverflowDocumentCountText", js.Any.fromFunction1(value))
    @scala.inline
    def stylesFunction1(value: IDocumentCardPreviewStyleProps => Partial[IDocumentCardPreviewStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(previewImages: js.Array[IDocumentCardPreviewImage]): Builder = {
    val __props = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardPreviewProps]))
  }
}

