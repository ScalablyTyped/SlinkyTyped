package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocation
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationProps
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyleProps
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardLocation {
  
  @scala.inline
  def apply(location: String): Builder = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardLocationProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DocumentCardLocation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
        ] {
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardLocation]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardLocation | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardLocation]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locationHref(value: String): this.type = set("locationHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDocumentCardLocationStyleProps => DeepPartial[IDocumentCardLocationStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardLocationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
