package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MultiObserver")
@js.native
class MultiObserver[T] ()
  extends typingsSlinky.babylonjs.legacyMod.MultiObserver[T]
/* static members */
object MultiObserver {
  
  /**
    * Raise a callback when one of the observable will notify
    * @param observables defines a list of observables to watch
    * @param callback defines the callback to call on notification
    * @param mask defines the mask used to filter notifications
    * @param scope defines the current scope used to restore the JS context
    * @returns the new MultiObserver
    */
  @JSImport("babylonjs", "MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ]
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
  @JSImport("babylonjs", "MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ],
    mask: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
  @JSImport("babylonjs", "MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typingsSlinky.babylonjs.observableMod.EventState, 
      Unit
    ],
    mask: Double
  ): typingsSlinky.babylonjs.observableMod.MultiObserver[T] = js.native
  @JSImport("babylonjs", "MultiObserver.Watch")
  @js.native
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
