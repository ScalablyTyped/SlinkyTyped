package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEngine
import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.observableMod.Observer
import typingsSlinky.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostorParameters
import typingsSlinky.babylonjs.physicsJointMod.DistanceJointData
import typingsSlinky.babylonjs.physicsJointMod.PhysicsJointData
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsIndexMod {
  
  @JSImport("babylonjs/Physics/index", "AmmoJSPlugin")
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  class AmmoJSPlugin ()
    extends typingsSlinky.babylonjs.physicsPluginsIndexMod.AmmoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], ammoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      ammoInjection: js.UndefOr[scala.Nothing],
      overlappingPairCache: js.Any
    ) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      ammoInjection: js.Any,
      overlappingPairCache: js.Any
    ) = this()
    def this(
      _useDeltaForWorldStep: Boolean,
      ammoInjection: js.UndefOr[scala.Nothing],
      overlappingPairCache: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: js.Any, overlappingPairCache: js.Any) = this()
  }
  /* static members */
  object AmmoJSPlugin {
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin.DISABLE_COLLISION_FLAG")
    @js.native
    val DISABLE_COLLISION_FLAG: js.Any = js.native
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin.DISABLE_DEACTIVATION_FLAG")
    @js.native
    val DISABLE_DEACTIVATION_FLAG: js.Any = js.native
    
    @JSImport("babylonjs/Physics/index", "AmmoJSPlugin.KINEMATIC_FLAG")
    @js.native
    val KINEMATIC_FLAG: js.Any = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "CannonJSPlugin")
  @js.native
  class CannonJSPlugin ()
    extends typingsSlinky.babylonjs.physicsPluginsIndexMod.CannonJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      iterations: js.UndefOr[scala.Nothing],
      cannonInjection: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double, cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: js.UndefOr[scala.Nothing], cannonInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, cannonInjection: js.Any) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "DistanceJoint")
  @js.native
  class DistanceJoint protected ()
    extends typingsSlinky.babylonjs.physicsJointMod.DistanceJoint {
    /**
      *
      * @param jointData The data for the Distance-Joint
      */
    def this(jointData: DistanceJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "Hinge2Joint")
  @js.native
  class Hinge2Joint protected ()
    extends typingsSlinky.babylonjs.physicsJointMod.Hinge2Joint {
    /**
      * Initializes the Hinge2-Joint
      * @param jointData The joint data for the Hinge2-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "HingeJoint")
  @js.native
  class HingeJoint protected ()
    extends typingsSlinky.babylonjs.physicsJointMod.HingeJoint {
    /**
      * Initializes the Hinge-Joint
      * @param jointData The joint data for the Hinge-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "MotorEnabledJoint")
  @js.native
  class MotorEnabledJoint protected ()
    extends typingsSlinky.babylonjs.physicsJointMod.MotorEnabledJoint {
    /**
      * Initializes the Motor-Enabled Joint
      * @param type The type of the joint
      * @param jointData The physica joint data for the joint
      */
    def this(`type`: Double, jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "OimoJSPlugin")
  @js.native
  class OimoJSPlugin ()
    extends typingsSlinky.babylonjs.physicsPluginsIndexMod.OimoJSPlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double) = this()
    def this(
      _useDeltaForWorldStep: js.UndefOr[scala.Nothing],
      iterations: js.UndefOr[scala.Nothing],
      oimoInjection: js.Any
    ) = this()
    def this(_useDeltaForWorldStep: js.UndefOr[scala.Nothing], iterations: Double, oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: js.UndefOr[scala.Nothing], oimoInjection: js.Any) = this()
    def this(_useDeltaForWorldStep: Boolean, iterations: Double, oimoInjection: js.Any) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsEngine")
  @js.native
  class PhysicsEngine protected ()
    extends typingsSlinky.babylonjs.physicsEngineMod.PhysicsEngine {
    /**
      * Creates a new Physics Engine
      * @param gravity defines the gravity vector used by the simulation
      * @param _physicsPlugin defines the plugin to use (CannonJS by default)
      */
    def this(gravity: Nullable[Vector3]) = this()
    def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
  }
  /* static members */
  object PhysicsEngine {
    
    @JSImport("babylonjs/Physics/index", "PhysicsEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory used to create the default physics plugin.
      * @returns The default physics plugin
      */
    @JSImport("babylonjs/Physics/index", "PhysicsEngine.DefaultPluginFactory")
    @js.native
    def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
    
    /**
      * Global value used to control the smallest number supported by the simulation
      */
    @JSImport("babylonjs/Physics/index", "PhysicsEngine.Epsilon")
    @js.native
    def Epsilon: Double = js.native
    @scala.inline
    def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsEngineSceneComponent")
  @js.native
  class PhysicsEngineSceneComponent protected ()
    extends typingsSlinky.babylonjs.physicsEngineComponentMod.PhysicsEngineSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsHelper")
  @js.native
  class PhysicsHelper protected ()
    extends typingsSlinky.babylonjs.physicsHelperMod.PhysicsHelper {
    /**
      * Initializes the Physics helper
      * @param scene Babylon.js scene
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsImpostor")
  @js.native
  class PhysicsImpostor protected ()
    extends typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor {
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
      _scene: Scene
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
      _scene: Scene
    ) = this()
  }
  /* static members */
  object PhysicsImpostor {
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Box-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.BoxImpostor")
    @js.native
    def BoxImpostor: Double = js.native
    @scala.inline
    def BoxImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoxImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Capsule-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CapsuleImpostor")
    @js.native
    def CapsuleImpostor: Double = js.native
    @scala.inline
    def CapsuleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CapsuleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cloth-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ClothImpostor")
    @js.native
    def ClothImpostor: Double = js.native
    @scala.inline
    def ClothImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClothImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * ConvexHull-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ConvexHullImpostor")
    @js.native
    def ConvexHullImpostor: Double = js.native
    @scala.inline
    def ConvexHullImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvexHullImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Custom-Imposter type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CustomImpostor")
    @js.native
    def CustomImpostor: Double = js.native
    @scala.inline
    def CustomImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cylinder-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.CylinderImpostor")
    @js.native
    def CylinderImpostor: Double = js.native
    @scala.inline
    def CylinderImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CylinderImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The default object size of the imposter
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.DEFAULT_OBJECT_SIZE")
    @js.native
    def DEFAULT_OBJECT_SIZE: Vector3 = js.native
    @scala.inline
    def DEFAULT_OBJECT_SIZE_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OBJECT_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * Heightmap-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.HeightmapImpostor")
    @js.native
    def HeightmapImpostor: Double = js.native
    @scala.inline
    def HeightmapImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeightmapImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The identity quaternion of the imposter
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.IDENTITY_QUATERNION")
    @js.native
    def IDENTITY_QUATERNION: Quaternion = js.native
    @scala.inline
    def IDENTITY_QUATERNION_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_QUATERNION")(x.asInstanceOf[js.Any])
    
    /**
      * Mesh-imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.MeshImpostor")
    @js.native
    def MeshImpostor: Double = js.native
    @scala.inline
    def MeshImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MeshImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * No-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.NoImpostor")
    @js.native
    def NoImpostor: Double = js.native
    @scala.inline
    def NoImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Particle-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.ParticleImpostor")
    @js.native
    def ParticleImpostor: Double = js.native
    @scala.inline
    def ParticleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParticleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Plane-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.PlaneImpostor")
    @js.native
    def PlaneImpostor: Double = js.native
    @scala.inline
    def PlaneImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaneImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Rope-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.RopeImpostor")
    @js.native
    def RopeImpostor: Double = js.native
    @scala.inline
    def RopeImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RopeImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Softbody-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.SoftbodyImpostor")
    @js.native
    def SoftbodyImpostor: Double = js.native
    @scala.inline
    def SoftbodyImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SoftbodyImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Sphere-Imposter type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor.SphereImpostor")
    @js.native
    def SphereImpostor: Double = js.native
    @scala.inline
    def SphereImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SphereImpostor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/index", "PhysicsImpostor._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsJoint")
  @js.native
  class PhysicsJoint protected ()
    extends typingsSlinky.babylonjs.physicsJointMod.PhysicsJoint {
    /**
      * Initializes the physics joint
      * @param type The type of the physics joint
      * @param jointData The data for the physics joint
      */
    def this(
      /**
      * The type of the physics joint
      */
    `type`: Double,
      /**
      * The data for the physics joint
      */
    jointData: PhysicsJointData
    ) = this()
  }
  /* static members */
  object PhysicsJoint {
    
    @JSImport("babylonjs/Physics/index", "PhysicsJoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Ball-and-Socket joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.BallAndSocketJoint")
    @js.native
    def BallAndSocketJoint: Double = js.native
    @scala.inline
    def BallAndSocketJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BallAndSocketJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Distance-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.DistanceJoint")
    @js.native
    def DistanceJoint: Double = js.native
    @scala.inline
    def DistanceJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DistanceJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint 2 type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.Hinge2Joint")
    @js.native
    def Hinge2Joint: Double = js.native
    @scala.inline
    def Hinge2Joint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hinge2Joint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.HingeJoint")
    @js.native
    def HingeJoint: Double = js.native
    @scala.inline
    def HingeJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HingeJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Lock-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.LockJoint")
    @js.native
    def LockJoint: Double = js.native
    @scala.inline
    def LockJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LockJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.PointToPointJoint")
    @js.native
    def PointToPointJoint: Double = js.native
    @scala.inline
    def PointToPointJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointToPointJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Prismatic-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.PrismaticJoint")
    @js.native
    def PrismaticJoint: Double = js.native
    @scala.inline
    def PrismaticJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrismaticJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Slider-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.SliderJoint")
    @js.native
    def SliderJoint: Double = js.native
    @scala.inline
    def SliderJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Spring-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.SpringJoint")
    @js.native
    def SpringJoint: Double = js.native
    @scala.inline
    def SpringJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpringJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Universal-Joint type
      * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.UniversalJoint")
    @js.native
    def UniversalJoint: Double = js.native
    @scala.inline
    def UniversalJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniversalJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Wheel-Joint type
      */
    @JSImport("babylonjs/Physics/index", "PhysicsJoint.WheelJoint")
    @js.native
    def WheelJoint: Double = js.native
    @scala.inline
    def WheelJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelJoint")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsRadialExplosionEventOptions")
  @js.native
  class PhysicsRadialExplosionEventOptions ()
    extends typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialExplosionEventOptions
  
  @JSImport("babylonjs/Physics/index", "PhysicsRadialImpulseFalloff")
  @js.native
  object PhysicsRadialImpulseFalloff extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff with Double] = js.native
    
    /* 0 */ val Constant: typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Constant with Double = js.native
    
    /* 1 */ val Linear: typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Linear with Double = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsUpdraftEventOptions")
  @js.native
  class PhysicsUpdraftEventOptions ()
    extends typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftEventOptions
  
  @JSImport("babylonjs/Physics/index", "PhysicsUpdraftMode")
  @js.native
  object PhysicsUpdraftMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftMode with Double] = js.native
    
    /* 0 */ val Center: typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Center with Double = js.native
    
    /* 1 */ val Perpendicular: typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Perpendicular with Double = js.native
  }
  
  @JSImport("babylonjs/Physics/index", "PhysicsVortexEventOptions")
  @js.native
  class PhysicsVortexEventOptions ()
    extends typingsSlinky.babylonjs.physicsHelperMod.PhysicsVortexEventOptions
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @hidden */
      var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
      
      /** @hidden */
      var _physicsImpostor: Nullable[typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /** Apply a physic impulse to the mesh
        * @param force defines the force to apply
        * @param contactPoint defines where to apply the force
        * @returns the current mesh
        * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
        */
      def applyImpulse(force: Vector3, contactPoint: Vector3): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
      
      /**
        * Gets the current physics impostor
        * @see https://doc.babylonjs.com/features/physics_engine
        * @returns a physics impostor or null
        */
      def getPhysicsImpostor(): Nullable[typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /**
        * Gets or sets impostor used for physic simulation
        * @see https://doc.babylonjs.com/features/physics_engine
        */
      var physicsImpostor: Nullable[typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor] = js.native
      
      /**
        * Creates a physic joint between two meshes
        * @param otherMesh defines the other mesh to use
        * @param pivot1 defines the pivot to use on this mesh
        * @param pivot2 defines the pivot to use on the other mesh
        * @param options defines additional options (can be plugin dependent)
        * @returns the current mesh
        * @see https://www.babylonjs-playground.com/#0BS5U0#0
        */
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _physicsEngine: Nullable[IPhysicsEngine] = js.native
      
      /** @hidden */
      var _physicsTimeAccumulator: Double = js.native
      
      /**
        * Deletes a physics compound impostor
        * @param compound defines the compound to delete
        */
      def deleteCompoundImpostor(compound: js.Any): Unit = js.native
      
      /**
        * Disables and disposes the physics engine associated with the scene
        */
      def disablePhysicsEngine(): Unit = js.native
      
      /**
        * Enables physics to the current scene
        * @param gravity defines the scene's gravity for the physics engine
        * @param plugin defines the physics engine to be used. defaults to OimoJS.
        * @return a boolean indicating if the physics engine was initialized
        */
      def enablePhysics(gravity: Nullable[Vector3]): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
      
      /**
        * Gets the current physics engine
        * @returns a IPhysicsEngine or null if none attached
        */
      def getPhysicsEngine(): Nullable[IPhysicsEngine] = js.native
      
      /**
        * Gets a boolean indicating if there is an active physics engine
        * @returns a boolean indicating if there is an active physics engine
        */
      def isPhysicsEnabled(): Boolean = js.native
      
      /**
        * An event triggered when physic simulation has been done
        */
      var onAfterPhysicsObservable: Observable[
            typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
      
      /**
        * An event triggered when physic simulation is about to be run
        */
      var onBeforePhysicsObservable: Observable[
            typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
    }
  }
}
