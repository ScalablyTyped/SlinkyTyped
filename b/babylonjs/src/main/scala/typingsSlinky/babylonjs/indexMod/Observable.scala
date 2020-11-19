package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
class Observable[T] ()
  extends typingsSlinky.babylonjs.miscIndexMod.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typingsSlinky.babylonjs.observableMod.Observer[T], Unit]) = this()
}
