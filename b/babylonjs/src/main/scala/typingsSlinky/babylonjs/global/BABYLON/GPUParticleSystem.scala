package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.anon.Partialcapacitynumberrand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends typingsSlinky.babylonjs.BABYLON.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param customEffect a custom effect used to change the way particles are rendered by default
    */
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[typingsSlinky.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[typingsSlinky.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[typingsSlinky.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[typingsSlinky.babylonjs.BABYLON.Effect]
  ) = this()
}
/* static members */
object GPUParticleSystem {
  
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  @JSGlobal("BABYLON.GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typingsSlinky.babylonjs.BABYLON.GPUParticleSystem = js.native
  @JSGlobal("BABYLON.GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsSlinky.babylonjs.BABYLON.GPUParticleSystem = js.native
  @JSGlobal("BABYLON.GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    rootUrl: String
  ): typingsSlinky.babylonjs.BABYLON.GPUParticleSystem = js.native
  @JSGlobal("BABYLON.GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typingsSlinky.babylonjs.BABYLON.GPUParticleSystem = js.native
}
