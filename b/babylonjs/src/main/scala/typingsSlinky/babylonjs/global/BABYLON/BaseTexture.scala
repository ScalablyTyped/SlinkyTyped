package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseTexture")
@js.native
class BaseTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.BaseTexture {
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param scene Define the scene the texture blongs to
    */
  def this(scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]) = this()
}
/* static members */
@JSGlobal("BABYLON.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  def WhenAllReady(textures: js.Array[typingsSlinky.babylonjs.BABYLON.BaseTexture], callback: js.Function0[Unit]): Unit = js.native
}
