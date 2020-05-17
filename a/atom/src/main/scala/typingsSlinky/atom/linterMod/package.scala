package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type IndieProvider = js.Function1[
    /* register */ js.Function1[
      /* config */ typingsSlinky.atom.linterMod.Config, 
      typingsSlinky.atom.linterMod.IndieDelegate
    ], 
    scala.Unit
  ]
}
