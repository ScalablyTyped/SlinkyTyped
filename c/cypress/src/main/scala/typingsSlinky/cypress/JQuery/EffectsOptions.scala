package typingsSlinky.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/animate/#animate-properties-options }\`
  */
@js.native
trait EffectsOptions[TElement]
  extends PlainObject[js.Any] {
  /**
    * A function to be called when the animation on an element completes or stops without completing (its Promise object is either resolved or rejected).
    */
  var always: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  /**
    * A function that is called once the animation on an element is complete.
    */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, Unit]] = js.native
  /**
    * A function to be called when the animation on an element completes (its Promise object is resolved).
    */
  var done: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Duration] = js.native
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * A function to be called when the animation on an element fails to complete (its Promise object is rejected).
    */
  var fail: js.UndefOr[
    js.ThisFunction2[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* jumpedToEnd */ Boolean, 
      Unit
    ]
  ] = js.native
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties.
    */
  var progress: js.UndefOr[
    js.ThisFunction3[
      /* this */ TElement, 
      /* animation */ Animation[TElement], 
      /* progress */ Double, 
      /* remainingMs */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[Boolean | String] = js.native
  /**
    * An object containing one or more of the CSS properties defined by the properties argument and their corresponding easing functions.
    */
  var specialEasing: js.UndefOr[PlainObject[String]] = js.native
  /**
    * A function to call when the animation on an element begins.
    */
  var start: js.UndefOr[js.ThisFunction1[/* this */ TElement, /* animation */ Animation[TElement], Unit]] = js.native
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit]
  ] = js.native
}

object EffectsOptions {
  @scala.inline
  def apply[TElement](): EffectsOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectsOptions[TElement]]
  }
  @scala.inline
  implicit class EffectsOptionsOps[Self[telement] <: EffectsOptions[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withAlways(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlways: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: js.ThisFunction0[/* this */ TElement, Unit]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Duration): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(
      value: js.ThisFunction2[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* jumpedToEnd */ Boolean, 
          Unit
        ]
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFail: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(
      value: js.ThisFunction3[
          /* this */ TElement, 
          /* animation */ Animation[TElement], 
          /* progress */ Double, 
          /* remainingMs */ Double, 
          Unit
        ]
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: Boolean | String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialEasing(value: PlainObject[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialEasing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.ThisFunction1[/* this */ TElement, /* animation */ Animation[TElement], Unit]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

