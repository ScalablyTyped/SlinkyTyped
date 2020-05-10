package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "MultiObserver")
@js.native
class MultiObserver[T] ()
  extends typingsSlinky.babylonjs.indexMod.MultiObserver[T]

/* static members */
@JSImport("babylonjs/Legacy/legacy", "MultiObserver")
@js.native
object MultiObserver extends js.Object {
  /**
    * Raise a callback when one of the observable will notify
    * @param observables defines a list of observables to watch
    * @param callback defines the callback to call on notification
    * @param mask defines the mask used to filter notifications
    * @param scope defines the current scope used to restore the JS context
    * @returns the new MultiObserver
    */
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ]
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ],
    mask: Double
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ],
    mask: Double,
    scope: js.Any
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
}

