package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typingsSlinky.babylonjs.legacyMod.ParticleSystemSet
/* static members */
@JSImport("babylonjs", "ParticleSystemSet")
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
