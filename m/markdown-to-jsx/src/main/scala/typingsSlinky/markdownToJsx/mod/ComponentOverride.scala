package typingsSlinky.markdownToJsx.mod

import typingsSlinky.markdownToJsx.anon.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.ComponentClass[P, S]
  - typingsSlinky.react.mod.SFC[P]
  - typingsSlinky.markdownToJsx.anon.Component[P, S]
*/
trait ComponentOverride[P, S] extends js.Object

object ComponentOverride {
  @scala.inline
  implicit def apply[P, S](value: Component[P, S]): ComponentOverride[P, S] = value.asInstanceOf[ComponentOverride[P, S]]
  @scala.inline
  implicit def apply[P, S](value: ComponentClass[P, S]): ComponentOverride[P, S] = value.asInstanceOf[ComponentOverride[P, S]]
  @scala.inline
  implicit def apply[P, S](value: SFC[P]): ComponentOverride[P, S] = value.asInstanceOf[ComponentOverride[P, S]]
  @scala.inline
  implicit def apply[P, S](value: String): ComponentOverride[P, S] = value.asInstanceOf[ComponentOverride[P, S]]
}

