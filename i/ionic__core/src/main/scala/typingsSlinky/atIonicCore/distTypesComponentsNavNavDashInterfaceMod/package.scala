package typingsSlinky.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesComponentsNavNavDashInterfaceMod {
  import org.scalablytyped.runtime.Instantiable1
  import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
  import typingsSlinky.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.Animation

  type NavComponent = ComponentRef | typingsSlinky.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController
  type Page = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type TransitionDoneFn = js.Function5[
    /* hasCompleted */ Boolean, 
    /* requiresTransition */ Boolean, 
    /* enteringView */ js.UndefOr[
      typingsSlinky.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController
    ], 
    /* leavingView */ js.UndefOr[
      typingsSlinky.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController
    ], 
    /* direction */ js.UndefOr[String], 
    Unit
  ]
  type TransitionRejectFn = js.Function2[/* rejectReason */ js.Any, /* transition */ js.UndefOr[Animation], Unit]
  type TransitionResolveFn = js.Function5[
    /* hasCompleted */ Boolean, 
    /* requiresTransition */ Boolean, 
    /* enteringName */ js.UndefOr[String], 
    /* leavingName */ js.UndefOr[String], 
    /* direction */ js.UndefOr[String], 
    Unit
  ]
}
