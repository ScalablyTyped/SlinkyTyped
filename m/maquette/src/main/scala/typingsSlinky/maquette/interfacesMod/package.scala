package typingsSlinky.maquette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ java.lang.String, 
    /* eventHandler */ js.Function, 
    /* domNode */ org.scalajs.dom.raw.Node, 
    /* properties */ typingsSlinky.maquette.interfacesMod.VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[
    /* eventType */ typingsSlinky.maquette.interfacesMod.PerformanceLoggerEvent, 
    /* trigger */ js.UndefOr[org.scalajs.dom.raw.Event], 
    scala.Unit
  ]
}
