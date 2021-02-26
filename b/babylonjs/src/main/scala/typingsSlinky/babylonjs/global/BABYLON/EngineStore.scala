package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EngineStore")
@js.native
class EngineStore ()
  extends typingsSlinky.babylonjs.BABYLON.EngineStore
/* static members */
object EngineStore {
  
  @JSGlobal("BABYLON.EngineStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  @JSGlobal("BABYLON.EngineStore.FallbackTexture")
  @js.native
  def FallbackTexture: String = js.native
  @scala.inline
  def FallbackTexture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackTexture")(x.asInstanceOf[js.Any])
  
  /** Gets the list of created engines */
  @JSGlobal("BABYLON.EngineStore.Instances")
  @js.native
  def Instances: js.Array[typingsSlinky.babylonjs.BABYLON.Engine] = js.native
  @scala.inline
  def Instances_=(x: js.Array[typingsSlinky.babylonjs.BABYLON.Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  @JSGlobal("BABYLON.EngineStore.UseFallbackTexture")
  @js.native
  def UseFallbackTexture: Boolean = js.native
  @scala.inline
  def UseFallbackTexture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseFallbackTexture")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.EngineStore._LastCreatedScene")
  @js.native
  def _LastCreatedScene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene] = js.native
  @scala.inline
  def _LastCreatedScene_=(x: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LastCreatedScene")(x.asInstanceOf[js.Any])
}
