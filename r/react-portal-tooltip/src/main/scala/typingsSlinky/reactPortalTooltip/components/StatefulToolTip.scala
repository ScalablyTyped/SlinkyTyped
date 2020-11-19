package typingsSlinky.reactPortalTooltip.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPortalTooltip.anon.ArrowStyle
import typingsSlinky.reactPortalTooltip.cardMod.Card.Align
import typingsSlinky.reactPortalTooltip.cardMod.Card.Arrow
import typingsSlinky.reactPortalTooltip.cardMod.Card.Position
import typingsSlinky.reactPortalTooltip.statefulToolTipMod.StatefulToolTipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulToolTip {
  
  @JSImport("react-portal-tooltip", "StatefulToolTip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPortalTooltip.mod.StatefulToolTip] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignNull: this.type = set("align", null)
    
    @scala.inline
    def arrow(value: Arrow): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowNull: this.type = set("arrow", null)
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ArrowStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipTimeout(value: Double): this.type = set("tooltipTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useHover(value: Boolean): this.type = set("useHover", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulToolTipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(parent: String | ReactElement | ReactRef[_]): Builder = {
    val __props = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulToolTipProps]))
  }
}
