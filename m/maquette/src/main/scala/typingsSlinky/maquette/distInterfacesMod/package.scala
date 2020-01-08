package typingsSlinky.maquette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInterfacesMod {
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.Node

  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ String, 
    /* eventHandler */ js.Function, 
    /* domNode */ Node, 
    /* properties */ VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event], Unit]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.maquette.distInterfacesMod.VNode
    - typings.maquette.distInterfacesMod.VNodeChildren
    - typings.maquette.maquetteBooleans.`false`
    - scala.Null
    - `js.undefined`
  */
  type VNodeChild = js.UndefOr[_VNodeChild | String | Null]
}
