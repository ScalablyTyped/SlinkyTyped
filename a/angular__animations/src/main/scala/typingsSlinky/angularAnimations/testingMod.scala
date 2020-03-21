package typingsSlinky.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularAnimations.mod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockAnimationDriver ()
    extends typingsSlinky.angularAnimations.testingTestingMod.MockAnimationDriver
  
  @js.native
  class MockAnimationPlayer protected ()
    extends typingsSlinky.angularAnimations.testingTestingMod.MockAnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[_]
    ) = this()
  }
  
  /* static members */
  @js.native
  object MockAnimationDriver extends js.Object {
    var log: js.Array[AnimationPlayer] = js.native
  }
  
}

