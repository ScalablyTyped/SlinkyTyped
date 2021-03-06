package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointParticleEmitterMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/pointParticleEmitter", "PointParticleEmitter")
  @js.native
  /**
    * Creates a new instance PointParticleEmitter
    */
  class PointParticleEmitter () extends IParticleEmitterType {
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction1: Vector3 = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction2: Vector3 = js.native
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      */
    def parse(serializationObject: js.Any): Unit = js.native
  }
}
