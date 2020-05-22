package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetails
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsProps
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyleProps
import typingsSlinky.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardDetailsBase {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardDetails.base", "DocumentCardDetailsBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardDetails | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardDetails]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardDetails]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDocumentCardDetailsStyleProps => DeepPartial[IDocumentCardDetailsStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardDetailsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DocumentCardDetailsBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

