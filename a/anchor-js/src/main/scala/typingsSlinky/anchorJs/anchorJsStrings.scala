package typingsSlinky.anchorJs

import typingsSlinky.anchorJs.mod.anchorjs.AnchorPlacement
import typingsSlinky.anchorJs.mod.anchorjs.AnchorVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorJsStrings {
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait always extends AnchorVisibility
  
  @js.native
  sealed trait hover extends AnchorVisibility
  
  @js.native
  sealed trait left extends AnchorPlacement
  
  @js.native
  sealed trait right extends AnchorPlacement
  
  @js.native
  sealed trait touch extends AnchorVisibility
}
