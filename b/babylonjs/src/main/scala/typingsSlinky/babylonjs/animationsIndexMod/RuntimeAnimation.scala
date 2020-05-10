package typingsSlinky.babylonjs.animationsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/index", "RuntimeAnimation")
@js.native
class RuntimeAnimation protected ()
  extends typingsSlinky.babylonjs.runtimeAnimationMod.RuntimeAnimation {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(
    target: js.Any,
    animation: typingsSlinky.babylonjs.animationMod.Animation,
    scene: Scene,
    host: typingsSlinky.babylonjs.animatableMod.Animatable
  ) = this()
}

