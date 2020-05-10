package typingsSlinky.babylonjs.actionsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/index", "PredicateCondition")
@js.native
class PredicateCondition protected ()
  extends typingsSlinky.babylonjs.conditionMod.PredicateCondition {
  /**
    * Creates a new PredicateCondition
    * @param actionManager manager for the action the condition applies to
    * @param predicate defines the predicate function used to validate the condition
    */
  def this(
    actionManager: typingsSlinky.babylonjs.actionManagerMod.ActionManager,
    /** defines the predicate function used to validate the condition */
  predicate: js.Function0[Boolean]
  ) = this()
}

