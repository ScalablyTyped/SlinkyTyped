package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyleProps
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressIndicatorBase {
  
  @JSImport("office-ui-fabric-react", "ProgressIndicatorBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.ProgressIndicatorBase] {
    
    @scala.inline
    def ariaValueText(value: String): this.type = set("ariaValueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barHeight(value: Double): this.type = set("barHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRenderProgress(
      value: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def percentComplete(value: Double): this.type = set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressHidden(value: Boolean): this.type = set("progressHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IProgressIndicatorStyleProps => DeepPartial[IProgressIndicatorStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IProgressIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ProgressIndicatorBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
