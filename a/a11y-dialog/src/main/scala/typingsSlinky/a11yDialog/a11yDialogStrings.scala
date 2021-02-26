package typingsSlinky.a11yDialog

import typingsSlinky.a11yDialog.mod.A11yDialog.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yDialogStrings {
  
  @js.native
  sealed trait create extends EventType
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait destroy extends EventType
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait hide extends EventType
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait show extends EventType
  @scala.inline
  def show: show = "show".asInstanceOf[show]
}
