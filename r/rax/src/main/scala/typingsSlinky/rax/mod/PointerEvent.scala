package typingsSlinky.rax.mod

import typingsSlinky.rax.raxStrings.mouse
import typingsSlinky.rax.raxStrings.pen
import typingsSlinky.rax.raxStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEvent[T]
  extends MouseEvent[T, org.scalajs.dom.raw.PointerEvent] {
  
  var height: Double = js.native
  
  var isPrimary: Boolean = js.native
  
  var pointerId: Double = js.native
  
  var pointerType: mouse | pen | touch = js.native
  
  var pressure: Double = js.native
  
  var tiltX: Double = js.native
  
  var tiltY: Double = js.native
  
  var width: Double = js.native
}
