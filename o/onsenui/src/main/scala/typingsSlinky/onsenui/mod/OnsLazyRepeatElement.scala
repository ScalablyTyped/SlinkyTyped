package typingsSlinky.onsenui.mod

import typingsSlinky.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsLazyRepeatElement extends HTMLElement {
  
  /**
    * @Specify a delegate object to load and unload item elements.
    */
  var delegate: LazyRepeatOptions = js.native
  
  /**
    * @description Refresh the list. Use this method when the data has changed.
    */
  def refresh(): Unit = js.native
}
