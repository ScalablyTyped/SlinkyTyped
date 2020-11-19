package typingsSlinky.babylonjs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.babylonjs.particleSystemMod.ParticleSystem
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/subEmitter", JSImport.Namespace)
@js.native
object subEmitterMod extends js.Object {
  
  @js.native
  class SubEmitter protected () extends js.Object {
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
  @js.native
  object SubEmitter extends js.Object {
    
    /**
      * Creates a new SubEmitter from a serialized JSON version
      * @param serializationObject defines the JSON object to read from
      * @param scene defines the hosting scene
      * @param rootUrl defines the rootUrl for data loading
      * @returns a new SubEmitter
      */
    def Parse(serializationObject: js.Any, scene: Scene, rootUrl: String): SubEmitter = js.native
    
    /** @hidden */
    def _ParseParticleSystem(system: js.Any, scene: Scene, rootUrl: String): ParticleSystem = js.native
  }
  
  @js.native
  sealed trait SubEmitterType extends js.Object
  @js.native
  object SubEmitterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SubEmitterType with Double] = js.native
    
    /**
      * Attached to the particle over it's lifetime
      */
    @js.native
    sealed trait ATTACHED extends SubEmitterType
    /* 0 */ @js.native
    object ATTACHED extends TopLevel[ATTACHED with Double]
    
    /**
      * Created when the particle dies
      */
    @js.native
    sealed trait END extends SubEmitterType
    /* 1 */ @js.native
    object END extends TopLevel[END with Double]
  }
}
