package typingsSlinky.rcSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SwitchChangeEventHandler = js.Function2[
    /* checked */ scala.Boolean, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLButtonElement] | slinky.web.SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLButtonElement], 
    scala.Unit
  ]
  
  type SwitchClickEventHandler = typingsSlinky.rcSwitch.mod.SwitchChangeEventHandler
}
