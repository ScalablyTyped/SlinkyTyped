package typingsSlinky.famous

import typingsSlinky.famous.mathMod.Mat33
import typingsSlinky.famous.mathMod.Quaternion
import typingsSlinky.famous.mathMod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsMod {
  
  @JSImport("famous/physics", "Angle")
  @js.native
  class Angle protected () extends Constraint {
    def this(a: Particle, b: Particle) = this()
    def this(a: Particle, b: Particle, options: js.Any) = this()
  }
  
  @JSImport("famous/physics", "Box")
  @js.native
  class Box () extends ConvexBody {
    def this(options: js.Any) = this()
  }
  
  @JSImport("famous/physics", "Constraint")
  @js.native
  class Constraint () extends StObject
  
  @JSImport("famous/physics", "ConvexBody")
  @js.native
  class ConvexBody () extends Particle {
    def this(options: IParticleOptions) = this()
  }
  
  @JSImport("famous/physics", "Drag")
  @js.native
  class Drag () extends Force {
    def this(targets: js.Any) = this()
    def this(targets: js.Array[_]) = this()
    def this(targets: js.UndefOr[scala.Nothing], options: IDragOptions) = this()
    def this(targets: js.Any, options: IDragOptions) = this()
    def this(targets: js.Array[_], options: IDragOptions) = this()
    
    def init(): Unit = js.native
    
    var max: Double = js.native
    
    var strength: Double = js.native
    
    def `type`(v: Double): Double = js.native
  }
  /* static members */
  object Drag {
    
    @JSImport("famous/physics", "Drag.LINEAR")
    @js.native
    def LINEAR(v: Double): Double = js.native
    
    @JSImport("famous/physics", "Drag.QUADRATIC")
    @js.native
    def QUADRATIC(v: Double): Double = js.native
  }
  
  @JSImport("famous/physics", "Force")
  @js.native
  class Force () extends StObject {
    def this(targets: js.Any) = this()
    def this(targets: js.Array[_]) = this()
    def this(targets: js.UndefOr[scala.Nothing], options: IForceOptions) = this()
    def this(targets: js.Any, options: IForceOptions) = this()
    def this(targets: js.Array[_], options: IForceOptions) = this()
    
    def addTarget(target: js.Any): Unit = js.native
    
    def init(options: js.Any): Unit = js.native
    
    def removeTarget(target: js.Any): Unit = js.native
    
    def setOptions(options: js.Any): Unit = js.native
    
    var targets: js.Array[_] = js.native
    
    def update(): Unit = js.native
    def update(time: js.UndefOr[scala.Nothing], dt: Double): Unit = js.native
    def update(time: Double): Unit = js.native
    def update(time: Double, dt: Double): Unit = js.native
  }
  
  @JSImport("famous/physics", "Particle")
  @js.native
  class Particle () extends StObject {
    def this(options: IParticleOptions) = this()
    
    var angularMomentum: Vec3 = js.native
    
    var angularVelocity: Vec3 = js.native
    
    def applyAngularImpulse(angularImpulse: Vec3): Particle = js.native
    
    def applyForce(force: Vec3): Particle = js.native
    
    def applyImpulse(impulse: Vec3): Particle = js.native
    
    def applyTorque(torque: Vec3): Particle = js.native
    
    var collisionGroup: Double = js.native
    
    var collisionMask: Double = js.native
    
    var force: Vec3 = js.native
    
    var friction: Double = js.native
    
    def getAngularMomentum(): Vec3 = js.native
    
    def getAngularVelocity(): Vec3 = js.native
    
    def getForce(): Vec3 = js.native
    
    def getInverseMass(): Double = js.native
    
    def getMass(): Double = js.native
    
    def getMomentum(): Vec3 = js.native
    
    def getOrientation(): Quaternion = js.native
    
    def getPosition(): Vec3 = js.native
    
    def getRestrictions(): js.Array[String] = js.native
    
    def getTorque(): Vec3 = js.native
    
    def getVelocity(): Vec3 = js.native
    
    var inverseInertia: Mat33 = js.native
    
    var inverseMass: Double = js.native
    
    var localInertia: Mat33 = js.native
    
    var localInveseInertia: Mat33 = js.native
    
    var mass: Double = js.native
    
    var momentum: Vec3 = js.native
    
    def off(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
    
    def on(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
    
    var orientation: Quaternion = js.native
    
    var position: Vec3 = js.native
    
    var restitution: Double = js.native
    
    var restrictions: Double = js.native
    
    def setAngularMomentum(x: Double, y: Double, z: Double): Particle = js.native
    
    def setAngularVelocity(x: Double, y: Double, z: Double): Particle = js.native
    
    def setForce(x: Double, y: Double, z: Double): Particle = js.native
    
    def setMass(mass: Double): Particle = js.native
    
    def setMomentum(x: Double, y: Double, z: Double): Particle = js.native
    
    def setOrientation(w: Double, x: Double, y: Double, z: Double): Particle = js.native
    
    def setPosition(x: Double, y: Double, z: Double): Particle = js.native
    
    def setRestrictions(transRestrictions: String, rotRestrictions: String): Particle = js.native
    
    def setTorque(x: Double, y: Double, z: Double): Particle = js.native
    
    def setVelocity(x: Double, y: Double, z: Double): Particle = js.native
    
    var size: js.Array[Double] = js.native
    
    def support(): Vec3 = js.native
    
    var torque: Vec3 = js.native
    
    def trigger(key: String, payload: js.Any): Unit = js.native
    
    var `type`: Double = js.native
    
    def updateInertia(): Particle = js.native
    
    def updateLocalInertia(): Particle = js.native
    
    def updateShape(): Unit = js.native
    
    var velocity: Vec3 = js.native
  }
  
  @JSImport("famous/physics", "PhysicsEngine")
  @js.native
  class PhysicsEngine () extends StObject {
    
    def add(args: js.Any*): PhysicsEngine = js.native
    
    def addBody(body: js.Any): Unit = js.native
    
    def addConstraint(body: js.Any): Unit = js.native
    
    def addForce(body: js.Any): Unit = js.native
    
    def getTransform(body: js.Any): IPhysicsTransform = js.native
    
    def off(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
    
    def on(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
    
    def remove(args: js.Any*): PhysicsEngine = js.native
    
    def removeBody(body: js.Any): Unit = js.native
    
    def removeConstraint(body: js.Any): Unit = js.native
    
    def removeForce(body: js.Any): Unit = js.native
    
    def setOrientation(w: Double, x: Double, y: Double, z: Double): Unit = js.native
    
    def setOrigin(x: Double, y: Double, z: Double): Unit = js.native
    
    def trigger(key: String, payload: js.Any): Unit = js.native
    
    def update(time: Double): Unit = js.native
  }
  
  @JSImport("famous/physics", "RotationalSpring")
  @js.native
  class RotationalSpring () extends Force {
    def this(source: Particle) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle]) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: Particle) = this()
    def this(source: Particle, targets: js.Array[Particle]) = this()
    def this(source: Particle, targets: Particle) = this()
    def this(
      source: js.UndefOr[scala.Nothing],
      targets: js.UndefOr[scala.Nothing],
      options: IRotationalSpringOptions
    ) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: Particle, options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: js.UndefOr[scala.Nothing], options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: Particle, options: IRotationalSpringOptions) = this()
    
    var anchor: Vec3 = js.native
    
    var damping: Double = js.native
    
    var dampingRatio: Double = js.native
    
    var max: Double = js.native
    
    var period: Double = js.native
    
    var stiffness: Double = js.native
  }
  
  @JSImport("famous/physics", "Spring")
  @js.native
  class Spring () extends Force {
    def this(source: Particle) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle]) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: Particle) = this()
    def this(source: Particle, targets: js.Array[Particle]) = this()
    def this(source: Particle, targets: Particle) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: js.UndefOr[scala.Nothing], options: ISpringOptions) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle], options: ISpringOptions) = this()
    def this(source: js.UndefOr[scala.Nothing], targets: Particle, options: ISpringOptions) = this()
    def this(source: Particle, targets: js.UndefOr[scala.Nothing], options: ISpringOptions) = this()
    def this(source: Particle, targets: js.Array[Particle], options: ISpringOptions) = this()
    def this(source: Particle, targets: Particle, options: ISpringOptions) = this()
    
    var anchor: Vec3 = js.native
    
    var damping: Double = js.native
    
    var dampingRatio: Double = js.native
    
    def init(): Unit = js.native
    def init(options: ISpringOptions): Unit = js.native
    
    var length: Double = js.native
    
    var maxLength: Double = js.native
    
    var period: Double = js.native
    
    var stiffness: Double = js.native
    
    def `type`(dist: js.Any, rMax: js.Any): Double = js.native
  }
  /* static members */
  object Spring {
    
    @JSImport("famous/physics", "Spring.FENE")
    @js.native
    def FENE(dist: js.Any, rMax: js.Any): Double = js.native
    
    @JSImport("famous/physics", "Spring.HOOKE")
    @js.native
    def HOOKE(dist: js.Any, rMax: js.Any): Double = js.native
  }
  
  @JSImport("famous/physics", "Wall")
  @js.native
  class Wall protected () extends Particle {
    def this(options: IWallOptions) = this()
    
    var invNormal: Vec3 = js.native
    
    var normal: Vec3 = js.native
  }
  
  @js.native
  trait IDragOptions extends IForceOptions {
    
    var max: js.UndefOr[Double] = js.native
    
    var strength: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.native
  }
  object IDragOptions {
    
    @scala.inline
    def apply(): IDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragOptions]
    }
    
    @scala.inline
    implicit class IDragOptionsMutableBuilder[Self <: IDragOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
      
      @scala.inline
      def setType(value: /* v */ Double => Double): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IForceOptions extends StObject {
    
    var targets: js.UndefOr[js.Array[_]] = js.native
  }
  object IForceOptions {
    
    @scala.inline
    def apply(): IForceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IForceOptions]
    }
    
    @scala.inline
    implicit class IForceOptionsMutableBuilder[Self <: IForceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargets(value: js.Array[_]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: js.Any*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IParticleOptions extends StObject {
    
    var collisionGroup: js.UndefOr[Double] = js.native
    
    var collisionMask: js.UndefOr[Double] = js.native
    
    var friction: js.UndefOr[Double] = js.native
    
    var mass: js.UndefOr[Double] = js.native
    
    var orientation: js.UndefOr[Quaternion] = js.native
    
    var position: js.UndefOr[Vec3] = js.native
    
    var restitution: js.UndefOr[Double] = js.native
    
    var restrictions: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[js.Array[Double]] = js.native
    
    var velocity: js.UndefOr[Double] = js.native
  }
  object IParticleOptions {
    
    @scala.inline
    def apply(): IParticleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParticleOptions]
    }
    
    @scala.inline
    implicit class IParticleOptionsMutableBuilder[Self <: IParticleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollisionGroup(value: Double): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionGroupUndefined: Self = StObject.set(x, "collisionGroup", js.undefined)
      
      @scala.inline
      def setCollisionMask(value: Double): Self = StObject.set(x, "collisionMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionMaskUndefined: Self = StObject.set(x, "collisionMask", js.undefined)
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      @scala.inline
      def setOrientation(value: Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      @scala.inline
      def setRestrictions(value: Double): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
      
      @scala.inline
      def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  @js.native
  trait IPhysicsTransform extends StObject {
    
    var position: js.Array[Double] = js.native
    
    var rotation: js.Array[Double] = js.native
  }
  object IPhysicsTransform {
    
    @scala.inline
    def apply(position: js.Array[Double], rotation: js.Array[Double]): IPhysicsTransform = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPhysicsTransform]
    }
    
    @scala.inline
    implicit class IPhysicsTransformMutableBuilder[Self <: IPhysicsTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setRotation(value: js.Array[Double]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationVarargs(value: Double*): Self = StObject.set(x, "rotation", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IRotationalSpringOptions extends IForceOptions {
    
    var anchor: js.UndefOr[Quaternion] = js.native
    
    var damping: js.UndefOr[Double] = js.native
    
    var dampingRatio: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var period: js.UndefOr[Double] = js.native
    
    var stiffness: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, Double]] = js.native
  }
  object IRotationalSpringOptions {
    
    @scala.inline
    def apply(): IRotationalSpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRotationalSpringOptions]
    }
    
    @scala.inline
    implicit class IRotationalSpringOptionsMutableBuilder[Self <: IRotationalSpringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Quaternion): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingRatioUndefined: Self = StObject.set(x, "dampingRatio", js.undefined)
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      @scala.inline
      def setType(value: (/* dist */ js.Any, /* rMax */ js.Any) => Double): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ISpringOptions extends IForceOptions {
    
    var anchor: js.UndefOr[Vec3] = js.native
    
    var damping: js.UndefOr[Double] = js.native
    
    var dampingRatio: js.UndefOr[Double] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var period: js.UndefOr[Double] = js.native
    
    var stiffness: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, Double]] = js.native
  }
  object ISpringOptions {
    
    @scala.inline
    def apply(): ISpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpringOptions]
    }
    
    @scala.inline
    implicit class ISpringOptionsMutableBuilder[Self <: ISpringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Vec3): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingRatioUndefined: Self = StObject.set(x, "dampingRatio", js.undefined)
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      @scala.inline
      def setType(value: (/* dist */ js.Any, /* rMax */ js.Any) => Double): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IWallOptions extends IParticleOptions {
    
    var direction: js.UndefOr[Double] = js.native
  }
  object IWallOptions {
    
    @scala.inline
    def apply(): IWallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallOptions]
    }
    
    @scala.inline
    implicit class IWallOptionsMutableBuilder[Self <: IWallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
