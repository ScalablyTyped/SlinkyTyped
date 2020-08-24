package typingsSlinky.reactToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventManagerMod {
  type Callback = typingsSlinky.reactToastify.eventManagerMod.OnShowCallback | typingsSlinky.reactToastify.eventManagerMod.OnClearCallback | typingsSlinky.reactToastify.eventManagerMod.OnClearWaitingQueue | typingsSlinky.reactToastify.eventManagerMod.OnDidMountCallback | typingsSlinky.reactToastify.eventManagerMod.OnWillUnmountCallback | typingsSlinky.reactToastify.eventManagerMod.OnChangeCallback
  type OnChangeCallback = js.Function2[
    /* toast */ scala.Double, 
    /* containerId */ js.UndefOr[scala.Double | java.lang.String], 
    scala.Unit
  ]
  type OnClearCallback = js.Function1[/* id */ js.UndefOr[typingsSlinky.reactToastify.typesMod.Id], scala.Unit]
  type OnClearWaitingQueue = js.Function1[
    /* params */ typingsSlinky.reactToastify.typesMod.ClearWaitingQueueParams, 
    scala.Unit
  ]
  type OnDidMountCallback = js.Function1[
    /* containerInstance */ typingsSlinky.reactToastify.useToastContainerMod.ContainerInstance, 
    scala.Unit
  ]
  type OnShowCallback = js.Function2[
    /* content */ typingsSlinky.reactToastify.typesMod.ToastContent, 
    /* options */ typingsSlinky.reactToastify.typesMod.NotValidatedToastProps, 
    scala.Unit
  ]
  type OnWillUnmountCallback = typingsSlinky.reactToastify.eventManagerMod.OnDidMountCallback
  type TimeoutId = typingsSlinky.std.ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.setTimeout */ js.Any
  ]
}
