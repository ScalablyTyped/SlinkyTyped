package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.anon.Data
import typingsSlinky.rcFieldForm.anon.RelatedFields
import typingsSlinky.rcFieldForm.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typingsSlinky.rcFieldForm.anon.Type
  - typingsSlinky.rcFieldForm.anon.Data
  - typingsSlinky.rcFieldForm.anon.RelatedFields
*/
trait NotifyInfo extends js.Object

object NotifyInfo {
  @scala.inline
  implicit def apply(value: Data): NotifyInfo = value.asInstanceOf[NotifyInfo]
  @scala.inline
  implicit def apply(value: RelatedFields): NotifyInfo = value.asInstanceOf[NotifyInfo]
  @scala.inline
  implicit def apply(value: Type): NotifyInfo = value.asInstanceOf[NotifyInfo]
  @scala.inline
  implicit def apply(value: ValueUpdateInfo): NotifyInfo = value.asInstanceOf[NotifyInfo]
}

