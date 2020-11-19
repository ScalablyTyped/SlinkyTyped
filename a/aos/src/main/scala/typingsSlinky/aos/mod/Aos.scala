package typingsSlinky.aos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aos extends js.Object {
  
  /**
    * Initializing AOS
    * - Create options merging defaults with user defined options
    * - Set attributes on <body> as global setting - css relies on it
    * - Attach preparing elements to options.startEvent,
    *   window resize and orientation change
    * - Attach function that handle scroll and everything connected to it
    *   to window scroll event and fire once document is ready to set initial state
    *  @param options options
    */
  def init(): Unit = js.native
  def init(options: AosOptions): Unit = js.native
  
  /**
    * Refresh AOS
    */
  def refresh(): Unit = js.native
  
  /**
    * Hard refresh
    * create array with new elements and trigger refresh
    */
  def refreshHard(): Unit = js.native
}
