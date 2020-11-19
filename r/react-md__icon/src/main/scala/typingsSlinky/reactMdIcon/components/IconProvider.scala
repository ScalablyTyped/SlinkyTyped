package typingsSlinky.reactMdIcon.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdIcon.iconProviderMod.IconProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconProvider {
  
  @JSImport("@react-md/icon", "IconProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def backReactElement(value: ReactElement): this.type = set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def back(value: ReactElement): this.type = set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkboxReactElement(value: ReactElement): this.type = set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkbox(value: ReactElement): this.type = set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downloadReactElement(value: ReactElement): this.type = set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def download(value: ReactElement): this.type = set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownReactElement(value: ReactElement): this.type = set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdown(value: ReactElement): this.type = set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expanderReactElement(value: ReactElement): this.type = set("expander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expander(value: ReactElement): this.type = set("expander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forwardReactElement(value: ReactElement): this.type = set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forward(value: ReactElement): this.type = set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuReactElement(value: ReactElement): this.type = set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menu(value: ReactElement): this.type = set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notificationReactElement(value: ReactElement): this.type = set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notification(value: ReactElement): this.type = set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def passwordReactElement(value: ReactElement): this.type = set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def password(value: ReactElement): this.type = set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioReactElement(value: ReactElement): this.type = set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radio(value: ReactElement): this.type = set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedReactElement(value: ReactElement): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: ReactElement): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortReactElement(value: ReactElement): this.type = set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sort(value: ReactElement): this.type = set("sort", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IconProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
