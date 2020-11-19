package typingsSlinky.domInputevent

import typingsSlinky.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-empty-interface
@js.native
trait InputEvent extends UIEvent {
  
  val data: String | Null = js.native
  
  val isComposing: Boolean = js.native
}
