package typingsSlinky.jupyterlabDocregistry.registryMod

import typingsSlinky.jupyterlabApputils.mod.Toolbar
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentWidget[T /* <: Widget */, U /* <: IModel */] extends Widget {
  
  /**
    * The content widget.
    */
  val content: T = js.native
  
  /**
    * The context associated with the document.
    */
  val context: IContext[U] = js.native
  
  /**
    * A promise resolving after the content widget is revealed.
    */
  val revealed: js.Promise[Unit] = js.native
  
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
  
  /**
    * The toolbar for the widget.
    */
  val toolbar: Toolbar[Widget] = js.native
}
