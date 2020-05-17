package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EngineStore")
@js.native
class EngineStore ()
  extends typingsSlinky.babylonjs.BABYLON.EngineStore

/* static members */
@JSGlobal("BABYLON.EngineStore")
@js.native
object EngineStore extends js.Object {
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  var FallbackTexture: String = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[typingsSlinky.babylonjs.BABYLON.Engine] = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  var UseFallbackTexture: Boolean = js.native
  /** @hidden */
  var _LastCreatedScene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[typingsSlinky.babylonjs.BABYLON.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene] = js.native
}

