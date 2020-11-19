package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/EmitterTypes/index", JSImport.Namespace)
@js.native
object emitterTypesIndexMod extends js.Object {
  
  @js.native
  /**
    * Creates a new instance BoxParticleEmitter
    */
  class BoxParticleEmitter ()
    extends typingsSlinky.babylonjs.boxParticleEmitterMod.BoxParticleEmitter
  
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  class ConeParticleEmitter ()
    extends typingsSlinky.babylonjs.coneParticleEmitterMod.ConeParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
  }
  
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  class CustomParticleEmitter ()
    extends typingsSlinky.babylonjs.customParticleEmitterMod.CustomParticleEmitter
  
  @js.native
  /**
    * Creates a new instance CylinderDirectedParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class CylinderDirectedParticleEmitter ()
    extends typingsSlinky.babylonjs.cylinderParticleEmitterMod.CylinderDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(radius: Double, height: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double, radiusRange: Double) = this()
    def this(radius: Double, height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: Double, height: Double, radiusRange: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @js.native
  /**
    * Creates a new instance CylinderParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class CylinderParticleEmitter ()
    extends typingsSlinky.babylonjs.cylinderParticleEmitterMod.CylinderParticleEmitter {
    def this(/**
      * The radius of the emission cylinder.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @js.native
  /**
    * Creates a new instance HemisphericParticleEmitter
    * @param radius the radius of the emission hemisphere (1 by default)
    * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class HemisphericParticleEmitter ()
    extends typingsSlinky.babylonjs.hemisphericParticleEmitterMod.HemisphericParticleEmitter {
    def this(/**
      * The radius of the emission hemisphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @js.native
  /**
    * Creates a new instance MeshParticleEmitter
    * @param mesh defines the mesh to use as source
    */
  class MeshParticleEmitter ()
    extends typingsSlinky.babylonjs.meshParticleEmitterMod.MeshParticleEmitter {
    def this(/** Defines the mesh to use as source */
    mesh: AbstractMesh) = this()
  }
  
  @js.native
  /**
    * Creates a new instance PointParticleEmitter
    */
  class PointParticleEmitter ()
    extends typingsSlinky.babylonjs.pointParticleEmitterMod.PointParticleEmitter
  
  @js.native
  /**
    * Creates a new instance SphereDirectedParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class SphereDirectedParticleEmitter ()
    extends typingsSlinky.babylonjs.sphereParticleEmitterMod.SphereDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(radius: Double, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @js.native
  /**
    * Creates a new instance SphereParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class SphereParticleEmitter ()
    extends typingsSlinky.babylonjs.sphereParticleEmitterMod.SphereParticleEmitter {
    def this(/**
      * The radius of the emission sphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
}
