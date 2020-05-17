package typingsSlinky.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createTransitionManagerMod {
  type PromptFunction[S] = js.Function2[
    /* location */ typingsSlinky.history.mod.Location[S], 
    /* action */ typingsSlinky.history.mod.Action, 
    js.Any
  ]
}
