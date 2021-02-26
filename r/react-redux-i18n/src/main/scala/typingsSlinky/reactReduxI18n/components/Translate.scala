package typingsSlinky.reactReduxI18n.components

import slinky.core.ReactComponentClass
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactReduxI18n.mod.TranslateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Translate {
  
  @scala.inline
  def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TranslateProps]))
  }
  
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactReduxI18n.mod.Translate] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerousHTML(value: Boolean): this.type = set("dangerousHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: ReactType[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagComponentClass(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagFunctionComponent(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TranslateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
