package typingsSlinky.draftConvert.mod

import slinky.core.TagMod
import typingsSlinky.draftConvert.anon.Element
import typingsSlinky.draftConvert.anon.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - typingsSlinky.draftConvert.anon.Empty
  - typingsSlinky.draftConvert.anon.Element
*/
trait Tag extends js.Object

object Tag {
  @scala.inline
  implicit def apply(value: Element): Tag = value.asInstanceOf[Tag]
  @scala.inline
  implicit def apply(value: Empty): Tag = value.asInstanceOf[Tag]
  @scala.inline
  implicit def apply(value: TagMod[Any]): Tag = value.asInstanceOf[Tag]
}

