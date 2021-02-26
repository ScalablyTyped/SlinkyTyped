package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.DiameterSegments
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsHelperMod {
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsHelper")
  @js.native
  class PhysicsHelper protected () extends StObject {
    /**
      * Initializes the Physics helper
      * @param scene Babylon.js scene
      */
    def this(scene: Scene) = this()
    
    var _physicsEngine: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    /**
      * Applies a radial explosion force
      * @param origin the origin of the explosion
      * @param radiusOrEventOptions the radius or the options of radial explosion
      * @param strength the explosion strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics radial explosion event, or null
      */
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionForce(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    
    /**
      * Applies a radial explosion impulse
      * @param origin the origin of the explosion
      * @param radiusOrEventOptions the radius or the options of radial explosion
      * @param strength the explosion strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics radial explosion event, or null
      */
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
    def applyRadialExplosionImpulse(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsRadialExplosionEvent] = js.native
    
    /**
      * Creates a gravitational field
      * @param origin the origin of the explosion
      * @param radiusOrEventOptions the radius or the options of radial explosion
      * @param strength the explosion strength
      * @param falloff possible options: Constant & Linear. Defaults to Constant
      * @returns A physics gravitational field event, or null
      */
    def gravitationalField(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: js.UndefOr[scala.Nothing],
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
    def gravitationalField(
      origin: Vector3,
      radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
      strength: Double,
      falloff: PhysicsRadialImpulseFalloff
    ): Nullable[PhysicsGravitationalFieldEvent] = js.native
    
    /**
      * Creates a physics updraft event
      * @param origin the origin of the updraft
      * @param radiusOrEventOptions the radius or the options of the updraft
      * @param strength the strength of the updraft
      * @param height the height of the updraft
      * @param updraftMode possible options: Center & Perpendicular. Defaults to Center
      * @returns A physics updraft event, or null
      */
    def updraft(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: js.UndefOr[scala.Nothing], height: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: js.UndefOr[scala.Nothing],
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      height: js.UndefOr[scala.Nothing],
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: Double,
      strength: Double,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: js.UndefOr[scala.Nothing],
      height: Double
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: js.UndefOr[scala.Nothing],
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: js.UndefOr[scala.Nothing],
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: Double
    ): Nullable[PhysicsUpdraftEvent] = js.native
    def updraft(
      origin: Vector3,
      radiusOrEventOptions: PhysicsUpdraftEventOptions,
      strength: Double,
      height: Double,
      updraftMode: PhysicsUpdraftMode
    ): Nullable[PhysicsUpdraftEvent] = js.native
    
    /**
      * Creates a physics vortex event
      * @param origin the of the vortex
      * @param radiusOrEventOptions the radius or the options of the vortex
      * @param strength the strength of the vortex
      * @param height   the height of the vortex
      * @returns a Physics vortex event, or null
      * A physics vortex event or null
      */
    def vortex(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: js.UndefOr[scala.Nothing], height: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions): Nullable[PhysicsVortexEvent] = js.native
    def vortex(
      origin: Vector3,
      radiusOrEventOptions: PhysicsVortexEventOptions,
      strength: js.UndefOr[scala.Nothing],
      height: Double
    ): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double): Nullable[PhysicsVortexEvent] = js.native
    def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsRadialExplosionEventOptions")
  @js.native
  class PhysicsRadialExplosionEventOptions () extends StObject {
    
    /**
      * Sphere options for the radial explosion.
      */
    def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
    
    /**
      * The strenght of the force in correspondence to the distance of the affected object
      */
    var falloff: PhysicsRadialImpulseFalloff = js.native
    
    /**
      * The radius of the sphere for the radial explosion.
      */
    var radius: Double = js.native
    
    /**
      * Sphere options for the radial explosion.
      */
    var sphere: DiameterSegments = js.native
    
    /**
      * The strenth of the explosion.
      */
    var strength: Double = js.native
  }
  
  @js.native
  sealed trait PhysicsRadialImpulseFalloff extends StObject
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsRadialImpulseFalloff")
  @js.native
  object PhysicsRadialImpulseFalloff extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicsRadialImpulseFalloff with Double] = js.native
    
    /** Defines that impulse is constant in strength across it's whole radius */
    @js.native
    sealed trait Constant extends PhysicsRadialImpulseFalloff
    /* 0 */ val Constant: typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Constant with Double = js.native
    
    /** Defines that impulse gets weaker if it's further from the origin */
    @js.native
    sealed trait Linear extends PhysicsRadialImpulseFalloff
    /* 1 */ val Linear: typingsSlinky.babylonjs.physicsHelperMod.PhysicsRadialImpulseFalloff.Linear with Double = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftEventOptions")
  @js.native
  class PhysicsUpdraftEventOptions () extends StObject {
    
    /**
      * The height of the cylinder for the updraft.
      */
    var height: Double = js.native
    
    /**
      * The radius of the cylinder for the vortex
      */
    var radius: Double = js.native
    
    /**
      * The strenth of the updraft.
      */
    var strength: Double = js.native
    
    /**
      * The mode for the the updraft.
      */
    var updraftMode: PhysicsUpdraftMode = js.native
  }
  
  @js.native
  sealed trait PhysicsUpdraftMode extends StObject
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftMode")
  @js.native
  object PhysicsUpdraftMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicsUpdraftMode with Double] = js.native
    
    /** Defines that the upstream forces will pull towards the top center of the cylinder */
    @js.native
    sealed trait Center extends PhysicsUpdraftMode
    /* 0 */ val Center: typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Center with Double = js.native
    
    /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
    @js.native
    sealed trait Perpendicular extends PhysicsUpdraftMode
    /* 1 */ val Perpendicular: typingsSlinky.babylonjs.physicsHelperMod.PhysicsUpdraftMode.Perpendicular with Double = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsHelper", "PhysicsVortexEventOptions")
  @js.native
  class PhysicsVortexEventOptions () extends StObject {
    
    /**
      * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the treshold.
      */
    var centrifugalForceMultiplier: Double = js.native
    
    /**
      * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the treshold.
      */
    var centripetalForceMultiplier: Double = js.native
    
    /**
      * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
      */
    var centripetalForceThreshold: Double = js.native
    
    /**
      * The height of the cylinder for the vortex.
      */
    var height: Double = js.native
    
    /**
      * The radius of the cylinder for the vortex
      */
    var radius: Double = js.native
    
    /**
      * The strenth of the vortex.
      */
    var strength: Double = js.native
    
    /**
      * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
      */
    var updraftForceMultiplier: Double = js.native
  }
  
  @js.native
  trait PhysicsAffectedImpostorWithData extends StObject {
    
    /**
      * The data about the hit/horce from the explosion
      */
    var hitData: PhysicsHitData = js.native
    
    /**
      * The impostor affected by the effect
      */
    var impostor: PhysicsImpostor = js.native
  }
  object PhysicsAffectedImpostorWithData {
    
    @scala.inline
    def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
      val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
    }
    
    @scala.inline
    implicit class PhysicsAffectedImpostorWithDataMutableBuilder[Self <: PhysicsAffectedImpostorWithData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpostor(value: PhysicsImpostor): Self = StObject.set(x, "impostor", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a gravitational field event
    */
  @js.native
  trait PhysicsGravitationalFieldEvent extends StObject {
    
    var _dataFetched: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _origin: js.Any = js.native
    
    var _physicsHelper: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _sphere: js.Any = js.native
    
    var _tick: js.Any = js.native
    
    var _tickCallback: js.Any = js.native
    
    /**
      * Disables the gravitational field.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the sphere.
      * @param force The force to dispose from the gravitational field event
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the gravitational field.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the gravitational field event (sphere).
      * @returns A gravitational field event
      */
    def getData(): PhysicsGravitationalFieldEventData = js.native
  }
  
  @js.native
  trait PhysicsGravitationalFieldEventData extends StObject {
    
    /**
      * A sphere mesh used for the gravitational field event
      */
    var sphere: Mesh = js.native
  }
  object PhysicsGravitationalFieldEventData {
    
    @scala.inline
    def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
      val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
    }
    
    @scala.inline
    implicit class PhysicsGravitationalFieldEventDataMutableBuilder[Self <: PhysicsGravitationalFieldEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhysicsHitData extends StObject {
    
    /**
      * The contact point
      */
    var contactPoint: Vector3 = js.native
    
    /**
      * The distance from the origin to the contact point
      */
    var distanceFromOrigin: Double = js.native
    
    /**
      * The force applied at the contact point
      */
    var force: Vector3 = js.native
  }
  object PhysicsHitData {
    
    @scala.inline
    def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
      val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsHitData]
    }
    
    @scala.inline
    implicit class PhysicsHitDataMutableBuilder[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContactPoint(value: Vector3): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromOrigin(value: Double): Self = StObject.set(x, "distanceFromOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce(value: Vector3): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a physics radial explosion event
    */
  @js.native
  trait PhysicsRadialExplosionEvent extends StObject {
    
    var _dataFetched: js.Any = js.native
    
    var _intersectsWithSphere: js.Any = js.native
    
    var _options: js.Any = js.native
    
    /*** Helpers ***/
    var _prepareSphere: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _sphere: js.Any = js.native
    
    /**
      * Disposes the sphere.
      * @param force Specifies if the sphere should be disposed by force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Returns the data related to the radial explosion event (sphere).
      * @returns The radial explosion event data
      */
    def getData(): PhysicsRadialExplosionEventData = js.native
    
    /**
      * Returns the force and contact point of the impostor or false, if the impostor is not affected by the force/impulse.
      * @param impostor A physics imposter
      * @param origin the origin of the explosion
      * @returns {Nullable<PhysicsHitData>} A physics force and contact point, or null
      */
    def getImpostorHitData(impostor: PhysicsImpostor, origin: Vector3): Nullable[PhysicsHitData] = js.native
    
    /**
      * Triggers affecterd impostors callbacks
      * @param affectedImpostorsWithData defines the list of affected impostors (including associated data)
      */
    def triggerAffectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
  }
  
  @js.native
  trait PhysicsRadialExplosionEventData extends StObject {
    
    /**
      * A sphere used for the radial explosion event
      */
    var sphere: Mesh = js.native
  }
  object PhysicsRadialExplosionEventData {
    
    @scala.inline
    def apply(sphere: Mesh): PhysicsRadialExplosionEventData = {
      val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsRadialExplosionEventData]
    }
    
    @scala.inline
    implicit class PhysicsRadialExplosionEventDataMutableBuilder[Self <: PhysicsRadialExplosionEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a physics updraft event
    */
  @js.native
  trait PhysicsUpdraftEvent extends StObject {
    
    var _cylinder: js.Any = js.native
    
    var _cylinderPosition: js.Any = js.native
    
    var _dataFetched: js.Any = js.native
    
    var _intersectsWithCylinder: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _origin: js.Any = js.native
    
    var _originDirection: js.Any = js.native
    
    var _originTop: js.Any = js.native
    
    var _physicsEngine: js.Any = js.native
    
    /*** Helpers ***/
    var _prepareCylinder: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _tick: js.Any = js.native
    
    var _tickCallback: js.Any = js.native
    
    /**
      * Disables the updraft.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the cylinder.
      * @param force Specifies if the updraft should be disposed by force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the updraft.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the updraft event (cylinder).
      * @returns A physics updraft event
      */
    def getData(): PhysicsUpdraftEventData = js.native
    
    var getImpostorHitData: js.Any = js.native
  }
  
  @js.native
  trait PhysicsUpdraftEventData extends StObject {
    
    /**
      * A cylinder used for the updraft event
      */
    var cylinder: Mesh = js.native
  }
  object PhysicsUpdraftEventData {
    
    @scala.inline
    def apply(cylinder: Mesh): PhysicsUpdraftEventData = {
      val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsUpdraftEventData]
    }
    
    @scala.inline
    implicit class PhysicsUpdraftEventDataMutableBuilder[Self <: PhysicsUpdraftEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a physics vortex event
    */
  @js.native
  trait PhysicsVortexEvent extends StObject {
    
    var _cylinder: js.Any = js.native
    
    var _cylinderPosition: js.Any = js.native
    
    var _dataFetched: js.Any = js.native
    
    var _intersectsWithCylinder: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _origin: js.Any = js.native
    
    var _originTop: js.Any = js.native
    
    var _physicsEngine: js.Any = js.native
    
    /*** Helpers ***/
    var _prepareCylinder: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _tick: js.Any = js.native
    
    var _tickCallback: js.Any = js.native
    
    /**
      * Disables the cortex.
      */
    def disable(): Unit = js.native
    
    /**
      * Disposes the sphere.
      * @param force
      */
    def dispose(): Unit = js.native
    def dispose(force: Boolean): Unit = js.native
    
    /**
      * Enables the vortex.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the data related to the vortex event (cylinder).
      * @returns The physics vortex event data
      */
    def getData(): PhysicsVortexEventData = js.native
    
    var getImpostorHitData: js.Any = js.native
  }
  
  @js.native
  trait PhysicsVortexEventData extends StObject {
    
    /**
      * A cylinder used for the vortex event
      */
    var cylinder: Mesh = js.native
  }
  object PhysicsVortexEventData {
    
    @scala.inline
    def apply(cylinder: Mesh): PhysicsVortexEventData = {
      val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsVortexEventData]
    }
    
    @scala.inline
    implicit class PhysicsVortexEventDataMutableBuilder[Self <: PhysicsVortexEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCylinder(value: Mesh): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    }
  }
}
