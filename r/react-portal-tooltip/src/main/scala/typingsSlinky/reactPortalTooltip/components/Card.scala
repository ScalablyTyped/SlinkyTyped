package typingsSlinky.reactPortalTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPortalTooltip.anon.ArrowStyle
import typingsSlinky.reactPortalTooltip.cardMod.Card.Align
import typingsSlinky.reactPortalTooltip.cardMod.Card.Arrow
import typingsSlinky.reactPortalTooltip.cardMod.Card.CardProps
import typingsSlinky.reactPortalTooltip.cardMod.Card.Position
import typingsSlinky.reactPortalTooltip.cardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignNull: this.type = set("align", null)
    
    @scala.inline
    def arrow(value: Arrow): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowNull: this.type = set("arrow", null)
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ArrowStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useHover(value: Boolean): this.type = set("useHover", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
