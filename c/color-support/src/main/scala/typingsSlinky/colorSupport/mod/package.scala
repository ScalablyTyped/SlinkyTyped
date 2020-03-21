package typingsSlinky.colorSupport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorSupport = js.Function2[
    /* options */ js.UndefOr[typingsSlinky.colorSupport.mod.ColorSupportOptions], 
    /* obj */ js.UndefOr[typingsSlinky.colorSupport.mod.ColorSupportResult], 
    typingsSlinky.colorSupport.colorSupportBooleans.`false` | typingsSlinky.colorSupport.mod.ColorSupportResult
  ]
}
