package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExplorer_ extends Widget_ {
  
  /** Refresh the size of FileExplorer control.
    * @returns {void}
    */
  def adjustSize(): Unit = js.native
  
  var defaults: typingsSlinky.ejWebAll.ej.FileExplorer.Model = js.native
  
  /** Disable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be disabled
    * @returns {void}
    */
  def disableMenuItem(item: String): Unit = js.native
  def disableMenuItem(item: HTMLElement): Unit = js.native
  
  /** Disable the particular toolbar item.
    * @param {string|HTMLElement} Id of the toolbar item/ Tool item element to be disabled
    * @returns {void}
    */
  def disableToolbarItem(item: String): Unit = js.native
  def disableToolbarItem(item: HTMLElement): Unit = js.native
  
  /** Enable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be Enabled
    * @returns {void}
    */
  def enableMenuItem(item: String): Unit = js.native
  def enableMenuItem(item: HTMLElement): Unit = js.native
  
  /** Enable the particular toolbar item
    * @param {string|HTMLElement} Id of the tool item/ Tool item element to be Enabled
    * @returns {void}
    */
  def enableToolbarItem(item: String): Unit = js.native
  def enableToolbarItem(item: HTMLElement): Unit = js.native
  
  @JSName("model")
  var model_FileExplorer_ : typingsSlinky.ejWebAll.ej.FileExplorer.Model = js.native
  
  /** Refresh the content of the selected folder in FileExplorer control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Remove the particular toolbar item.
    * @param {string|HTMLElement} Id of the tool item/ tool item element to be removed
    * @returns {void}
    */
  def removeToolbarItem(item: String): Unit = js.native
  def removeToolbarItem(item: HTMLElement): Unit = js.native
}
