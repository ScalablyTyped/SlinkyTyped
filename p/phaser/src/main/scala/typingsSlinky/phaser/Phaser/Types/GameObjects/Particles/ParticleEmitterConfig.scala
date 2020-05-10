package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.Phaser.BlendModes
import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle
import typingsSlinky.phaser.Phaser.Textures.Frame
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationX} (emit only).
    */
  var accelerationX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#accelerationY} (emit only).
    */
  var accelerationY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#alpha}.
    */
  var alpha: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#angle} (emit only).
    */
  var angle: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#blendMode}.
    */
  var blendMode: js.UndefOr[BlendModes | String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#bounce} (emit only).
    */
  var bounce: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setBounds}.
    */
  var bounds: js.UndefOr[ParticleEmitterBounds | ParticleEmitterBoundsAlt] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope} and {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideBottom}.
    */
  var collideBottom: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideLeft}.
    */
  var collideLeft: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideRight}.
    */
  var collideRight: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#collideTop}.
    */
  var collideTop: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallback}.
    */
  var deathCallback: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#deathCallbackScope}.
    */
  var deathCallbackScope: js.UndefOr[js.Any] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#delay} (emit only).
    */
  var delay: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallback}.
    */
  var emitCallback: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#emitCallbackScope}.
    */
  var emitCallbackScope: js.UndefOr[js.Any] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setEmitZone}.
    */
  var emitZone: js.UndefOr[js.Object] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#follow}.
    */
  var follow: js.UndefOr[GameObject] = js.native
  /**
    * Assigns to {@link Phaser.GameObjects.Particles.ParticleEmitter#followOffset}.
    */
  var followOffset: js.UndefOr[js.Object] = js.native
  /**
    * x-coordinate of the offset.
    */
  @JSName("followOffset.x")
  var followOffsetDotx: js.UndefOr[Double] = js.native
  /**
    * y-coordinate of the offset.
    */
  @JSName("followOffset.y")
  var followOffsetDoty: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frames}.
    */
  var frame: js.UndefOr[
    Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig
  ] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#frequency}.
    */
  var frequency: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityX}.
    */
  var gravityX: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#gravityY}.
    */
  var gravityY: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#lifespan} (emit only).
    */
  var lifespan: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxParticles}.
    */
  var maxParticles: js.UndefOr[integer] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityX} (emit only).
    */
  var maxVelocityX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#maxVelocityY} (emit only).
    */
  var maxVelocityY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToX} (emit only).
    */
  var moveToX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#moveToY} (emit only).
    */
  var moveToY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#on}.
    */
  var on: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleBringToTop}.
    */
  var particleBringToTop: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#particleClass}.
    */
  var particleClass: js.UndefOr[Particle] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#quantity} (emit only).
    */
  var quantity: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#radial}.
    */
  var radial: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#rotate}.
    */
  var rotate: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setScale}.
    */
  var scale: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleX}.
    */
  var scaleX: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#scaleY}.
    */
  var scaleY: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * As {@link Phaser.GameObjects.Particles.ParticleEmitter#setSpeed} (emit only).
    */
  var speed: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedX} (emit only).
    */
  var speedX: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#speedY} (emit only).
    */
  var speedY: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#tint}.
    */
  var tint: js.UndefOr[EmitterOpOnEmitType | EmitterOpOnUpdateType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#trackVisible}.
    */
  var trackVisible: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#visible}.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#x} (emit only).
    */
  var x: js.UndefOr[EmitterOpOnEmitType] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Particles.ParticleEmitter#y} (emit only).
    */
  var y: js.UndefOr[EmitterOpOnEmitType] = js.native
}

object ParticleEmitterConfig {
  @scala.inline
  def apply(): ParticleEmitterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterConfig]
  }
  @scala.inline
  implicit class ParticleEmitterConfigOps[Self <: ParticleEmitterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerationXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAccelerationX(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(js.undefined)
        ret
    }
    @scala.inline
    def withAccelerationYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAccelerationY(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAlphaFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAlpha(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAngleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAngle(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendMode(value: BlendModes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBounce(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: ParticleEmitterBounds | ParticleEmitterBoundsAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withCollideBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCollideLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCollideRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideRight")(js.undefined)
        ret
    }
    @scala.inline
    def withCollideTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollideTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideTop")(js.undefined)
        ret
    }
    @scala.inline
    def withDeathCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeathCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDeathCallbackScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathCallbackScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeathCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathCallbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelay(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitCallbackScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitCallbackScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitCallbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitZone(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowOffset(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowOffsetDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowOffsetDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset.x")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowOffsetDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowOffsetDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followOffset.y")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: Double | (js.Array[Double | Frame | String]) | String | Frame | ParticleEmitterFrameConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityX")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityY")(js.undefined)
        ret
    }
    @scala.inline
    def withLifespanFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLifespan(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifespan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParticles(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParticles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParticles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParticles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVelocityXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxVelocityX(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVelocityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVelocityYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMaxVelocityY(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVelocityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVelocityY")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToX")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoveToX(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToX")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoveToY(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToY")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withParticleBringToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleBringToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticleBringToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleBringToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withParticleClass(value: Particle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQuantity(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRadial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radial")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRotateFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRotate(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withScaleFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withScale(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleXFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withScaleXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withScaleX(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleYFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withScaleYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withScaleY(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSpeed(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedX")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSpeedX(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedX")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSpeedY(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedY")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(js.undefined)
        ret
    }
    @scala.inline
    def withTintFunction4(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTintFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTint(value: EmitterOpOnEmitType | EmitterOpOnUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withXFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withX(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withYFunction3(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withY(value: EmitterOpOnEmitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

