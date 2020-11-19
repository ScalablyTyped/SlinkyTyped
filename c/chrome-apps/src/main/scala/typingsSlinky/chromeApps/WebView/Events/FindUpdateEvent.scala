package typingsSlinky.chromeApps.WebView.Events

import typingsSlinky.chromeApps.WebView.SelectionRect
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when new find results are available for an active find request.
  * This might happen multiple times for a single find request as matches are found.
  */
@js.native
trait FindUpdateEvent extends Event {
  
  /**
    * The ordinal number of the current active match,
    * if it has been found. This will be 0 until then.
    */
  var activeMatchOrdinal: integer = js.native
  
  /**
    * Indicates whether the find request was canceled.
    */
  var canceled: Boolean = js.native
  
  /**
    * Indicates that all find requests have completed
    * and that no more findupdate events will be fired
    * until more find requests are made.
    */
  var finalUpdate: String = js.native
  
  /**
    * The number of matches found for searchText on the page so far.
    */
  var numberOfMatches: integer = js.native
  
  /**
    * The string that is being searched for in the page.
    */
  var searchText: String = js.native
  
  /**
    * Describes a rectangle around the active match,
    * if it has been found, in screen coordinates.
    */
  var selectionRect: SelectionRect = js.native
}
