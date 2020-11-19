package typingsSlinky.reactOverlays

import typingsSlinky.reactOverlays.dropdownMod.Directions
import typingsSlinky.reactOverlays.overlayMod.Placements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactOverlaysStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait bottom extends Placements
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait down extends Directions
  
  @js.native
  sealed trait left
    extends Directions
       with Placements
  
  @js.native
  sealed trait mousedown extends js.Object
  
  @js.native
  sealed trait right
    extends Directions
       with Placements
  
  @js.native
  sealed trait static extends js.Object
  
  @js.native
  sealed trait top extends Placements
  
  @js.native
  sealed trait up extends Directions
}
