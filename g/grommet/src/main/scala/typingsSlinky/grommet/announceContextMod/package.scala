package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object announceContextMod {
  type AnnounceMessage = java.lang.String
  type AnnounceValue = js.Function3[
    /* message */ typingsSlinky.grommet.announceContextMod.AnnounceMessage, 
    /* mode */ typingsSlinky.grommet.announceContextMod.AnnounceMode, 
    /* timeout */ typingsSlinky.grommet.announceContextMod.Timeout, 
    scala.Unit
  ]
  type Timeout = scala.Double
}
