package typingsSlinky.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resizerMod {
  
  type OnStartCallback = js.Function2[
    /* e */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLDivElement] | slinky.web.SyntheticTouchEvent[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsSlinky.reResizable.resizerMod.Direction, 
    scala.Unit
  ]
}
