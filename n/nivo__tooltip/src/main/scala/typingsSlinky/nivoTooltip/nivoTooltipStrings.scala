package typingsSlinky.nivoTooltip

import typingsSlinky.nivoTooltip.typesMod.CrosshairType
import typingsSlinky.nivoTooltip.typesMod.TooltipAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nivoTooltipStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @scala.inline
  def cross: cross = "cross".asInstanceOf[cross]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait bottom
    extends CrosshairType
       with TooltipAnchor
  
  @js.native
  sealed trait `bottom-left` extends CrosshairType
  
  @js.native
  sealed trait `bottom-right` extends CrosshairType
  
  @js.native
  sealed trait center extends TooltipAnchor
  
  @js.native
  sealed trait cross extends CrosshairType
  
  @js.native
  sealed trait left
    extends CrosshairType
       with TooltipAnchor
  
  @js.native
  sealed trait right
    extends CrosshairType
       with TooltipAnchor
  
  @js.native
  sealed trait top
    extends CrosshairType
       with TooltipAnchor
  
  @js.native
  sealed trait `top-left` extends CrosshairType
  
  @js.native
  sealed trait `top-right` extends CrosshairType
  
  @js.native
  sealed trait x extends CrosshairType
  
  @js.native
  sealed trait y extends CrosshairType
}
