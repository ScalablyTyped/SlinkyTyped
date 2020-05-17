package typingsSlinky.postcss.mod

import typingsSlinky.postcss.anon.Postcss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.postcss.mod.Plugin_[js.Any]
  - typingsSlinky.postcss.mod.Transformer
  - typingsSlinky.postcss.anon.Postcss
  - typingsSlinky.postcss.mod.Processor
*/
trait AcceptedPlugin extends js.Object

object AcceptedPlugin {
  @scala.inline
  implicit def apply(value: Plugin_[js.Any]): AcceptedPlugin = value.asInstanceOf[AcceptedPlugin]
  @scala.inline
  implicit def apply(value: Postcss): AcceptedPlugin = value.asInstanceOf[AcceptedPlugin]
  @scala.inline
  implicit def apply(value: Processor): AcceptedPlugin = value.asInstanceOf[AcceptedPlugin]
  @scala.inline
  implicit def apply(value: Transformer): AcceptedPlugin = value.asInstanceOf[AcceptedPlugin]
}

