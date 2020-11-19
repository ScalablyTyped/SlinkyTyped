package typingsSlinky.phaser.Phaser.Cameras.Scene2D.Effects

import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Math.Vector2
import typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D.CameraShakeCallback
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Camera Shake effect.
  * 
  * This effect will shake the camera viewport by a random amount, bounded by the specified intensity, each frame.
  * 
  * Only the camera viewport is moved. None of the objects it is displaying are impacted, i.e. their positions do
  * not change.
  * 
  * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
  * which is invoked each frame for the duration of the effect if required.
  */
@js.native
trait Shake extends js.Object {
  
  /**
    * The Camera this effect belongs to.
    */
  val camera: Camera = js.native
  
  /**
    * Destroys this effect, releasing it from the Camera.
    */
  def destroy(): Unit = js.native
  
  /**
    * The duration of the effect, in milliseconds.
    */
  val duration: integer = js.native
  
  /**
    * Called internally when the effect completes.
    */
  def effectComplete(): Unit = js.native
  
  /**
    * The intensity of the effect. Use small float values. The default when the effect starts is 0.05.
    * This is a Vector2 object, allowing you to control the shake intensity independently across x and y.
    * You can modify this value while the effect is active to create more varied shake effects.
    */
  var intensity: Vector2 = js.native
  
  /**
    * Is this effect actively running?
    */
  val isRunning: Boolean = js.native
  
  /**
    * The pre-render step for this effect. Called automatically by the Camera.
    */
  def preRender(): Unit = js.native
  
  /**
    * If this effect is running this holds the current percentage of the progress, a value between 0 and 1.
    */
  var progress: Double = js.native
  
  /**
    * Resets this camera effect.
    * If it was previously running, it stops instantly without calling its onComplete callback or emitting an event.
    */
  def reset(): Unit = js.native
  
  /**
    * Shakes the Camera by the given intensity over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 100.
    * @param intensity The intensity of the shake. Default 0.05.
    * @param force Force the shake effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def start(): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: js.UndefOr[scala.Nothing], intensity: js.UndefOr[scala.Nothing], force: Boolean): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: js.UndefOr[scala.Nothing], intensity: Double): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: js.UndefOr[scala.Nothing], intensity: Double, force: Boolean): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: Boolean,
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: js.UndefOr[scala.Nothing], intensity: Vector2): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: js.UndefOr[scala.Nothing], intensity: Vector2, force: Boolean): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: Boolean,
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: js.UndefOr[scala.Nothing], force: Boolean): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Double): Camera = js.native
  def start(
    duration: integer,
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Double, force: Boolean): Camera = js.native
  def start(
    duration: integer,
    intensity: Double,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Double, force: Boolean, callback: CameraShakeCallback): Camera = js.native
  def start(
    duration: integer,
    intensity: Double,
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Vector2): Camera = js.native
  def start(
    duration: integer,
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback
  ): Camera = js.native
  def start(
    duration: integer,
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Vector2, force: Boolean): Camera = js.native
  def start(
    duration: integer,
    intensity: Vector2,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(duration: integer, intensity: Vector2, force: Boolean, callback: CameraShakeCallback): Camera = js.native
  def start(
    duration: integer,
    intensity: Vector2,
    force: Boolean,
    callback: CameraShakeCallback,
    context: js.Any
  ): Camera = js.native
  
  /**
    * The main update loop for this effect. Called automatically by the Camera.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def update(time: integer, delta: Double): Unit = js.native
}
