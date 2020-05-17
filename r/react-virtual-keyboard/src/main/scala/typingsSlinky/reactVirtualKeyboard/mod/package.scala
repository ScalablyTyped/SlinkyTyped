package typingsSlinky.reactVirtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keyboard = slinky.core.ReactComponentClass[typingsSlinky.reactVirtualKeyboard.mod.KeyboardProps]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | org.scalajs.dom.raw.Event], 
    /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], 
    /* el */ js.UndefOr[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
}
