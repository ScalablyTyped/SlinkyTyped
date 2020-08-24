package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navInterfaceMod {
  type NavComponent = typingsSlinky.ionicCore.mod.ComponentRef | typingsSlinky.ionicCore.viewControllerMod.ViewController
  type Page = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type TransitionDoneFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringView */ js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController], 
    /* leavingView */ js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type TransitionRejectFn = js.Function2[
    /* rejectReason */ js.Any, 
    /* transition */ js.UndefOr[typingsSlinky.ionicCore.animationInterfaceMod.Animation], 
    scala.Unit
  ]
  type TransitionResolveFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringName */ js.UndefOr[java.lang.String], 
    /* leavingName */ js.UndefOr[java.lang.String], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
