package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitle
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyleProps
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardTitleBase {
  
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardTitleProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.base", "DocumentCardTitleBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardTitleBaseMod.DocumentCardTitleBase
        ] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardTitle]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardTitle | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardTitle]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldTruncate(value: Boolean): this.type = set("shouldTruncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showAsSecondaryTitle(value: Boolean): this.type = set("showAsSecondaryTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDocumentCardTitleStyleProps => DeepPartial[IDocumentCardTitleStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
