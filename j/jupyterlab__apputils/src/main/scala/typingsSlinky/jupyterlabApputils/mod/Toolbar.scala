package typingsSlinky.jupyterlabApputils.mod

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "Toolbar")
@js.native
/**
  * Construct a new toolbar widget.
  */
class Toolbar[T /* <: Widget */] ()
  extends typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar[T]
@JSImport("@jupyterlab/apputils", "Toolbar")
@js.native
object Toolbar extends js.Object {
  
  /**
    * Create an interrupt toolbar item.
    */
  def createInterruptButton(sessionContext: ISessionContext): Widget = js.native
  
  /**
    * Create a kernel name indicator item.
    *
    * #### Notes
    * It will display the `'display_name`' of the session context. It can
    * handle a change in context or kernel.
    */
  def createKernelNameItem(sessionContext: ISessionContext): Widget = js.native
  def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
  
  /**
    * Create a kernel status indicator item.
    *
    * #### Notes
    * It will show a busy status if the kernel status is busy.
    * It will show the current status in the node title.
    * It can handle a change to the context or the kernel.
    */
  def createKernelStatusItem(sessionContext: ISessionContext): Widget = js.native
  
  /**
    * Create a restart toolbar item.
    */
  def createRestartButton(sessionContext: ISessionContext): Widget = js.native
  def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
  
  /**
    * Create a toolbar spacer item.
    *
    * #### Notes
    * It is a flex spacer that separates the left toolbar items
    * from the right toolbar items.
    */
  def createSpacerItem(): Widget = js.native
}
