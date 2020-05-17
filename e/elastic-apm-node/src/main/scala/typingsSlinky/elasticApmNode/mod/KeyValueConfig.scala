package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.elasticApmNode.mod.Labels
  - js.Array[js.Array[typingsSlinky.elasticApmNode.mod.LabelValue]]
*/
trait KeyValueConfig extends js.Object

object KeyValueConfig {
  @scala.inline
  implicit def apply(value: js.Array[js.Array[LabelValue]]): KeyValueConfig = value.asInstanceOf[KeyValueConfig]
  @scala.inline
  implicit def apply(value: Labels): KeyValueConfig = value.asInstanceOf[KeyValueConfig]
  @scala.inline
  implicit def apply(value: String): KeyValueConfig = value.asInstanceOf[KeyValueConfig]
}

