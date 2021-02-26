package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PhysicsImpostor")
@js.native
class PhysicsImpostor protected ()
  extends typingsSlinky.babylonjs.legacyMod.PhysicsImpostor {
  /**
    * Initializes the physics imposter
    * @param object The physics-enabled object used as the physics imposter
    * @param type The type of the physics imposter
    * @param _options The options for the physics imposter
    * @param _scene The Babylon scene
    */
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double,
    _options: PhysicsImpostorParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double,
    _options: js.UndefOr[scala.Nothing],
    _scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject,
    /**
    * The type of the physics imposter
    */
  `type`: Double,
    _options: PhysicsImpostorParameters,
    _scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object PhysicsImpostor {
  
  @JSImport("babylonjs", "PhysicsImpostor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Box-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.BoxImpostor")
  @js.native
  def BoxImpostor: Double = js.native
  @scala.inline
  def BoxImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoxImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Capsule-Impostor type (Ammo.js plugin only)
    */
  @JSImport("babylonjs", "PhysicsImpostor.CapsuleImpostor")
  @js.native
  def CapsuleImpostor: Double = js.native
  @scala.inline
  def CapsuleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CapsuleImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Cloth-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.ClothImpostor")
  @js.native
  def ClothImpostor: Double = js.native
  @scala.inline
  def ClothImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClothImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * ConvexHull-Impostor type (Ammo.js plugin only)
    */
  @JSImport("babylonjs", "PhysicsImpostor.ConvexHullImpostor")
  @js.native
  def ConvexHullImpostor: Double = js.native
  @scala.inline
  def ConvexHullImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvexHullImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Custom-Imposter type (Ammo.js plugin only)
    */
  @JSImport("babylonjs", "PhysicsImpostor.CustomImpostor")
  @js.native
  def CustomImpostor: Double = js.native
  @scala.inline
  def CustomImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Cylinder-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.CylinderImpostor")
  @js.native
  def CylinderImpostor: Double = js.native
  @scala.inline
  def CylinderImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CylinderImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * The default object size of the imposter
    */
  @JSImport("babylonjs", "PhysicsImpostor.DEFAULT_OBJECT_SIZE")
  @js.native
  def DEFAULT_OBJECT_SIZE: typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  @scala.inline
  def DEFAULT_OBJECT_SIZE_=(x: typingsSlinky.babylonjs.mathVectorMod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OBJECT_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Heightmap-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.HeightmapImpostor")
  @js.native
  def HeightmapImpostor: Double = js.native
  @scala.inline
  def HeightmapImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeightmapImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * The identity quaternion of the imposter
    */
  @JSImport("babylonjs", "PhysicsImpostor.IDENTITY_QUATERNION")
  @js.native
  def IDENTITY_QUATERNION: typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
  @scala.inline
  def IDENTITY_QUATERNION_=(x: typingsSlinky.babylonjs.mathVectorMod.Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_QUATERNION")(x.asInstanceOf[js.Any])
  
  /**
    * Mesh-imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.MeshImpostor")
  @js.native
  def MeshImpostor: Double = js.native
  @scala.inline
  def MeshImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MeshImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * No-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.NoImpostor")
  @js.native
  def NoImpostor: Double = js.native
  @scala.inline
  def NoImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Particle-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.ParticleImpostor")
  @js.native
  def ParticleImpostor: Double = js.native
  @scala.inline
  def ParticleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParticleImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Plane-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.PlaneImpostor")
  @js.native
  def PlaneImpostor: Double = js.native
  @scala.inline
  def PlaneImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaneImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Rope-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.RopeImpostor")
  @js.native
  def RopeImpostor: Double = js.native
  @scala.inline
  def RopeImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RopeImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Softbody-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.SoftbodyImpostor")
  @js.native
  def SoftbodyImpostor: Double = js.native
  @scala.inline
  def SoftbodyImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SoftbodyImpostor")(x.asInstanceOf[js.Any])
  
  /**
    * Sphere-Imposter type
    */
  @JSImport("babylonjs", "PhysicsImpostor.SphereImpostor")
  @js.native
  def SphereImpostor: Double = js.native
  @scala.inline
  def SphereImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SphereImpostor")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PhysicsImpostor._tmpQuat")
  @js.native
  def _tmpQuat: js.Any = js.native
  @scala.inline
  def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PhysicsImpostor._tmpVecs")
  @js.native
  def _tmpVecs: js.Any = js.native
  @scala.inline
  def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
}
