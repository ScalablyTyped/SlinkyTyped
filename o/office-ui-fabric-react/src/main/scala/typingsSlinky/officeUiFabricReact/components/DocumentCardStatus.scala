package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatus
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusProps
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyleProps
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardStatus {
  
  @JSImport("office-ui-fabric-react", "DocumentCardStatus")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
        ] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardStatus | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardStatus]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardStatus]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statusIcon(value: String): this.type = set("statusIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDocumentCardStatusStyleProps => DeepPartial[IDocumentCardStatusStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardStatusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(status: String): Builder = {
    val __props = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardStatusProps]))
  }
}
