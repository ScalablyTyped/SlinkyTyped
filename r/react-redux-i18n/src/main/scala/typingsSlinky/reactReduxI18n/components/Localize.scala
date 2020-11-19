package typingsSlinky.reactReduxI18n.components

import slinky.core.ReactComponentClass
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactReduxI18n.mod.LocalizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localize {
  
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactReduxI18n.mod.Localize] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerousHTML(value: Boolean): this.type = set("dangerousHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagFunctionComponent(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagComponentClass(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: ReactType[_]): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalizeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: String | Double | js.Object): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizeProps]))
  }
}
