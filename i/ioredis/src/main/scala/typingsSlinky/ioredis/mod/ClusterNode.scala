package typingsSlinky.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.ioredis.mod.NodeConfiguration
*/
trait ClusterNode extends js.Object

object ClusterNode {
  @scala.inline
  implicit def apply(value: Double): ClusterNode = value.asInstanceOf[ClusterNode]
  @scala.inline
  implicit def apply(value: NodeConfiguration): ClusterNode = value.asInstanceOf[ClusterNode]
  @scala.inline
  implicit def apply(value: String): ClusterNode = value.asInstanceOf[ClusterNode]
}

