package typingsSlinky.blueprintjsTable.batcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait SimpleStringifyable extends js.Object

object SimpleStringifyable {
  @scala.inline
  implicit def apply(value: Double): SimpleStringifyable = value.asInstanceOf[SimpleStringifyable]
  @scala.inline
  implicit def apply(value: Null): SimpleStringifyable = value.asInstanceOf[SimpleStringifyable]
  @scala.inline
  implicit def apply(value: String): SimpleStringifyable = value.asInstanceOf[SimpleStringifyable]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => SimpleStringifyable): SimpleStringifyable = value.asInstanceOf[SimpleStringifyable]
}

