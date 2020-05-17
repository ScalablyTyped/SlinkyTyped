package typingsSlinky.oracledb.mod

import typingsSlinky.node.Buffer
import typingsSlinky.oracledb.anon.Correlation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.oracledb.mod.DBObject
  - typingsSlinky.oracledb.anon.Correlation
*/
trait EnqueueMessage extends js.Object

object EnqueueMessage {
  @scala.inline
  implicit def apply(value: Buffer): EnqueueMessage = value.asInstanceOf[EnqueueMessage]
  @scala.inline
  implicit def apply(value: Correlation): EnqueueMessage = value.asInstanceOf[EnqueueMessage]
  @scala.inline
  implicit def apply(value: DBObject): EnqueueMessage = value.asInstanceOf[EnqueueMessage]
  @scala.inline
  implicit def apply(value: String): EnqueueMessage = value.asInstanceOf[EnqueueMessage]
}

