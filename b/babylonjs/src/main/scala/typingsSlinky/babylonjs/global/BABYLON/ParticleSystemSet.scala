package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typingsSlinky.babylonjs.BABYLON.ParticleSystemSet
/* static members */
object ParticleSystemSet {
  
  @JSGlobal("BABYLON.ParticleSystemSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSGlobal("BABYLON.ParticleSystemSet.BaseAssetsUrl")
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
  @JSGlobal("BABYLON.ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.ParticleSystemSet = js.native
  @JSGlobal("BABYLON.ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, gpu: Boolean): typingsSlinky.babylonjs.BABYLON.ParticleSystemSet = js.native
}
