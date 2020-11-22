package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.timerMod.ITimerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AdvancedTimer")
@js.native
class AdvancedTimer[T] protected ()
  extends typingsSlinky.babylonjs.legacyMod.AdvancedTimer[T] {
  /**
    * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
    * @param options construction options for this advanced timer
    */
  def this(options: ITimerOptions[T]) = this()
}
