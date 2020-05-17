package typingsSlinky.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autolinkerMod {
  type ReplaceFn = js.Function1[
    /* match */ typingsSlinky.autolinker.matchMatchMod.Match, 
    typingsSlinky.autolinker.autolinkerMod.ReplaceFnReturn
  ]
}
