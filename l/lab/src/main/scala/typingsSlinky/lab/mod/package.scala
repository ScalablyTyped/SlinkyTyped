package typingsSlinky.lab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncCallback = js.Function1[/* done */ typingsSlinky.lab.mod.DoneFunction, scala.Unit]
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, scala.Unit], scala.Unit]
  type DoneFunction = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type EmptyCallback = js.Function0[scala.Unit]
  type ExperimentArgs = js.Function2[/* desc */ java.lang.String, /* cb */ typingsSlinky.lab.mod.EmptyCallback, js.Object]
  type ExperimentWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typingsSlinky.lab.mod.ExperimentOptions, 
    /* cb */ typingsSlinky.lab.mod.EmptyCallback, 
    js.Object
  ]
  type TestArgs = js.Function2[/* desc */ java.lang.String, /* cb */ typingsSlinky.lab.mod.TestCallback, js.Object]
  type TestCallback = js.Function2[
    /* done */ typingsSlinky.lab.mod.DoneFunction with typingsSlinky.lab.mod.DoneNote, 
    /* onCleanup */ js.UndefOr[typingsSlinky.lab.mod.CleanupFunction], 
    scala.Unit
  ]
  type TestPromise = js.Function0[js.Promise[js.Any]]
  type TestWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typingsSlinky.lab.mod.TestOptions, 
    /* cb */ typingsSlinky.lab.mod.TestCallback, 
    js.Object
  ]
}
