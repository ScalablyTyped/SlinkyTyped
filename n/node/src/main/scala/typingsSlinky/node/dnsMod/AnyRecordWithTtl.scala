package typingsSlinky.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use AnyARecord or AnyAaaaRecord instead. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.dnsMod.AnyARecord
  - typingsSlinky.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends js.Object

object AnyRecordWithTtl {
  @scala.inline
  implicit def apply(value: AnyARecord): AnyRecordWithTtl = value.asInstanceOf[AnyRecordWithTtl]
  @scala.inline
  implicit def apply(value: AnyAaaaRecord): AnyRecordWithTtl = value.asInstanceOf[AnyRecordWithTtl]
}

