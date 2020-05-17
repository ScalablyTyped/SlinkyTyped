package typingsSlinky.mobx.observableobjectMod

import typingsSlinky.mobx.anon.NameObject
import typingsSlinky.mobx.anon.OldValue
import typingsSlinky.mobx.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.anon.Type
  - typingsSlinky.mobx.anon.OldValue
  - typingsSlinky.mobx.anon.NameObject
*/
trait IObjectDidChange extends js.Object

object IObjectDidChange {
  @scala.inline
  implicit def apply(value: NameObject): IObjectDidChange = value.asInstanceOf[IObjectDidChange]
  @scala.inline
  implicit def apply(value: OldValue): IObjectDidChange = value.asInstanceOf[IObjectDidChange]
  @scala.inline
  implicit def apply(value: Type): IObjectDidChange = value.asInstanceOf[IObjectDidChange]
}

