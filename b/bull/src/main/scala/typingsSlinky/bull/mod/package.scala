package typingsSlinky.bull

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActiveEventCallback[T] = js.Function2[
    /* job */ typingsSlinky.bull.mod.Job[T], 
    /* jobPromise */ js.UndefOr[typingsSlinky.bull.mod.JobPromise], 
    scala.Unit
  ]
  
  type CleanedEventCallback[T] = js.Function2[
    /* jobs */ js.Array[typingsSlinky.bull.mod.Job[T]], 
    /* status */ typingsSlinky.bull.mod.JobStatusClean, 
    scala.Unit
  ]
  
  type CompletedEventCallback[T] = js.Function2[/* job */ typingsSlinky.bull.mod.Job[T], /* result */ js.Any, scala.Unit]
  
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* value */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type ErrorEventCallback = js.Function1[/* error */ js.Error, scala.Unit]
  
  type EventCallback = js.Function0[scala.Unit]
  
  type FailedEventCallback[T] = js.Function2[/* job */ typingsSlinky.bull.mod.Job[T], /* error */ js.Error, scala.Unit]
  
  type JobId = scala.Double | java.lang.String
  
  type ProcessCallbackFunction[T] = js.Function2[
    /* job */ typingsSlinky.bull.mod.Job[T], 
    /* done */ typingsSlinky.bull.mod.DoneCallback, 
    scala.Unit
  ]
  
  type ProcessPromiseFunction[T] = js.Function1[/* job */ typingsSlinky.bull.mod.Job[T], js.Promise[scala.Unit]]
  
  type ProgressEventCallback[T] = js.Function2[/* job */ typingsSlinky.bull.mod.Job[T], /* progress */ js.Any, scala.Unit]
  
  type RemovedEventCallback[T] = js.Function1[/* job */ typingsSlinky.bull.mod.Job[T], scala.Unit]
  
  type StalledEventCallback[T] = js.Function1[/* job */ typingsSlinky.bull.mod.Job[T], scala.Unit]
  
  type WaitingEventCallback = js.Function1[/* jobId */ typingsSlinky.bull.mod.JobId, scala.Unit]
}
