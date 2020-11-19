package typingsSlinky.carlo

import typingsSlinky.carlo.mod.AppEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carloStrings {
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  
  @scala.inline
  def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait exit extends AppEvent
  
  @js.native
  sealed trait window extends AppEvent
}
