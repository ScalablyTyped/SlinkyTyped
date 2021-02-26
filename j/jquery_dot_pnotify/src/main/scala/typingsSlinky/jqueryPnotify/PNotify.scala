package typingsSlinky.jqueryPnotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotify extends StObject {
  
  /**
    *  Get the DOM element.
    */
  def get(): JQuery[HTMLElement] = js.native
  
  /**
    *  Display the notice.
    */
  def open(): Unit = js.native
  
  /**
    * Remove the notice.
    */
  def remove(): Unit = js.native
  
  /**
    * The state can be "initializing", "opening", "open", "closing", and "closed"
    */
  var state: js.UndefOr[StateOptions] = js.native
  
  /**
    * This function is for updating the notice.
    */
  def update(): PNotify = js.native
  def update(options: PNotifyOptions): PNotify = js.native
}
