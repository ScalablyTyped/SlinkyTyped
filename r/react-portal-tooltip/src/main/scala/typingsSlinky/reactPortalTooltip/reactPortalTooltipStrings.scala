package typingsSlinky.reactPortalTooltip

import typingsSlinky.reactPortalTooltip.cardMod.Card.Position
import typingsSlinky.reactPortalTooltip.cardMod.Card._Align
import typingsSlinky.reactPortalTooltip.cardMod.Card._Arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPortalTooltipStrings {
  
  @js.native
  sealed trait bottom
    extends Position
       with _Arrow
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends _Align
       with _Arrow
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends Position
       with _Align
       with _Arrow
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends Position
       with _Align
       with _Arrow
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top
    extends Position
       with _Arrow
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
