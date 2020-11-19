package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Card.CardActionsProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardActions {
  
  @JSImport("material-ui", "CardActions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.CardActions] {
    
    @scala.inline
    def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CardActions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
