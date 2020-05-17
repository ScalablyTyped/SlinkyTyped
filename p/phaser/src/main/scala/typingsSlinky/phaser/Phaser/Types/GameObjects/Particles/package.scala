package typingsSlinky.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Particles {
  type DeathZoneSourceCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  type EdgeZoneSourceCallback = js.Function2[
    /* quantity */ typingsSlinky.phaser.integer, 
    /* stepRate */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[
    /* particle */ typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  /**
    * The returned value updates the property for the duration of the particle's life.
    */
  type EmitterOpOnUpdateCallback = js.Function4[
    /* particle */ typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* t */ scala.Double, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  type ParticleDeathCallback = js.Function1[
    /* particle */ typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle, 
    scala.Unit
  ]
  type ParticleEmitterCallback = js.Function2[
    /* particle */ typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle, 
    /* emitter */ typingsSlinky.phaser.Phaser.GameObjects.Particles.ParticleEmitter, 
    scala.Unit
  ]
  type RandomZoneSourceCallback = js.Function1[/* point */ typingsSlinky.phaser.Phaser.Math.Vector2, scala.Unit]
}
