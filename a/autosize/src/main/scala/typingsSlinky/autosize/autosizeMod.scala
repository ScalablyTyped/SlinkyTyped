package typingsSlinky.autosize

import typingsSlinky.jquery.JQuery
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autosize", JSImport.Namespace)
@js.native
object autosizeMod extends js.Object {
  /**
    * Attach autosize to JQuery collection
    */
  def apply(collection: JQuery[HTMLElement]): JQuery[org.scalajs.dom.raw.HTMLElement] = js.native
  /**
    * Attach autosize to NodeList
    */
  def apply(elements: NodeList): org.scalajs.dom.raw.NodeList = js.native
  /**
    * Attach autosize to Element
    */
  def apply(element: Element): org.scalajs.dom.raw.Element = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(collection: JQuery[HTMLElement]): JQuery[org.scalajs.dom.raw.HTMLElement] = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(elements: NodeList): org.scalajs.dom.raw.NodeList = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(element: Element): org.scalajs.dom.raw.Element = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(collection: JQuery[HTMLElement]): JQuery[org.scalajs.dom.raw.HTMLElement] = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(elements: NodeList): org.scalajs.dom.raw.NodeList = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(element: Element): org.scalajs.dom.raw.Element = js.native
}

