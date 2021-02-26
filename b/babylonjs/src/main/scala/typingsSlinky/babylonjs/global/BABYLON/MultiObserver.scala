package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiObserver")
@js.native
class MultiObserver[T] ()
  extends typingsSlinky.babylonjs.BABYLON.MultiObserver[T]
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
  @JSGlobal("BABYLON.MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typingsSlinky.babylonjs.BABYLON.EventState, Unit]
  ): typingsSlinky.babylonjs.BABYLON.MultiObserver[T] = js.native
  @JSGlobal("BABYLON.MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typingsSlinky.babylonjs.BABYLON.EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): typingsSlinky.babylonjs.BABYLON.MultiObserver[T] = js.native
  @JSGlobal("BABYLON.MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typingsSlinky.babylonjs.BABYLON.EventState, Unit],
    mask: Double
  ): typingsSlinky.babylonjs.BABYLON.MultiObserver[T] = js.native
  @JSGlobal("BABYLON.MultiObserver.Watch")
  @js.native
  def Watch[T](
    observables: js.Array[typingsSlinky.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typingsSlinky.babylonjs.BABYLON.EventState, Unit],
    mask: Double,
    scope: js.Any
  ): typingsSlinky.babylonjs.BABYLON.MultiObserver[T] = js.native
}
