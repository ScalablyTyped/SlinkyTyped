package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SubEmitter")
@js.native
class SubEmitter protected ()
  extends typingsSlinky.babylonjs.legacyMod.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typingsSlinky.babylonjs.particleSystemMod.ParticleSystem) = this()
}
/* static members */
object SubEmitter {
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  @JSImport("babylonjs", "SubEmitter.Parse")
  @js.native
  def Parse(
    serializationObject: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): typingsSlinky.babylonjs.subEmitterMod.SubEmitter = js.native
  @JSImport("babylonjs", "SubEmitter.Parse")
  @js.native
  def Parse(
    serializationObject: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): typingsSlinky.babylonjs.subEmitterMod.SubEmitter = js.native
  
  /** @hidden */
  @JSImport("babylonjs", "SubEmitter._ParseParticleSystem")
  @js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.particleSystemMod.ParticleSystem = js.native
  @JSImport("babylonjs", "SubEmitter._ParseParticleSystem")
  @js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine, rootUrl: String): typingsSlinky.babylonjs.particleSystemMod.ParticleSystem = js.native
}
