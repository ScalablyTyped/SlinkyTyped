package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BaseTexture")
@js.native
class BaseTexture protected ()
  extends typingsSlinky.babylonjs.indexMod.BaseTexture {
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param sceneOrEngine Define the scene or engine the texture blongs to
    */
  def this(sceneOrEngine: Nullable[
        typingsSlinky.babylonjs.sceneMod.Scene | typingsSlinky.babylonjs.thinEngineMod.ThinEngine
      ]) = this()
}
/* static members */
object BaseTexture {
  
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture.DEFAULT_ANISOTROPIC_FILTERING_LEVEL")
  @js.native
  def DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  @scala.inline
  def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
  
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture.WhenAllReady")
  @js.native
  def WhenAllReady(
    textures: js.Array[typingsSlinky.babylonjs.baseTextureMod.BaseTexture],
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "BaseTexture._isScene")
  @js.native
  def _isScene: js.Any = js.native
  @scala.inline
  def _isScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isScene")(x.asInstanceOf[js.Any])
}
