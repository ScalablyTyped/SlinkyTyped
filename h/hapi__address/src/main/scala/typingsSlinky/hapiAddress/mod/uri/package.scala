package typingsSlinky.hapiAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uri {
  type Options = typingsSlinky.hapiHoek.mod.ts.XOR[
    typingsSlinky.hapiAddress.mod.uri.Options.Options, 
    typingsSlinky.hapiAddress.mod.uri.Options.Relative
  ]
}
