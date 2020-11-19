package typingsSlinky.reactMdUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppSizeListener {
  
  @JSImport("@react-md/utils", "AppSizeListener")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def defaultSize(value: AppSize): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desktopLargeMinWidth(value: QuerySize): this.type = set("desktopLargeMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desktopMinWidth(value: QuerySize): this.type = set("desktopMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def phoneMaxWidth(value: QuerySize): this.type = set("phoneMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabletMaxWidth(value: QuerySize): this.type = set("tabletMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabletMinWidth(value: QuerySize): this.type = set("tabletMinWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppSizeListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AppSizeListener.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
