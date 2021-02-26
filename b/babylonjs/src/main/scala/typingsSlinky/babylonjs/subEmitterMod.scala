package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.particleSystemMod.ParticleSystem
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subEmitterMod {
  
  @JSImport("babylonjs/Particles/subEmitter", "SubEmitter")
  @js.native
  class SubEmitter protected () extends StObject {
    /**
      * Creates a sub emitter
      * @param particleSystem the particle system to be used by the sub emitter
      */
    def this(/**
      * the particle system to be used by the sub emitter
      */
    particleSystem: ParticleSystem) = this()
    
    /** Release associated resources */
    def dispose(): Unit = js.native
    
    /**
      * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
      * Note: This only is supported when using an emitter of type Mesh
      */
    var inheritDirection: Boolean = js.native
    
    /**
      * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
      */
    var inheritedVelocityAmount: Double = js.native
    
    /**
      * the particle system to be used by the sub emitter
      */
    var particleSystem: ParticleSystem = js.native
    
    /**
      * Serialize current object to a JSON object
      * @returns the serialized object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Type of the submitter (Default: END)
      */
    var `type`: SubEmitterType = js.native
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
    @JSImport("babylonjs/Particles/subEmitter", "SubEmitter.Parse")
    @js.native
    def Parse(serializationObject: js.Any, sceneOrEngine: Scene, rootUrl: String): SubEmitter = js.native
    @JSImport("babylonjs/Particles/subEmitter", "SubEmitter.Parse")
    @js.native
    def Parse(serializationObject: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): SubEmitter = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/subEmitter", "SubEmitter._ParseParticleSystem")
    @js.native
    def _ParseParticleSystem(system: js.Any, sceneOrEngine: Scene, rootUrl: String): ParticleSystem = js.native
    @JSImport("babylonjs/Particles/subEmitter", "SubEmitter._ParseParticleSystem")
    @js.native
    def _ParseParticleSystem(system: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): ParticleSystem = js.native
  }
  
  @js.native
  sealed trait SubEmitterType extends StObject
  @JSImport("babylonjs/Particles/subEmitter", "SubEmitterType")
  @js.native
  object SubEmitterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SubEmitterType with Double] = js.native
    
    /**
      * Attached to the particle over it's lifetime
      */
    @js.native
    sealed trait ATTACHED extends SubEmitterType
    /* 0 */ val ATTACHED: typingsSlinky.babylonjs.subEmitterMod.SubEmitterType.ATTACHED with Double = js.native
    
    /**
      * Created when the particle dies
      */
    @js.native
    sealed trait END extends SubEmitterType
    /* 1 */ val END: typingsSlinky.babylonjs.subEmitterMod.SubEmitterType.END with Double = js.native
  }
}
