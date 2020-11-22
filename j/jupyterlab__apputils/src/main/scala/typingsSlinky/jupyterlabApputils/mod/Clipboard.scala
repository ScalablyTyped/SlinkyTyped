package typingsSlinky.jupyterlabApputils.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.clipboardMod.ClipboardData
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.copy
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.cut
import typingsSlinky.luminoCoreutils.mod.MimeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "Clipboard")
@js.native
object Clipboard extends js.Object {
  
  /**
    * Copy text to the system clipboard.
    *
    * #### Notes
    * This can only be called in response to a user input event.
    */
  def copyToSystem(clipboardData: ClipboardData): Unit = js.native
  
  /**
    * Generate a clipboard event on a node.
    *
    * @param node - The element on which to generate the event.
    *
    * @param type - The type of event to generate.
    *   `'paste'` events cannot be programmatically generated.
    *
    * #### Notes
    * This can only be called in response to a user input event.
    */
  def generateEvent(node: HTMLElement): Unit = js.native
  @JSName("generateEvent")
  def generateEvent_copy(node: HTMLElement, `type`: copy): Unit = js.native
  @JSName("generateEvent")
  def generateEvent_cut(node: HTMLElement, `type`: cut): Unit = js.native
  
  /**
    * Get the application clipboard instance.
    */
  def getInstance(): MimeData = js.native
  
  /**
    * Set the application clipboard instance.
    */
  def setInstance(value: MimeData): Unit = js.native
}
