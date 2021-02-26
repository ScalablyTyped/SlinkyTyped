package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CascadedShadowGenerator")
@js.native
class CascadedShadowGenerator protected ()
  extends typingsSlinky.babylonjs.BABYLON.CascadedShadowGenerator {
  /**
    * Creates a Cascaded Shadow Generator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each directional light casting shadows needs to use its own ShadowGenerator.
    * Documentation : https://doc.babylonjs.com/babylon101/cascadedShadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The directional light object generating the shadows.
    * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    */
  def this(mapSize: Double, light: typingsSlinky.babylonjs.BABYLON.DirectionalLight) = this()
  def this(
    mapSize: Double,
    light: typingsSlinky.babylonjs.BABYLON.DirectionalLight,
    usefulFloatFirst: Boolean
  ) = this()
}
/* static members */
object CascadedShadowGenerator {
  
  @JSGlobal("BABYLON.CascadedShadowGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the CSM class
    */
  @JSGlobal("BABYLON.CascadedShadowGenerator.CLASSNAME")
  @js.native
  def CLASSNAME: String = js.native
  @scala.inline
  def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the default number of cascades used by the CSM.
    */
  @JSGlobal("BABYLON.CascadedShadowGenerator.DEFAULT_CASCADES_COUNT")
  @js.native
  val DEFAULT_CASCADES_COUNT: Double = js.native
  
  /**
    * Defines the maximum number of cascades used by the CSM.
    */
  @JSGlobal("BABYLON.CascadedShadowGenerator.MAX_CASCADES_COUNT")
  @js.native
  val MAX_CASCADES_COUNT: Double = js.native
  
  /**
    * Defines the minimum number of cascades used by the CSM.
    */
  @JSGlobal("BABYLON.CascadedShadowGenerator.MIN_CASCADES_COUNT")
  @js.native
  val MIN_CASCADES_COUNT: Double = js.native
  
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @returns The parsed shadow generator
    */
  @JSGlobal("BABYLON.CascadedShadowGenerator.Parse")
  @js.native
  def Parse(parsedShadowGenerator: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.ShadowGenerator = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.CascadedShadowGenerator._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
  
  @JSGlobal("BABYLON.CascadedShadowGenerator.frustumCornersNDCSpace")
  @js.native
  val frustumCornersNDCSpace: js.Any = js.native
}
