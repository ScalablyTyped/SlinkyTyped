package typingsSlinky.materialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Card.CardTitleProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardTitle {
  
  @JSImport("material-ui", "CardTitle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.CardTitle] {
    
    @scala.inline
    def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitle(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleColor(value: String): this.type = set("subtitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleStyle(value: CSSProperties): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardTitle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
