package typingsSlinky.graphqlTools.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlTools.interfacesMod.IConnectorCls[TContext]
  - typingsSlinky.graphqlTools.interfacesMod.IConnectorFn[TContext]
*/
trait IConnector[TContext] extends js.Object

object IConnector {
  @scala.inline
  implicit def apply[TContext](value: IConnectorCls[TContext]): IConnector[TContext] = value.asInstanceOf[IConnector[TContext]]
  @scala.inline
  implicit def apply[TContext](value: IConnectorFn[TContext]): IConnector[TContext] = value.asInstanceOf[IConnector[TContext]]
}

