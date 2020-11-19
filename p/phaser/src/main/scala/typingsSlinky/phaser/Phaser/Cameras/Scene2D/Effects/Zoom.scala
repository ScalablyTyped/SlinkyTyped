package typingsSlinky.phaser.Phaser.Cameras.Scene2D.Effects

import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D.CameraZoomCallback
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Camera Zoom effect.
  * 
  * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
  * 
  * The effect will dispatch several events on the Camera itself and you can also specify an `onUpdate` callback,
  * which is invoked each frame for the duration of the effect if required.
  */
@js.native
trait Zoom extends js.Object {
  
  /**
    * The Camera this effect belongs to.
    */
  val camera: Camera = js.native
  
  /**
    * The destination zoom value.
    */
  var destination: Double = js.native
  
  /**
    * Destroys this effect, releasing it from the Camera.
    */
  def destroy(): Unit = js.native
  
  /**
    * The duration of the effect, in milliseconds.
    */
  val duration: integer = js.native
  
  /**
    * The ease function to use during the zoom.
    */
  var ease: js.Function = js.native
  
  /**
    * Called internally when the effect completes.
    */
  def effectComplete(): Unit = js.native
  
  /**
    * Is this effect actively running?
    */
  val isRunning: Boolean = js.native
  
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
    * The starting zoom value;
    */
  var source: Double = js.native
  
  /**
    * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
    * @param zoom The target Camera zoom value.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param ease The ease to use for the Zoom. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
    * @param force Force the zoom effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent three arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
    * and the current camera zoom value.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def start(zoom: Double): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.UndefOr[scala.Nothing], force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: String): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: String, force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function, force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: js.UndefOr[scala.Nothing], force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: String): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: String, force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraZoomCallback): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: js.Function): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback
  ): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): Camera = js.native
  def start(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraZoomCallback): Camera = js.native
  def start(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: CameraZoomCallback,
    context: js.Any
  ): Camera = js.native
  
  /**
    * The main update loop for this effect. Called automatically by the Camera.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def update(time: integer, delta: Double): Unit = js.native
}
