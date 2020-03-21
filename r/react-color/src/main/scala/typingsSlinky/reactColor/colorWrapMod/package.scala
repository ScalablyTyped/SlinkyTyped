package typingsSlinky.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorWrapMod {
  type ColorWrapChangeHandler = js.Function1[
    /* color */ typingsSlinky.reactColor.mod.Color | typingsSlinky.reactColor.mod.ColorResult, 
    scala.Unit
  ]
}
