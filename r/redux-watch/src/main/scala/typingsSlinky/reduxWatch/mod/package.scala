package typingsSlinky.reduxWatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** Whenever a given state field changes this handler will be called. */
  type ChangeHandler[T] = js.Function3[
    /* newValue */ T, 
    /* oldValue */ T, 
    /* pathToField */ typingsSlinky.reduxWatch.mod.FieldPath, 
    scala.Unit
  ]
  /**
    * @returns Function, that wraps the given change handler in. It should be
    * subscribed to state changes using store.subscribe(). Afterwards, it
    * calls change handler whenever the watched state field changes.
    */
  type ChangeHandlerWrapper[T] = js.Function1[
    /* changeHandler */ typingsSlinky.reduxWatch.mod.ChangeHandler[T], 
    typingsSlinky.reduxWatch.mod.FieldWatch
  ]
  /** @see ChangeHandlerWrapper */
  type FieldWatch = js.Function0[scala.Unit]
}
