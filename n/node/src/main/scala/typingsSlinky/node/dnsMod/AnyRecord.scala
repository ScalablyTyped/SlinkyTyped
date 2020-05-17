package typingsSlinky.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.dnsMod.AnyARecord
  - typingsSlinky.node.dnsMod.AnyAaaaRecord
  - typingsSlinky.node.dnsMod.AnyCnameRecord
  - typingsSlinky.node.dnsMod.AnyMxRecord
  - typingsSlinky.node.dnsMod.AnyNaptrRecord
  - typingsSlinky.node.dnsMod.AnyNsRecord
  - typingsSlinky.node.dnsMod.AnyPtrRecord
  - typingsSlinky.node.dnsMod.AnySoaRecord
  - typingsSlinky.node.dnsMod.AnySrvRecord
  - typingsSlinky.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends js.Object

object AnyRecord {
  @scala.inline
  implicit def apply(value: AnyARecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyAaaaRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyCnameRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyMxRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyNaptrRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyNsRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyPtrRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnySoaRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnySrvRecord): AnyRecord = value.asInstanceOf[AnyRecord]
  @scala.inline
  implicit def apply(value: AnyTxtRecord): AnyRecord = value.asInstanceOf[AnyRecord]
}

