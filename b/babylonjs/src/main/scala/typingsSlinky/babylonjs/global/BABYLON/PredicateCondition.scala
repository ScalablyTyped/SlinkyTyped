package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PredicateCondition")
@js.native
class PredicateCondition protected ()
  extends typingsSlinky.babylonjs.BABYLON.PredicateCondition {
  /**
    * Creates a new PredicateCondition
    * @param actionManager manager for the action the condition applies to
    * @param predicate defines the predicate function used to validate the condition
    */
  def this(
    actionManager: typingsSlinky.babylonjs.BABYLON.ActionManager,
    /** defines the predicate function used to validate the condition */
  predicate: js.Function0[Boolean]
  ) = this()
}

