package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnimationGroup")
@js.native
class AnimationGroup protected ()
  extends typingsSlinky.babylonjs.BABYLON.AnimationGroup {
  /**
    * Instantiates a new Animation Group.
    * This helps managing several animations at once.
    * @see http://doc.babylonjs.com/how_to/group
    * @param name Defines the name of the group
    * @param scene Defines the scene the group belongs to
    */
  def this(/** The name of the animation group */
  name: String) = this()
  def this(
    /** The name of the animation group */
  name: String,
    scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.AnimationGroup")
@js.native
object AnimationGroup extends js.Object {
  
  /**
    * Returns a new AnimationGroup object parsed from the source provided.
    * @param parsedAnimationGroup defines the source
    * @param scene defines the scene that will receive the animationGroup
    * @returns a new AnimationGroup
    */
  def Parse(parsedAnimationGroup: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.AnimationGroup = js.native
}
