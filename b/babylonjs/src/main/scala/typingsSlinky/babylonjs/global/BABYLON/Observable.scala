package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
class Observable[T] ()
  extends typingsSlinky.babylonjs.BABYLON.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typingsSlinky.babylonjs.BABYLON.Observer[T], Unit]) = this()
}

