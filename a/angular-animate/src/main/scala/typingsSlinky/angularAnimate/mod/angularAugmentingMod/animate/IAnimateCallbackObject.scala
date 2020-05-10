package typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate

import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateCallbackObject extends js.Object {
  var addClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var animate: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* fromStyles */ String, 
      /* toStyles */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeAddClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeRemoveClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeSetClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var enter: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var eventFn: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var leave: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var move: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var removeClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var setClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
}

object IAnimateCallbackObject {
  @scala.inline
  def apply(): IAnimateCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimateCallbackObject]
  }
  @scala.inline
  implicit class IAnimateCallbackObjectOps[Self <: IAnimateCallbackObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(
      value: (/* element */ JQuery, /* fromStyles */ String, /* toStyles */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAddClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAddClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAddClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveClass(
      value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetClass")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFn(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventFn")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(
      value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClass")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSetClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClass")(js.undefined)
        ret
    }
  }
  
}

