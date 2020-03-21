package typingsSlinky.angularAnimate.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animate {
  /**
    * AnimateCssService
    * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
    */
  type IAnimateCssService = js.Function2[
    /* element */ typingsSlinky.angular.JQuery, 
    /* animateCssOptions */ typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions, 
    typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCssRunner
  ]
  type IAnimateFactory = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCallbackObject
  ]
  type IAnimationPromise = typingsSlinky.angular.mod.IPromise[scala.Unit]
}
