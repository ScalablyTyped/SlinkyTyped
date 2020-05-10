package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryAnimationOptions extends js.Object {
  /**
    * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
    */
  var always: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.Function] = js.native
  /**
    * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
    */
  var done: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[js.Any] = js.native
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
    */
  var fail: js.UndefOr[js.Function2[/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean, _]] = js.native
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
    */
  var progress: js.UndefOr[
    js.Function3[/* animation */ JQueryPromise[_], /* progress */ Double, /* remainingMs */ Double, _]
  ] = js.native
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[js.Any] = js.native
  /**
    * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
    */
  var specialEasing: js.UndefOr[Object] = js.native
  /**
    * A function to call when the animation begins. (version added: 1.8)
    */
  var start: js.UndefOr[js.Function1[/* animation */ JQueryPromise[_], _]] = js.native
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[js.Function2[/* now */ Double, /* tween */ js.Any, _]] = js.native
}

object JQueryAnimationOptions {
  @scala.inline
  def apply(): JQueryAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryAnimationOptions]
  }
  @scala.inline
  implicit class JQueryAnimationOptionsOps[Self <: JQueryAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: (/* animation */ JQueryPromise[_], /* jumpedToEnd */ Boolean) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: (/* animation */ JQueryPromise[_], /* progress */ Double, /* remainingMs */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialEasing(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* animation */ JQueryPromise[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: (/* now */ Double, /* tween */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

