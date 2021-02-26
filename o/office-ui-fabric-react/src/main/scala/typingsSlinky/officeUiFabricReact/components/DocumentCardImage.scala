package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImage
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyleProps
import typingsSlinky.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyles
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardImage {
  
  @JSImport("office-ui-fabric-react", "DocumentCardImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardImage]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardImage | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardImage]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconProps(value: IIconProps): this.type = set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageFit(value: ImageFit): this.type = set("imageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageSrc(value: String): this.type = set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDocumentCardImageStyleProps => DeepPartial[IDocumentCardImageStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DocumentCardImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDocumentCardImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
