package typingsSlinky.history.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object History {
  type Hash = java.lang.String
  type Href = java.lang.String
  type LocationKey = java.lang.String
  type LocationListener[S] = js.Function2[
    /* location */ typingsSlinky.history.mod.Location[S], 
    /* action */ typingsSlinky.history.mod.Action, 
    scala.Unit
  ]
  type LocationState = typingsSlinky.history.mod.History.PoorMansUnknown
  type Path = java.lang.String
  type Pathname = java.lang.String
  type Search = java.lang.String
  type TransitionHook[S] = js.Function2[
    /* location */ typingsSlinky.history.mod.Location[S], 
    /* callback */ js.Function1[/* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type TransitionPromptHook[S] = js.Function2[
    /* location */ typingsSlinky.history.mod.Location[S], 
    /* action */ typingsSlinky.history.mod.Action, 
    java.lang.String | typingsSlinky.history.historyBooleans.`false` | scala.Unit
  ]
}
