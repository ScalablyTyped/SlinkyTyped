package typingsSlinky.autosize

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autosize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Attach autosize to JQuery collection
    */
  def apply(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Attach autosize to NodeList
    */
  def apply(elements: NodeList): NodeList = js.native
  /**
    * Attach autosize to Element
    */
  def apply(element: Element): Element = js.native
  
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(elements: NodeList): NodeList = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(element: Element): Element = js.native
  
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(elements: NodeList): NodeList = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(element: Element): Element = js.native
}
