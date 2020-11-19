package typingsSlinky.kue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]
  
  type JobCallback = js.Function2[
    /* err */ js.UndefOr[js.Any], 
    /* job */ js.UndefOr[typingsSlinky.kue.mod.Job], 
    scala.Unit
  ]
  
  type ProcessCallback = (js.Function2[
    /* job */ typingsSlinky.kue.mod.Job, 
    /* cb */ typingsSlinky.kue.mod.DoneCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* job */ typingsSlinky.kue.mod.Job, 
    /* ctx */ typingsSlinky.kue.mod.WorkerCtx, 
    /* cb */ typingsSlinky.kue.mod.DoneCallback, 
    scala.Unit
  ])
}
