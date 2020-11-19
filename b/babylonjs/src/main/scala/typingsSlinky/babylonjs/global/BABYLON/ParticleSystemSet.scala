package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typingsSlinky.babylonjs.BABYLON.ParticleSystemSet
/* static members */
@JSGlobal("BABYLON.ParticleSystemSet")
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
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.ParticleSystemSet = js.native
  def Parse(data: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, gpu: Boolean): typingsSlinky.babylonjs.BABYLON.ParticleSystemSet = js.native
}
