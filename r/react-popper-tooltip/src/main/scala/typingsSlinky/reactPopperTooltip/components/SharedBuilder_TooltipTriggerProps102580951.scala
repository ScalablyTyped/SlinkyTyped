package typingsSlinky.reactPopperTooltip.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TooltipTriggerProps102580951[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def getTooltipRef(value: Ref): this.type = set("getTooltipRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getTooltipRefFunction1(value: /* element */ HTMLElement | Null => Unit): this.type = set("getTooltipRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def getTooltipRefNull: this.type = set("getTooltipRef", null)
  
  @scala.inline
  def getTriggerRef(value: Ref): this.type = set("getTriggerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getTriggerRefFunction1(value: /* element */ HTMLElement | Null => Unit): this.type = set("getTriggerRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def getTriggerRefNull: this.type = set("getTriggerRef", null)
  
  @scala.inline
  def tooltipShown(value: Boolean): this.type = set("tooltipShown", value.asInstanceOf[js.Any])
}
