package typingsSlinky.expressWechatAccess.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined  */ @js.native
trait WeAccessMiddleware
  extends WeMiddleware
     with EventEmitter {
  /* InferMemberOverrides */
  override def apply(T0: /* req */ js.Any, T1: /* res */ Response | ServerResponse, T2: /* next */ NextFunction): js.Any = js.native
}

