package typingsSlinky.jupyterlabPropertyInspector.tokenMod

import slinky.core.facade.ReactElement
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyInspector extends IDisposable {
  
  def render(content: Widget): Unit = js.native
  def render(content: ReactElement): Unit = js.native
  
  /**
    * Show the property inspector panel.
    *
    * If the owner widget is not the most recently focused,
    * this is a no-op.  It should be triggered by a user
    * action.
    */
  def showPanel(): Unit = js.native
}
