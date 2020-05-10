package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typingsSlinky.babylonjs.indexMod.ParticleSystemSet

/* static members */
@JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet")
@js.native
object ParticleSystemSet extends js.Object {
  /**
    * Gets or sets base Assets URL
    */
  var BaseAssetsUrl: String = js.native
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, gpu: Boolean): typingsSlinky.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
}

