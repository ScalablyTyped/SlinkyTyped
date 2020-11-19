package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object easeljs {
  
  // rename the native MouseEvent, to avoid conflict with createjs's MouseEvent
  type NativeMouseEvent = org.scalajs.dom.raw.MouseEvent
}
