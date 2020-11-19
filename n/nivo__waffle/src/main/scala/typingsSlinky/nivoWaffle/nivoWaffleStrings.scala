package typingsSlinky.nivoWaffle

import typingsSlinky.nivoWaffle.mod.WaffleFillDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nivoWaffleStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait bottom extends WaffleFillDirection
  
  @js.native
  sealed trait left extends WaffleFillDirection
  
  @js.native
  sealed trait right extends WaffleFillDirection
  
  @js.native
  sealed trait top extends WaffleFillDirection
}
