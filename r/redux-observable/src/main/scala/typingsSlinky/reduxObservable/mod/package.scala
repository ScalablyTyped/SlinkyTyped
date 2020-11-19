package typingsSlinky.reduxObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Epic[Input /* <: typingsSlinky.redux.mod.Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ typingsSlinky.reduxObservable.mod.ActionsObservable[Input], 
    /* state$ */ typingsSlinky.reduxObservable.mod.StateObservable[State], 
    /* dependencies */ Dependencies, 
    typingsSlinky.rxjs.mod.Observable_[Output]
  ]
}
