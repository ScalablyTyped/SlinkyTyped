package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.GameObjects.Components.BlendMode
import typingsSlinky.phaser.Phaser.GameObjects.Components.Depth
import typingsSlinky.phaser.Phaser.GameObjects.Components.Mask
import typingsSlinky.phaser.Phaser.GameObjects.Components.Pipeline
import typingsSlinky.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsSlinky.phaser.Phaser.GameObjects.Components.Transform
import typingsSlinky.phaser.Phaser.GameObjects.Components.Visible
import typingsSlinky.phaser.Phaser.GameObjects.Particles.Zones.DeathZone
import typingsSlinky.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone
import typingsSlinky.phaser.Phaser.GameObjects.Particles.Zones.RandomZone
import typingsSlinky.phaser.Phaser.Geom.Point
import typingsSlinky.phaser.Phaser.Math.Vector2
import typingsSlinky.phaser.Phaser.Structs.List
import typingsSlinky.phaser.Phaser.Textures.Frame
import typingsSlinky.phaser.Phaser.Textures.Texture
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitType
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateType
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.GravityWellConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleDeathCallback
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterBounds
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterBoundsAlt
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterCallback
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterDeathZoneConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterFrameConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import typingsSlinky.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Particles {
  
  /**
    * A Particle Emitter property.
    * 
    * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
    */
  @js.native
  trait EmitterOp extends StObject {
    
    /**
      * The step counter for stepped easing, per emit.
      */
    var counter: Double = js.native
    
    /**
      * The returned value sets what the property will be at the START of the particles life, on emit.
      * @param particle The particle.
      * @param key The name of the property.
      * @param value The current value of the property.
      */
    def defaultEmit(particle: Particle, key: String): Double = js.native
    def defaultEmit(particle: Particle, key: String, value: Double): Double = js.native
    
    /**
      * The returned value updates the property for the duration of the particles life.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The T value (between 0 and 1)
      * @param value The current value of the property.
      */
    def defaultUpdate(particle: Particle, key: String, t: Double, value: Double): Double = js.native
    
    /**
      * The default value of this property.
      */
    var defaultValue: Double = js.native
    
    /**
      * The easing function to use for updating this property.
      */
    var ease: js.Function = js.native
    
    /**
      * An `onUpdate` callback that returns an eased value between the
      * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
      * range.
      * @param particle The particle.
      * @param key The name of the property.
      * @param t The T value (between 0 and 1)
      */
    def easeValueUpdate(particle: Particle, key: String, t: Double): Double = js.native
    
    /**
      * An `onEmit` callback for an eased property.
      * 
      * It prepares the particle for easing by {@link Phaser.GameObjects.Particles.EmitterOp#easeValueUpdate}.
      * @param particle The particle.
      * @param key The name of the property.
      */
    def easedValueEmit(particle: Particle, key: String): Double = js.native
    
    /**
      * Whether this property can only be modified when a Particle is emitted.
      * 
      * Set to `true` to allow only {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} callbacks to be set and
      * affect this property.
      * 
      * Set to `false` to allow both {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks to be set and affect this property.
      */
    var emitOnly: Boolean = js.native
    
    /**
      * The end value for this property to ease between.
      */
    var end: Double = js.native
    
    /**
      * Check whether an object has the given property.
      * @param object The object to check.
      * @param key The key of the property to look for in the object.
      */
    def has(`object`: js.Object, key: String): Boolean = js.native
    
    /**
      * Check whether an object has both of the given properties.
      * @param object The object to check.
      * @param key1 The key of the first property to check the object for.
      * @param key2 The key of the second property to check the object for.
      */
    def hasBoth(`object`: js.Object, key1: String, key2: String): Boolean = js.native
    
    /**
      * Check whether an object has at least one of the given properties.
      * @param object The object to check.
      * @param key1 The key of the first property to check the object for.
      * @param key2 The key of the second property to check the object for.
      */
    def hasEither(`object`: js.Object, key1: String, key2: String): Boolean = js.native
    
    /**
      * Load the property from a Particle Emitter configuration object.
      * 
      * Optionally accepts a new property key to use, replacing the current one.
      * @param config Settings for the Particle Emitter that owns this property.
      * @param newKey The new key to use for this property, if any.
      */
    def loadConfig(): Unit = js.native
    def loadConfig(config: js.UndefOr[scala.Nothing], newKey: String): Unit = js.native
    def loadConfig(config: ParticleEmitterConfig): Unit = js.native
    def loadConfig(config: ParticleEmitterConfig, newKey: String): Unit = js.native
    
    /**
      * Change the current value of the property and update its callback methods.
      * @param value The value of the property.
      */
    def onChange(value: Double): this.type = js.native
    
    /**
      * The callback to run for Particles when they are emitted from the Particle Emitter.
      */
    def onEmit(particle: Particle, key: String, value: Double): Unit = js.native
    /**
      * The callback to run for Particles when they are emitted from the Particle Emitter.
      */
    @JSName("onEmit")
    var onEmit_Original: EmitterOpOnEmitCallback = js.native
    
    /**
      * The callback to run for Particles when they are updated.
      */
    def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit = js.native
    /**
      * The callback to run for Particles when they are updated.
      */
    @JSName("onUpdate")
    var onUpdate_Original: EmitterOpOnUpdateCallback = js.native
    
    /**
      * The name of this property.
      */
    var propertyKey: String = js.native
    
    /**
      * The value of this property.
      */
    var propertyValue: Double = js.native
    
    /**
      * An `onEmit` callback that returns a value between the {@link Phaser.GameObjects.Particles.EmitterOp#start} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#end} range.
      * @param particle The particle.
      * @param key The key of the property.
      */
    def randomRangedValueEmit(particle: Particle, key: String): Double = js.native
    
    /**
      * An `onEmit` callback that returns a random value from the current value array.
      */
    def randomStaticValueEmit(): Double = js.native
    
    /**
      * Update the {@link Phaser.GameObjects.Particles.EmitterOp#onEmit} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#onUpdate} callbacks based on the type of the current
      * {@link Phaser.GameObjects.Particles.EmitterOp#propertyValue}.
      */
    def setMethods(): this.type = js.native
    
    /**
      * The start value for this property to ease between.
      */
    var start: Double = js.native
    
    /**
      * An `onEmit` callback that returns the current value of the property.
      */
    def staticValueEmit(): Double = js.native
    
    /**
      * An `onUpdate` callback that returns the current value of the property.
      */
    def staticValueUpdate(): Double = js.native
    
    /**
      * An `onEmit` callback that returns a stepped value between the
      * {@link Phaser.GameObjects.Particles.EmitterOp#start} and {@link Phaser.GameObjects.Particles.EmitterOp#end}
      * range.
      */
    def steppedEmit(): Double = js.native
    
    /**
      * The number of steps for stepped easing between {@link Phaser.GameObjects.Particles.EmitterOp#start} and
      * {@link Phaser.GameObjects.Particles.EmitterOp#end} values, per emit.
      */
    var steps: Double = js.native
    
    /**
      * Build a JSON representation of this Particle Emitter property.
      */
    def toJSON(): js.Object = js.native
  }
  
  /**
    * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
    * 
    * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
    * 
    * This simulates the effect of gravity over large distances (as between planets, for example).
    */
  @js.native
  trait GravityWell extends StObject {
    
    /**
      * The active state of the Gravity Well. An inactive Gravity Well will not influence any particles.
      */
    var active: Boolean = js.native
    
    /**
      * The minimum distance for which the gravity force is calculated.
      */
    var epsilon: Double = js.native
    
    /**
      * The strength of the gravity force - larger numbers produce a stronger force.
      */
    var power: Double = js.native
    
    /**
      * Takes a Particle and updates it based on the properties of this Gravity Well.
      * @param particle The Particle to update.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      */
    def update(particle: Particle, delta: Double, step: Double): Unit = js.native
    
    /**
      * The x coordinate of the Gravity Well, in world space.
      */
    var x: Double = js.native
    
    /**
      * The y coordinate of the Gravity Well, in world space.
      */
    var y: Double = js.native
  }
  object GravityWell {
    
    @scala.inline
    def apply(
      active: Boolean,
      epsilon: Double,
      power: Double,
      update: (Particle, Double, Double) => Unit,
      x: Double,
      y: Double
    ): GravityWell = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], epsilon = epsilon.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GravityWell]
    }
    
    @scala.inline
    implicit class GravityWellMutableBuilder[Self <: GravityWell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Particle, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
    * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
    */
  @js.native
  trait Particle extends StObject {
    
    /**
      * The x acceleration of this Particle.
      */
    var accelerationX: Double = js.native
    
    /**
      * The y acceleration of this Particle.
      */
    var accelerationY: Double = js.native
    
    /**
      * The alpha value of this Particle.
      */
    var alpha: Double = js.native
    
    /**
      * The angle of this Particle in degrees.
      */
    var angle: Double = js.native
    
    /**
      * The bounciness, or restitution, of this Particle.
      */
    var bounce: Double = js.native
    
    /**
      * Checks if this Particle is still within the bounds defined by the given Emitter.
      * 
      * If not, and depending on the Emitter collision flags, the Particle may either stop or rebound.
      * @param emitter The Emitter to check the bounds against.
      */
    def checkBounds(emitter: ParticleEmitter): Unit = js.native
    
    /**
      * An internal method that calculates the velocity of the Particle.
      * @param emitter The Emitter that is updating this Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors Particle processors (gravity wells).
      */
    def computeVelocity(emitter: ParticleEmitter, delta: Double, step: Double, processors: js.Array[_]): Unit = js.native
    
    /**
      * The data used by the ease equation.
      */
    var data: js.Object = js.native
    
    /**
      * The delay applied to this Particle upon emission, in ms.
      */
    var delayCurrent: Double = js.native
    
    /**
      * The Emitter to which this Particle belongs.
      * 
      * A Particle can only belong to a single Emitter and is created, updated and destroyed via it.
      */
    var emitter: ParticleEmitter = js.native
    
    /**
      * Starts this Particle from the given coordinates.
      * @param x The x coordinate to launch this Particle from.
      * @param y The y coordinate to launch this Particle from.
      */
    def fire(x: Double, y: Double): Unit = js.native
    
    /**
      * The texture frame used to render this Particle.
      */
    var frame: Frame = js.native
    
    /**
      * Checks to see if this Particle is alive and updating.
      */
    def isAlive(): Boolean = js.native
    
    /**
      * The lifespan of this Particle in ms.
      */
    var life: Double = js.native
    
    /**
      * The current life of this Particle in ms.
      */
    var lifeCurrent: Double = js.native
    
    /**
      * The normalized lifespan T value, where 0 is the start and 1 is the end.
      */
    var lifeT: Double = js.native
    
    /**
      * The maximum horizontal velocity this Particle can travel at.
      */
    var maxVelocityX: Double = js.native
    
    /**
      * The maximum vertical velocity this Particle can travel at.
      */
    var maxVelocityY: Double = js.native
    
    /**
      * Resets the position of this particle back to zero.
      */
    def resetPosition(): Unit = js.native
    
    /**
      * The angle of this Particle in radians.
      */
    var rotation: Double = js.native
    
    /**
      * The horizontal scale of this Particle.
      */
    var scaleX: Double = js.native
    
    /**
      * The vertical scale of this Particle.
      */
    var scaleY: Double = js.native
    
    /**
      * The tint applied to this Particle.
      */
    var tint: integer = js.native
    
    /**
      * The main update method for this Particle.
      * 
      * Updates its life values, computes the velocity and repositions the Particle.
      * @param delta The delta time in ms.
      * @param step The delta value divided by 1000.
      * @param processors An optional array of update processors.
      */
    def update(delta: Double, step: Double, processors: js.Array[_]): Boolean = js.native
    
    /**
      * The x velocity of this Particle.
      */
    var velocityX: Double = js.native
    
    /**
      * The y velocity of this Particle.
      */
    var velocityY: Double = js.native
    
    /**
      * The x coordinate of this Particle.
      */
    var x: Double = js.native
    
    /**
      * The y coordinate of this Particle.
      */
    var y: Double = js.native
  }
  object Particle {
    
    @scala.inline
    def apply(
      accelerationX: Double,
      accelerationY: Double,
      alpha: Double,
      angle: Double,
      bounce: Double,
      checkBounds: ParticleEmitter => Unit,
      computeVelocity: (ParticleEmitter, Double, Double, js.Array[_]) => Unit,
      data: js.Object,
      delayCurrent: Double,
      emitter: ParticleEmitter,
      fire: (Double, Double) => Unit,
      frame: Frame,
      isAlive: () => Boolean,
      life: Double,
      lifeCurrent: Double,
      lifeT: Double,
      maxVelocityX: Double,
      maxVelocityY: Double,
      resetPosition: () => Unit,
      rotation: Double,
      scaleX: Double,
      scaleY: Double,
      tint: integer,
      update: (Double, Double, js.Array[_]) => Boolean,
      velocityX: Double,
      velocityY: Double,
      x: Double,
      y: Double
    ): Particle = {
      val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], checkBounds = js.Any.fromFunction1(checkBounds), computeVelocity = js.Any.fromFunction4(computeVelocity), data = data.asInstanceOf[js.Any], delayCurrent = delayCurrent.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], fire = js.Any.fromFunction2(fire), frame = frame.asInstanceOf[js.Any], isAlive = js.Any.fromFunction0(isAlive), life = life.asInstanceOf[js.Any], lifeCurrent = lifeCurrent.asInstanceOf[js.Any], lifeT = lifeT.asInstanceOf[js.Any], maxVelocityX = maxVelocityX.asInstanceOf[js.Any], maxVelocityY = maxVelocityY.asInstanceOf[js.Any], resetPosition = js.Any.fromFunction0(resetPosition), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Particle]
    }
    
    @scala.inline
    implicit class ParticleMutableBuilder[Self <: Particle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBounds(value: ParticleEmitter => Unit): Self = StObject.set(x, "checkBounds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeVelocity(value: (ParticleEmitter, Double, Double, js.Array[_]) => Unit): Self = StObject.set(x, "computeVelocity", js.Any.fromFunction4(value))
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayCurrent(value: Double): Self = StObject.set(x, "delayCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitter(value: ParticleEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFire(value: (Double, Double) => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlive(value: () => Boolean): Self = StObject.set(x, "isAlive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifeCurrent(value: Double): Self = StObject.set(x, "lifeCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifeT(value: Double): Self = StObject.set(x, "lifeT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVelocityX(value: Double): Self = StObject.set(x, "maxVelocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVelocityY(value: Double): Self = StObject.set(x, "maxVelocityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetPosition(value: () => Unit): Self = StObject.set(x, "resetPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTint(value: integer): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Double, Double, js.Array[_]) => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A particle emitter represents a single particle stream.
    * It controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles} and is controlled by a {@link Phaser.GameObjects.Particles.ParticleEmitterManager Particle Emitter Manager}.
    */
  @js.native
  trait ParticleEmitter
    extends BlendMode
       with Mask
       with ScrollFactor
       with Visible {
    
    /**
      * Whether accelerationX and accelerationY are non-zero. Set automatically during configuration.
      */
    var acceleration: Boolean = js.native
    
    /**
      * Horizontal acceleration applied to emitted particles, in pixels per second squared.
      */
    var accelerationX: EmitterOp = js.native
    
    /**
      * Vertical acceleration applied to emitted particles, in pixels per second squared.
      */
    var accelerationY: EmitterOp = js.native
    
    /**
      * Whether this emitter updates itself and its particles.
      * 
      * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#pause}
      * and {@link Phaser.GameObjects.Particles.ParticleEmitter#resume}.
      */
    var active: Boolean = js.native
    
    /**
      * The alpha (transparency) of emitted particles.
      */
    var alpha: EmitterOp = js.native
    
    /**
      * The angle of the initial velocity of emitted particles, in degrees.
      */
    var angle: EmitterOp = js.native
    
    /**
      * Whether this emitter is at its limit (if set).
      */
    def atLimit(): Boolean = js.native
    
    /**
      * The blend mode of this emitter's particles.
      */
    @JSName("blendMode")
    var blendMode_ParticleEmitter: integer = js.native
    
    /**
      * Whether particles will rebound when they meet the emitter bounds.
      */
    var bounce: EmitterOp = js.native
    
    /**
      * A rectangular boundary constraining particle movement.
      */
    var bounds: typingsSlinky.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * Whether particles interact with the bottom edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    var collideBottom: Boolean = js.native
    
    /**
      * Whether particles interact with the left edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    var collideLeft: Boolean = js.native
    
    /**
      * Whether particles interact with the right edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    var collideRight: Boolean = js.native
    
    /**
      * Whether particles interact with the top edge of the emitter {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds}.
      */
    var collideTop: Boolean = js.native
    
    /**
      * Names of simple configuration properties.
      */
    var configFastMap: js.Object = js.native
    
    /**
      * Names of complex configuration properties.
      */
    var configOpMap: js.Object = js.native
    
    /**
      * The current texture frame, as an index of {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
      */
    var currentFrame: integer = js.native
    
    /**
      * A function to call when a particle dies.
      */
    def deathCallback(particle: Particle): Unit = js.native
    
    /**
      * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
      */
    var deathCallbackScope: js.Any = js.native
    
    /**
      * A function to call when a particle dies.
      */
    @JSName("deathCallback")
    var deathCallback_Original: ParticleDeathCallback = js.native
    
    /**
      * An object describing a shape that deactivates particles when they interact with it.
      */
    var deathZone: DeathZone = js.native
    
    /**
      * The default texture frame assigned to particles.
      */
    var defaultFrame: Frame = js.native
    
    /**
      * How many ms to wait after emission before the particles start updating.
      */
    var delay: EmitterOp = js.native
    
    /**
      * Sorts active particles with {@link Phaser.GameObjects.Particles.ParticleEmitter#depthSortCallback}.
      */
    def depthSort(): this.type = js.native
    
    /**
      * Calculates the difference of two particles, for sorting them by depth.
      * @param a The first particle.
      * @param b The second particle.
      */
    def depthSortCallback(a: js.Object, b: js.Object): integer = js.native
    
    /**
      * A function to call when a particle is emitted.
      */
    def emitCallback(particle: Particle, emitter: ParticleEmitter): Unit = js.native
    
    /**
      * The calling context for {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
      */
    var emitCallbackScope: js.Any = js.native
    
    /**
      * A function to call when a particle is emitted.
      */
    @JSName("emitCallback")
    var emitCallback_Original: ParticleEmitterCallback = js.native
    
    /**
      * Emits particles at a given position (or the emitter's current position).
      * @param count The number of Particles to emit. Default this.quantity.
      * @param x The x coordinate to emit the Particles from. Default this.x.
      * @param y The y coordinate to emit the Particles from. Default this.x.
      */
    def emitParticle(): Particle = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): Particle = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: Double): Particle = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: Double, y: Double): Particle = js.native
    def emitParticle(count: integer): Particle = js.native
    def emitParticle(count: integer, x: js.UndefOr[scala.Nothing], y: Double): Particle = js.native
    def emitParticle(count: integer, x: Double): Particle = js.native
    def emitParticle(count: integer, x: Double, y: Double): Particle = js.native
    
    /**
      * Emits particles at a given position (or the emitter's current position).
      * @param x The x coordinate to emit the Particles from. Default this.x.
      * @param y The y coordinate to emit the Particles from. Default this.x.
      * @param count The number of Particles to emit. Default this.quantity.
      */
    def emitParticleAt(): Particle = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], count: integer): Particle = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double): Particle = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double, count: integer): Particle = js.native
    def emitParticleAt(x: Double): Particle = js.native
    def emitParticleAt(x: Double, y: js.UndefOr[scala.Nothing], count: integer): Particle = js.native
    def emitParticleAt(x: Double, y: Double): Particle = js.native
    def emitParticleAt(x: Double, y: Double, count: integer): Particle = js.native
    
    /**
      * An object describing a shape to emit particles from.
      */
    var emitZone: EdgeZone | RandomZone = js.native
    
    /**
      * Puts the emitter in explode mode (frequency = -1), stopping any current particle flow, and emits several particles all at once.
      * @param count The amount of Particles to emit.
      * @param x The x coordinate to emit the Particles from.
      * @param y The y coordinate to emit the Particles from.
      */
    def explode(count: integer, x: Double, y: Double): Particle = js.native
    
    /**
      * Puts the emitter in flow mode (frequency >= 0) and starts (or restarts) a particle flow.
      * 
      * To resume a flow at the current frequency and quantity, use {@link Phaser.GameObjects.Particles.ParticleEmitter#start} instead.
      * @param frequency The time interval (>= 0) of each flow cycle, in ms.
      * @param count The number of particles to emit at each flow cycle. Default 1.
      */
    def flow(frequency: Double): this.type = js.native
    def flow(frequency: Double, count: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * A Game Object whose position is used as the particle origin.
      */
    var follow: GameObject = js.native
    
    /**
      * The offset of the particle origin from the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target.
      */
    var followOffset: Vector2 = js.native
    
    /**
      * Calls a function for each active particle in this emitter.
      * @param callback The function.
      * @param context The function's calling context.
      */
    def forEachAlive(callback: ParticleEmitterCallback, context: js.Any): this.type = js.native
    
    /**
      * Calls a function for each inactive particle in this emitter.
      * @param callback The function.
      * @param context The function's calling context.
      */
    def forEachDead(callback: ParticleEmitterCallback, context: js.Any): this.type = js.native
    
    /**
      * The number of consecutive particles that receive a single texture frame (per frame cycle).
      */
    var frameQuantity: integer = js.native
    
    /**
      * The texture frames assigned to particles.
      */
    var frames: js.Array[Frame] = js.native
    
    /**
      * For a flow emitter, the time interval (>= 0) between particle flow cycles in ms.
      * A value of 0 means there is one particle flow cycle for each logic update (the maximum flow frequency). This is the default setting.
      * For an exploding emitter, this value will be -1.
      * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} also puts the emitter in flow mode (frequency >= 0).
      * Calling {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} also puts the emitter in explode mode (frequency = -1).
      */
    var frequency: Double = js.native
    
    /**
      * Merges configuration settings into the emitter's current settings.
      * @param config Settings for this emitter.
      */
    def fromJSON(config: ParticleEmitterConfig): this.type = js.native
    
    /**
      * Gets the number of active (in-use) particles in this emitter.
      */
    def getAliveParticleCount(): integer = js.native
    
    /**
      * Gets the number of inactive (available) particles in this emitter.
      */
    def getDeadParticleCount(): integer = js.native
    
    /**
      * Chooses a texture frame from {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
      */
    def getFrame(): Frame = js.native
    
    /**
      * Gets the total number of particles in this emitter.
      */
    def getParticleCount(): integer = js.native
    
    /**
      * Horizontal acceleration applied to emitted particles, in pixels per second squared.
      */
    var gravityX: Double = js.native
    
    /**
      * Vertical acceleration applied to emitted particles, in pixels per second squared.
      */
    var gravityY: Double = js.native
    
    /**
      * Deactivates every particle in this emitter.
      */
    def killAll(): this.type = js.native
    
    /**
      * The lifespan of emitted particles, in ms.
      */
    var lifespan: EmitterOp = js.native
    
    /**
      * The Emitter Manager this Emitter belongs to.
      */
    var manager: ParticleEmitterManager = js.native
    
    /**
      * Set to hard limit the amount of particle objects this emitter is allowed to create.
      * 0 means unlimited.
      */
    var maxParticles: integer = js.native
    
    /**
      * The maximum horizontal velocity of emitted particles, in pixels per second squared.
      */
    var maxVelocityX: EmitterOp = js.native
    
    /**
      * The maximum vertical velocity of emitted particles, in pixels per second squared.
      */
    var maxVelocityY: EmitterOp = js.native
    
    /**
      * Whether moveToX and moveToY are nonzero. Set automatically during configuration.
      */
    var moveTo: Boolean = js.native
    
    /**
      * The x-coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
      */
    var moveToX: EmitterOp = js.native
    
    /**
      * The y-coordinate emitted particles move toward, when {@link Phaser.GameObjects.Particles.ParticleEmitter#moveTo} is true.
      */
    var moveToY: EmitterOp = js.native
    
    /**
      * The name of this Particle Emitter.
      * 
      * Empty by default and never populated by Phaser, this is left for developers to use.
      */
    var name: String = js.native
    
    /**
      * Controls if the emitter is currently emitting a particle flow (when frequency >= 0).
      * Already alive particles will continue to update until they expire.
      * Controlled by {@link Phaser.GameObjects.Particles.ParticleEmitter#start} and {@link Phaser.GameObjects.Particles.ParticleEmitter#stop}.
      */
    var on: Boolean = js.native
    
    /**
      * Sets a function to call for each particle death.
      * @param callback The function.
      * @param context The function's calling context.
      */
    def onParticleDeath(callback: ParticleDeathCallback): this.type = js.native
    def onParticleDeath(callback: ParticleDeathCallback, context: js.Any): this.type = js.native
    
    /**
      * Sets a function to call for each newly emitted particle.
      * @param callback The function.
      * @param context The calling context.
      */
    def onParticleEmit(callback: ParticleEmitterCallback): this.type = js.native
    def onParticleEmit(callback: ParticleEmitterCallback, context: js.Any): this.type = js.native
    
    /**
      * Newly emitted particles are added to the top of the particle list, i.e. rendered above those already alive.
      * Set to false to send them to the back.
      */
    var particleBringToTop: Boolean = js.native
    
    /**
      * The Particle Class which will be emitted by this Emitter.
      */
    var particleClass: Particle = js.native
    
    /**
      * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Deactivates} the emitter.
      */
    def pause(): this.type = js.native
    
    /**
      * Updates this emitter and its particles.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time, in ms, elapsed since the last frame.
      */
    def preUpdate(time: integer, delta: Double): Unit = js.native
    
    /**
      * How many particles are emitted each time particles are emitted (one explosion or one flow cycle).
      */
    var quantity: EmitterOp = js.native
    
    /**
      * A radial emitter will emit particles in all directions between angle min and max,
      * using {@link Phaser.GameObjects.Particles.ParticleEmitter#speed} as the value. If set to false then this acts as a point Emitter.
      * A point emitter will emit particles only in the direction derived from the speedX and speedY values.
      */
    var radial: Boolean = js.native
    
    /**
      * Whether texture {@link Phaser.GameObjects.Particles.ParticleEmitter#frames} are selected at random.
      */
    var randomFrame: Boolean = js.native
    
    /**
      * Removes the emitter from its manager and the scene.
      */
    def remove(): this.type = js.native
    
    /**
      * Creates inactive particles and adds them to this emitter's pool.
      * @param particleCount The number of particles to create.
      */
    def reserve(particleCount: integer): this.type = js.native
    
    /**
      * {@link Phaser.GameObjects.Particles.ParticleEmitter#active Activates} the emitter.
      */
    def resume(): this.type = js.native
    
    /**
      * The rotation of emitted particles, in degrees.
      */
    var rotate: EmitterOp = js.native
    
    /**
      * The horizontal scale of emitted particles.
      */
    var scaleX: EmitterOp = js.native
    
    /**
      * The vertical scale of emitted particles.
      */
    var scaleY: EmitterOp = js.native
    
    /**
      * Sets the opacity of emitted particles.
      * @param value A value between 0 (transparent) and 1 (opaque).
      */
    def setAlpha(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
      * @param value The angle of the initial velocity of emitted particles.
      */
    def setAngle(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets or modifies a rectangular boundary constraining the particles.
      * 
      * To remove the boundary, set {@link Phaser.GameObjects.Particles.ParticleEmitter#bounds} to null.
      * @param x The x-coordinate of the left edge of the boundary, or an object representing a rectangle.
      * @param y The y-coordinate of the top edge of the boundary.
      * @param width The width of the boundary.
      * @param height The height of the boundary.
      */
    def setBounds(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def setBounds(x: ParticleEmitterBoundsAlt, y: Double, width: Double, height: Double): this.type = js.native
    def setBounds(x: ParticleEmitterBounds, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#deathZone}.
      * @param zoneConfig An object describing the zone, or `undefined` to remove any current death zone.
      */
    def setDeathZone(): this.type = js.native
    def setDeathZone(zoneConfig: ParticleEmitterDeathZoneConfig): this.type = js.native
    
    /**
      * Sets or removes the {@link Phaser.GameObjects.Particles.ParticleEmitter#emitZone}.
      * 
      * An {@link Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig EdgeZone} places particles on its edges. Its {@link Phaser.Types.GameObjects.Particles.EdgeZoneSource source} can be a Curve, Path, Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.EdgeZoneSourceCallback getPoints} method.
      * 
      * A {@link Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig RandomZone} places randomly within its interior. Its {@link RandomZoneSource source} can be a Circle, Ellipse, Line, Polygon, Rectangle, or Triangle; or any object with a suitable {@link Phaser.Types.GameObjects.Particles.RandomZoneSourceCallback getRandomPoint} method.
      * @param zoneConfig An object describing the zone, or `undefined` to remove any current emit zone.
      */
    def setEmitZone(): this.type = js.native
    def setEmitZone(zoneConfig: ParticleEmitterEdgeZoneConfig): this.type = js.native
    def setEmitZone(zoneConfig: ParticleEmitterRandomZoneConfig): this.type = js.native
    
    /**
      * Sets the angle of a {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle stream.
      * @param value The angle of the initial velocity of emitted particles.
      */
    def setEmitterAngle(value: EmitterOpOnEmitType): this.type = js.native
    
    def setFrame(frames: String): this.type = js.native
    def setFrame(frames: String, pickRandom: js.UndefOr[scala.Nothing], quantity: integer): this.type = js.native
    def setFrame(frames: String, pickRandom: Boolean): this.type = js.native
    def setFrame(frames: String, pickRandom: Boolean, quantity: integer): this.type = js.native
    /**
      * Sets a pattern for assigning texture frames to emitted particles.
      * @param frames One or more texture frames, or a configuration object.
      * @param pickRandom Whether frames should be assigned at random from `frames`. Default true.
      * @param quantity The number of consecutive particles that will receive each frame. Default 1.
      */
    def setFrame(frames: js.Array[_]): this.type = js.native
    def setFrame(frames: js.Array[_], pickRandom: js.UndefOr[scala.Nothing], quantity: integer): this.type = js.native
    def setFrame(frames: js.Array[_], pickRandom: Boolean): this.type = js.native
    def setFrame(frames: js.Array[_], pickRandom: Boolean, quantity: integer): this.type = js.native
    def setFrame(frames: ParticleEmitterFrameConfig): this.type = js.native
    def setFrame(frames: ParticleEmitterFrameConfig, pickRandom: js.UndefOr[scala.Nothing], quantity: integer): this.type = js.native
    def setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean): this.type = js.native
    def setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean, quantity: integer): this.type = js.native
    def setFrame(frames: integer): this.type = js.native
    def setFrame(frames: integer, pickRandom: js.UndefOr[scala.Nothing], quantity: integer): this.type = js.native
    def setFrame(frames: integer, pickRandom: Boolean): this.type = js.native
    def setFrame(frames: integer, pickRandom: Boolean, quantity: integer): this.type = js.native
    
    /**
      * Sets the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}
      * and {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
      * @param frequency The time interval (>= 0) of each flow cycle, in ms; or -1 to put the emitter in explosion mode.
      * @param quantity The number of particles to release at each flow cycle or explosion.
      */
    def setFrequency(frequency: Double): this.type = js.native
    def setFrequency(frequency: Double, quantity: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the gravity applied to emitted particles.
      * @param x Horizontal acceleration due to gravity, in pixels per second squared.
      * @param y Vertical acceleration due to gravity, in pixels per second squared.
      */
    def setGravity(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the horizontal gravity applied to emitted particles.
      * @param value Acceleration due to gravity, in pixels per second squared.
      */
    def setGravityX(value: Double): this.type = js.native
    
    /**
      * Sets the vertical gravity applied to emitted particles.
      * @param value Acceleration due to gravity, in pixels per second squared.
      */
    def setGravityY(value: Double): this.type = js.native
    
    /**
      * Sets the lifespan of newly emitted particles.
      * @param value The particle lifespan, in ms.
      */
    def setLifespan(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the position of the emitter's particle origin.
      * New particles will be emitted here.
      * @param x The x-coordinate of the particle origin.
      * @param y The y-coordinate of the particle origin.
      */
    def setPosition(x: EmitterOpOnEmitType, y: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the number of particles released at each flow cycle or explosion.
      * @param quantity The number of particles to release at each flow cycle or explosion.
      */
    def setQuantity(quantity: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#radial} particle movement on or off.
      * @param value Radial mode (true) or point mode (true). Default true.
      */
    def setRadial(): this.type = js.native
    def setRadial(value: Boolean): this.type = js.native
    
    /**
      * Sets the scale of emitted particles.
      * @param value The scale, relative to 1.
      */
    def setScale(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the horizontal scale of emitted particles.
      * @param value The scale, relative to 1.
      */
    def setScaleX(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the vertical scale of emitted particles.
      * @param value The scale, relative to 1.
      */
    def setScaleY(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * Sets the initial radial speed of emitted particles.
      * Changes the emitter to radial mode.
      * @param value The speed, in pixels per second.
      */
    def setSpeed(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the initial horizontal speed of emitted particles.
      * Changes the emitter to point mode.
      * @param value The speed, in pixels per second.
      */
    def setSpeedX(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the initial vertical speed of emitted particles.
      * Changes the emitter to point mode.
      * @param value The speed, in pixels per second.
      */
    def setSpeedY(value: EmitterOpOnEmitType): this.type = js.native
    
    /**
      * Sets the color tint of emitted particles.
      * @param value A value between 0 and 0xffffff.
      */
    def setTint(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): this.type = js.native
    
    /**
      * The initial horizontal speed of emitted particles, in pixels per second.
      */
    var speedX: EmitterOp = js.native
    
    /**
      * The initial vertical speed of emitted particles, in pixels per second.
      */
    var speedY: EmitterOp = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#on} the emitter and resets the flow counter.
      * 
      * If this emitter is in flow mode (frequency >= 0; the default), the particle flow will start (or restart).
      * 
      * If this emitter is in explode mode (frequency = -1), nothing will happen.
      * Use {@link Phaser.GameObjects.Particles.ParticleEmitter#explode} or {@link Phaser.GameObjects.Particles.ParticleEmitter#flow} instead.
      */
    def start(): this.type = js.native
    
    /**
      * Continuously moves the particle origin to follow a Game Object's position.
      * @param target The Game Object to follow.
      * @param offsetX Horizontal offset of the particle origin from the Game Object. Default 0.
      * @param offsetY Vertical offset of the particle origin from the Game Object. Default 0.
      * @param trackVisible Whether the emitter's visible state will track the target's visible state. Default false.
      */
    def startFollow(target: GameObject): this.type = js.native
    def startFollow(
      target: GameObject,
      offsetX: js.UndefOr[scala.Nothing],
      offsetY: js.UndefOr[scala.Nothing],
      trackVisible: Boolean
    ): this.type = js.native
    def startFollow(target: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double, trackVisible: Boolean): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: js.UndefOr[scala.Nothing], trackVisible: Boolean): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: Double): this.type = js.native
    def startFollow(target: GameObject, offsetX: Double, offsetY: Double, trackVisible: Boolean): this.type = js.native
    
    /**
      * Turns {@link Phaser.GameObjects.Particles.ParticleEmitter#on off} the emitter.
      */
    def stop(): this.type = js.native
    
    /**
      * Stops following a Game Object.
      */
    def stopFollow(): this.type = js.native
    
    /**
      * The texture assigned to particles.
      */
    var texture: Texture = js.native
    
    /**
      * The time rate applied to active particles, affecting lifespan, movement, and tweens. Values larger than 1 are faster than normal.
      */
    var timeScale: Double = js.native
    
    /**
      * Color tint applied to emitted particles. Any alpha component (0xAA000000) is ignored.
      */
    var tint: EmitterOp = js.native
    
    /**
      * Creates a description of this emitter suitable for JSON serialization.
      * @param output An object to copy output into.
      */
    def toJSON(): js.Object = js.native
    def toJSON(output: js.Object): js.Object = js.native
    
    /**
      * Whether the emitter's {@link Phaser.GameObjects.Particles.ParticleEmitter#visible} state will track
      * the {@link Phaser.GameObjects.Particles.ParticleEmitter#follow} target's visibility state.
      */
    var trackVisible: Boolean = js.native
    
    /**
      * The x-coordinate of the particle origin (where particles will be emitted).
      */
    var x: EmitterOp = js.native
    
    /**
      * The y-coordinate of the particle origin (where particles will be emitted).
      */
    var y: EmitterOp = js.native
  }
  
  /**
    * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
    */
  @js.native
  trait ParticleEmitterManager
    extends GameObject
       with Depth
       with Mask
       with Pipeline
       with Transform
       with Visible {
    
    /**
      * Adds an existing Particle Emitter to this Emitter Manager.
      * @param emitter The Particle Emitter to add to this Emitter Manager.
      */
    def addEmitter(emitter: ParticleEmitter): ParticleEmitter = js.native
    
    /**
      * Adds an existing Gravity Well object to this Emitter Manager.
      * @param well The Gravity Well to add to this Emitter Manager.
      */
    def addGravityWell(well: GravityWell): GravityWell = js.native
    
    /**
      * Creates a new Particle Emitter object, adds it to this Emitter Manager and returns a reference to it.
      * @param config Configuration settings for the Particle Emitter to create.
      */
    def createEmitter(config: ParticleEmitterConfig): ParticleEmitter = js.native
    
    /**
      * Creates a new Gravity Well, adds it to this Emitter Manager and returns a reference to it.
      * @param config Configuration settings for the Gravity Well to create.
      */
    def createGravityWell(config: GravityWellConfig): GravityWell = js.native
    
    /**
      * Emits particles from each active emitter.
      * @param count The number of particles to release from each emitter. The default is the emitter's own {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
      * @param x The x-coordinate to to emit particles from. The default is the x-coordinate of the emitter's current location.
      * @param y The y-coordinate to to emit particles from. The default is the y-coordinate of the emitter's current location.
      */
    def emitParticle(): this.type = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: Double): this.type = js.native
    def emitParticle(count: js.UndefOr[scala.Nothing], x: Double, y: Double): this.type = js.native
    def emitParticle(count: integer): this.type = js.native
    def emitParticle(count: integer, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
    def emitParticle(count: integer, x: Double): this.type = js.native
    def emitParticle(count: integer, x: Double, y: Double): this.type = js.native
    
    /**
      * Emits particles from each active emitter.
      * @param x The x-coordinate to to emit particles from. The default is the x-coordinate of the emitter's current location.
      * @param y The y-coordinate to to emit particles from. The default is the y-coordinate of the emitter's current location.
      * @param count The number of particles to release from each emitter. The default is the emitter's own {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity}.
      */
    def emitParticleAt(): this.type = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], count: integer): this.type = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
    def emitParticleAt(x: js.UndefOr[scala.Nothing], y: Double, count: integer): this.type = js.native
    def emitParticleAt(x: Double): this.type = js.native
    def emitParticleAt(x: Double, y: js.UndefOr[scala.Nothing], count: integer): this.type = js.native
    def emitParticleAt(x: Double, y: Double): this.type = js.native
    def emitParticleAt(x: Double, y: Double, count: integer): this.type = js.native
    
    /**
      * A list of Emitters being managed by this Emitter Manager.
      */
    var emitters: List[ParticleEmitter] = js.native
    
    /**
      * The texture frame used to render this Emitter Manager's particles.
      */
    var frame: Frame = js.native
    
    /**
      * Names of this Emitter Manager's texture frames.
      */
    var frameNames: js.Array[String] = js.native
    
    /**
      * Gets all active particle processors (gravity wells).
      */
    def getProcessors(): js.Array[GravityWell] = js.native
    
    /**
      * Pauses this Emitter Manager.
      * 
      * This has the effect of pausing all emitters, and all particles of those emitters, currently under its control.
      * 
      * The particles will still render, but they will not have any of their logic updated.
      */
    def pause(): this.type = js.native
    
    /**
      * Updates all active emitters.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time, in ms, elapsed since the last frame.
      */
    def preUpdate(time: integer, delta: Double): Unit = js.native
    
    /**
      * Removes a Particle Emitter from this Emitter Manager, if the Emitter belongs to this Manager.
      */
    def removeEmitter(emitter: ParticleEmitter): ParticleEmitter = js.native
    
    /**
      * Resumes this Emitter Manager, should it have been previously paused.
      */
    def resume(): this.type = js.native
    
    def setEmitterFrames(frames: js.Array[Frame], emitter: ParticleEmitter): this.type = js.native
    /**
      * Assigns texture frames to an emitter.
      * @param frames The texture frames.
      * @param emitter The particle emitter to modify.
      */
    def setEmitterFrames(frames: Frame, emitter: ParticleEmitter): this.type = js.native
    
    /**
      * Sets the frame this Emitter Manager will use to render with.
      * 
      * The Frame has to belong to the current Texture being used.
      * 
      * It can be either a string or an index.
      * @param frame The name or index of the frame within the Texture.
      */
    def setFrame(): this.type = js.native
    def setFrame(frame: String): this.type = js.native
    def setFrame(frame: integer): this.type = js.native
    
    /**
      * Sets the texture and frame this Emitter Manager will use to render with.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture.
      */
    def setTexture(key: String): this.type = js.native
    def setTexture(key: String, frame: String): this.type = js.native
    def setTexture(key: String, frame: integer): this.type = js.native
    
    /**
      * The texture used to render this Emitter Manager's particles.
      */
    var texture: Texture = js.native
    
    /**
      * The time scale applied to all emitters and particles, affecting flow rate, lifespan, and movement.
      * Values larger than 1 are faster than normal.
      * This is multiplied with any timeScale set on each individual emitter.
      */
    var timeScale: Double = js.native
    
    /**
      * A list of Gravity Wells being managed by this Emitter Manager.
      */
    var wells: List[GravityWell] = js.native
  }
  
  object Zones {
    
    /**
      * A Death Zone.
      * 
      * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
      * 
      * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
      * object as long as it includes a `contains` method for which the Particles can be tested against.
      */
    @js.native
    trait DeathZone extends StObject {
      
      /**
        * Set to `true` if the Particle should be killed if it enters this zone.
        * Set to `false` to kill the Particle if it leaves this zone.
        */
      var killOnEnter: Boolean = js.native
      
      /**
        * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
        * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
        */
      var source: DeathZoneSource = js.native
      
      /**
        * Checks if the given Particle will be killed or not by this zone.
        * @param particle The Particle to be checked against this zone.
        */
      def willKill(particle: Particle): Boolean = js.native
    }
    object DeathZone {
      
      @scala.inline
      def apply(killOnEnter: Boolean, source: DeathZoneSource, willKill: Particle => Boolean): DeathZone = {
        val __obj = js.Dynamic.literal(killOnEnter = killOnEnter.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], willKill = js.Any.fromFunction1(willKill))
        __obj.asInstanceOf[DeathZone]
      }
      
      @scala.inline
      implicit class DeathZoneMutableBuilder[Self <: DeathZone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKillOnEnter(value: Boolean): Self = StObject.set(x, "killOnEnter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: DeathZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWillKill(value: Particle => Boolean): Self = StObject.set(x, "willKill", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A zone that places particles on a shape's edges.
      */
    @js.native
    trait EdgeZone extends StObject {
      
      /**
        * Change the source of the EdgeZone.
        * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      def changeSource(source: EdgeZoneSource): this.type = js.native
      
      /**
        * The counter used for iterating the EdgeZone's points.
        */
      var counter: Double = js.native
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      def getPoint(particle: Particle): Unit = js.native
      
      /**
        * The points placed on the source edge.
        */
      var points: js.Array[Point] = js.native
      
      /**
        * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
        */
      var quantity: integer = js.native
      
      /**
        * Whether one endpoint will be removed if it's identical to the other.
        */
      var seamless: Boolean = js.native
      
      /**
        * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
        */
      var source: EdgeZoneSource | RandomZoneSource = js.native
      
      /**
        * The distance between each particle. When set, `quantity` is implied and should be set to 0.
        */
      var stepRate: Double = js.native
      
      /**
        * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
        * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
        * 
        * Also updates internal properties.
        */
      def updateSource(): this.type = js.native
      
      /**
        * Whether particles are placed from start to end and then end to start.
        */
      var yoyo: Boolean = js.native
    }
    object EdgeZone {
      
      @scala.inline
      def apply(
        changeSource: EdgeZoneSource => EdgeZone,
        counter: Double,
        getPoint: Particle => Unit,
        points: js.Array[Point],
        quantity: integer,
        seamless: Boolean,
        source: EdgeZoneSource | RandomZoneSource,
        stepRate: Double,
        updateSource: () => EdgeZone,
        yoyo: Boolean
      ): EdgeZone = {
        val __obj = js.Dynamic.literal(changeSource = js.Any.fromFunction1(changeSource), counter = counter.asInstanceOf[js.Any], getPoint = js.Any.fromFunction1(getPoint), points = points.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], seamless = seamless.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stepRate = stepRate.asInstanceOf[js.Any], updateSource = js.Any.fromFunction0(updateSource), yoyo = yoyo.asInstanceOf[js.Any])
        __obj.asInstanceOf[EdgeZone]
      }
      
      @scala.inline
      implicit class EdgeZoneMutableBuilder[Self <: EdgeZone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChangeSource(value: EdgeZoneSource => EdgeZone): Self = StObject.set(x, "changeSource", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetPoint(value: Particle => Unit): Self = StObject.set(x, "getPoint", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
        
        @scala.inline
        def setQuantity(value: integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: EdgeZoneSource | RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepRate(value: Double): Self = StObject.set(x, "stepRate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateSource(value: () => EdgeZone): Self = StObject.set(x, "updateSource", js.Any.fromFunction0(value))
        
        @scala.inline
        def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A zone that places particles randomly within a shape's area.
      */
    @js.native
    trait RandomZone extends StObject {
      
      /**
        * Get the next point in the Zone and set its coordinates on the given Particle.
        * @param particle The Particle.
        */
      def getPoint(particle: Particle): Unit = js.native
      
      /**
        * An object instance with a `getRandomPoint(point)` method.
        */
      var source: RandomZoneSource = js.native
    }
    object RandomZone {
      
      @scala.inline
      def apply(getPoint: Particle => Unit, source: RandomZoneSource): RandomZone = {
        val __obj = js.Dynamic.literal(getPoint = js.Any.fromFunction1(getPoint), source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[RandomZone]
      }
      
      @scala.inline
      implicit class RandomZoneMutableBuilder[Self <: RandomZone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetPoint(value: Particle => Unit): Self = StObject.set(x, "getPoint", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSource(value: RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
}
