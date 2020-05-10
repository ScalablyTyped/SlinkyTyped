package typingsSlinky.jqueryFinger.JQueryFinger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFingerOptions extends js.Object {
  /**
    * The maximum time between two tap events to fire a doubletap event.
    * If this time is reached, two distinct tap events will be fired instead.
    *     Default: 300(ms).
    */
  var doubleTapInterval: Double = js.native
  /**
    * The maximum time the user will have to swipe in order to fire a flick
    * event. If this time is reached, only drag events will continue to be
    * fired.
    *     Default: 150(ms).
    */
  var flickDuration: Double = js.native
  /**
    * The number of pixels the user will have to move in order to fire motion
    * events (drag or flick). If this time is not reached, no motion will
    * be handled and tap, doubletap or press event will be fired.
    *     Default: 5(px).
    */
  var motionThreshhold: Double = js.native
  /**
    * The time the user must hold in order to fire a press event. If this
    * time is not reached, a tap event will be fired instead.
    *     Default: 300(ms).
    */
  var pressDuration: Double = js.native
  /**
    * Globally prevents every native default behavior.
    *     Default: undefined.
    */
  var preventDefault: Boolean = js.native
}

object JQueryFingerOptions {
  @scala.inline
  def apply(
    doubleTapInterval: Double,
    flickDuration: Double,
    motionThreshhold: Double,
    pressDuration: Double,
    preventDefault: Boolean
  ): JQueryFingerOptions = {
    val __obj = js.Dynamic.literal(doubleTapInterval = doubleTapInterval.asInstanceOf[js.Any], flickDuration = flickDuration.asInstanceOf[js.Any], motionThreshhold = motionThreshhold.asInstanceOf[js.Any], pressDuration = pressDuration.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFingerOptions]
  }
  @scala.inline
  implicit class JQueryFingerOptionsOps[Self <: JQueryFingerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoubleTapInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlickDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionThreshhold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionThreshhold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

