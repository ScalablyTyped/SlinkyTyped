package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IMaterialSheenDefines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PBRSheenConfiguration")
@js.native
class PBRSheenConfiguration protected ()
  extends typingsSlinky.babylonjs.BABYLON.PBRSheenConfiguration {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
}

/* static members */
@JSGlobal("BABYLON.PBRSheenConfiguration")
@js.native
object PBRSheenConfiguration extends js.Object {
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  def AddFallbacks(
    defines: IMaterialSheenDefines,
    fallbacks: typingsSlinky.babylonjs.BABYLON.EffectFallbacks,
    currentRank: Double
  ): Double = js.native
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  def PrepareUniformBuffer(uniformBuffer: typingsSlinky.babylonjs.BABYLON.UniformBuffer): Unit = js.native
}

