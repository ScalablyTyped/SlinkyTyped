package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsHelper extends js.Object {
  
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
