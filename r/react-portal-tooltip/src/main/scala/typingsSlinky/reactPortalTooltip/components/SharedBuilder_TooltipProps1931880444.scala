package typingsSlinky.reactPortalTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPortalTooltip.anon.ArrowStyle
import typingsSlinky.reactPortalTooltip.cardMod.Card.Align
import typingsSlinky.reactPortalTooltip.cardMod.Card.Arrow
import typingsSlinky.reactPortalTooltip.cardMod.Card.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TooltipProps1931880444[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
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
