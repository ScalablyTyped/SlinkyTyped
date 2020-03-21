package typingsSlinky.reduceReducers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Reducer[S] = js.Function2[/* state */ S, /* action */ typingsSlinky.reduceReducers.mod.Action, S]
}
