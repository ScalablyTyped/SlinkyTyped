package typingsSlinky.babylonjs.thinEngineMod

import typingsSlinky.std.WebGLContextAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineOptions extends WebGLContextAttributes {
  /**
    * Defines if webaudio should be initialized as well
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEngine: js.UndefOr[Boolean] = js.native
  /**
    * Defines if webvr should be enabled automatically
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  var autoEnableWebVR: js.UndefOr[Boolean] = js.native
  /**
    * Defines if animations should run using a deterministic lock step
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: js.UndefOr[Boolean] = js.native
  /**
    * Defines if webgl2 should be turned off even if supported
    * @see http://doc.babylonjs.com/features/webgl2
    */
  var disableWebGL2Support: js.UndefOr[Boolean] = js.native
  /**
    * Defines that engine should ignore context lost events
    * If this event happens when this parameter is true, you will have to reload the page to restore rendering
    */
  var doNotHandleContextLost: js.UndefOr[Boolean] = js.native
  /**
    * Defines that engine should ignore modifying touch action attribute and style
    * If not handle, you might need to set it up on your side for expected touch devices behavior.
    */
  var doNotHandleTouchAction: js.UndefOr[Boolean] = js.native
  /**
    * Defines if the engine should no exceed a specified device ratio
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
    */
  var limitDeviceRatio: js.UndefOr[Double] = js.native
  /** Defines the maximum steps to use with deterministic lock step mode */
  var lockstepMaxSteps: js.UndefOr[Double] = js.native
  /** Defines the seconds between each deterministic lock step */
  var timeStep: js.UndefOr[Double] = js.native
  /**
    * Defines that engine should compile shaders with high precision floats (if supported). True by default
    */
  var useHighPrecisionFloats: js.UndefOr[Boolean] = js.native
}

object EngineOptions {
  @scala.inline
  def apply(): EngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineOptions]
  }
  @scala.inline
  implicit class EngineOptionsOps[Self <: EngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEngine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEnableWebVR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEnableWebVR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEnableWebVR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEnableWebVR")(js.undefined)
        ret
    }
    @scala.inline
    def withDeterministicLockstep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deterministicLockstep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeterministicLockstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deterministicLockstep")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWebGL2Support(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebGL2Support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWebGL2Support: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebGL2Support")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotHandleContextLost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotHandleContextLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotHandleContextLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotHandleContextLost")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotHandleTouchAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotHandleTouchAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotHandleTouchAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotHandleTouchAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitDeviceRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitDeviceRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitDeviceRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitDeviceRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLockstepMaxSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockstepMaxSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockstepMaxSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockstepMaxSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStep")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHighPrecisionFloats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighPrecisionFloats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHighPrecisionFloats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighPrecisionFloats")(js.undefined)
        ret
    }
  }
  
}

