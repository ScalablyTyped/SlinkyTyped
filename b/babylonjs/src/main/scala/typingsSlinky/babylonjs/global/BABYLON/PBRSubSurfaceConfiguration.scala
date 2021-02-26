package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IMaterialSubSurfaceDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRSubSurfaceConfiguration")
@js.native
class PBRSubSurfaceConfiguration protected ()
  extends typingsSlinky.babylonjs.BABYLON.PBRSubSurfaceConfiguration {
  /**
    * Instantiate a new istance of sub surface configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    * @param markScenePrePassDirty Callback to flag the scene as prepass dirty
    * @param scene The scene
    */
  def this(
    markAllSubMeshesAsTexturesDirty: js.Function0[Unit],
    markScenePrePassDirty: js.Function0[Unit],
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object PBRSubSurfaceConfiguration {
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  @JSGlobal("BABYLON.PBRSubSurfaceConfiguration.AddFallbacks")
  @js.native
  def AddFallbacks(
    defines: IMaterialSubSurfaceDefines,
    fallbacks: typingsSlinky.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  @JSGlobal("BABYLON.PBRSubSurfaceConfiguration.AddSamplers")
  @js.native
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  @JSGlobal("BABYLON.PBRSubSurfaceConfiguration.AddUniforms")
  @js.native
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  @JSGlobal("BABYLON.PBRSubSurfaceConfiguration.PrepareUniformBuffer")
  @js.native
  def PrepareUniformBuffer(uniformBuffer: typingsSlinky.babylonjs.BABYLON.UniformBuffer): Unit = js.native
}
