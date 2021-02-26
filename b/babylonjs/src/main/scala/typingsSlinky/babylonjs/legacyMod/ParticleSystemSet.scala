package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typingsSlinky.babylonjs.indexMod.ParticleSystemSet
/* static members */
object ParticleSystemSet {
  
  @JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet.BaseAssetsUrl")
  @js.native
  def BaseAssetsUrl: String = js.native
  @scala.inline
  def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  @JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
  @JSImport("babylonjs/Legacy/legacy", "ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, gpu: Boolean): typingsSlinky.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
}
