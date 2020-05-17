package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.riotjsDomBindings.mod.IfBindingData
  - typingsSlinky.riotjsDomBindings.mod.EachBindingData
  - typingsSlinky.riotjsDomBindings.mod.SimpleBindingData
  - typingsSlinky.riotjsDomBindings.mod.SlotBindingData
  - typingsSlinky.riotjsDomBindings.mod.TagBindingData
*/
trait BindingData extends js.Object

object BindingData {
  @scala.inline
  implicit def apply(value: EachBindingData): BindingData = value.asInstanceOf[BindingData]
  @scala.inline
  implicit def apply(value: IfBindingData): BindingData = value.asInstanceOf[BindingData]
  @scala.inline
  implicit def apply(value: SimpleBindingData): BindingData = value.asInstanceOf[BindingData]
  @scala.inline
  implicit def apply(value: SlotBindingData): BindingData = value.asInstanceOf[BindingData]
  @scala.inline
  implicit def apply(value: TagBindingData): BindingData = value.asInstanceOf[BindingData]
}

