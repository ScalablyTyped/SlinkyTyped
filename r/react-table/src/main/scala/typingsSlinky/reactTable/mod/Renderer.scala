package typingsSlinky.reactTable.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentType[Props]
  - typingsSlinky.react.mod.ReactElement
  - typingsSlinky.react.mod.ReactText
  - typingsSlinky.react.mod.ReactFragment
*/
trait Renderer[Props] extends js.Object

object Renderer {
  @scala.inline
  implicit def apply[Props](value: ReactComponentClass[Props]): Renderer[Props] = value.asInstanceOf[Renderer[Props]]
  @scala.inline
  implicit def apply[Props](value: ReactElement): Renderer[Props] = value.asInstanceOf[Renderer[Props]]
  @scala.inline
  implicit def apply[Props](value: ReactFragment): Renderer[Props] = value.asInstanceOf[Renderer[Props]]
  @scala.inline
  implicit def apply[Props](value: ReactText): Renderer[Props] = value.asInstanceOf[Renderer[Props]]
}

