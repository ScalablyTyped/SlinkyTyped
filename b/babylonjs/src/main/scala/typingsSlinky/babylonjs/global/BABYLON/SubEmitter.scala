package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubEmitter")
@js.native
class SubEmitter protected ()
  extends typingsSlinky.babylonjs.BABYLON.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typingsSlinky.babylonjs.BABYLON.ParticleSystem) = this()
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
  @JSGlobal("BABYLON.SubEmitter.Parse")
  @js.native
  def Parse(serializationObject: js.Any, sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.SubEmitter = js.native
  @JSGlobal("BABYLON.SubEmitter.Parse")
  @js.native
  def Parse(
    serializationObject: js.Any,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    rootUrl: String
  ): typingsSlinky.babylonjs.BABYLON.SubEmitter = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.SubEmitter._ParseParticleSystem")
  @js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.ParticleSystem = js.native
  @JSGlobal("BABYLON.SubEmitter._ParseParticleSystem")
  @js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine, rootUrl: String): typingsSlinky.babylonjs.BABYLON.ParticleSystem = js.native
}
