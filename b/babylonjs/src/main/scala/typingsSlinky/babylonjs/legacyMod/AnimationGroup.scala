package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "AnimationGroup")
@js.native
class AnimationGroup protected ()
  extends typingsSlinky.babylonjs.indexMod.AnimationGroup {
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
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "AnimationGroup")
@js.native
object AnimationGroup extends js.Object {
  /**
    * Returns a new AnimationGroup object parsed from the source provided.
    * @param parsedAnimationGroup defines the source
    * @param scene defines the scene that will receive the animationGroup
    * @returns a new AnimationGroup
    */
  def Parse(parsedAnimationGroup: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.animationGroupMod.AnimationGroup = js.native
}

