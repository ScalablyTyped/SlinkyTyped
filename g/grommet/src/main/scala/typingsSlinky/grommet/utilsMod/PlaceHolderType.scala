package typingsSlinky.grommet.utilsMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.global.JSX.Element
  - typingsSlinky.react.mod.ReactNode
*/
trait PlaceHolderType extends js.Object

object PlaceHolderType {
  @scala.inline
  implicit def apply(value: ReactElement): PlaceHolderType = value.asInstanceOf[PlaceHolderType]
  @scala.inline
  implicit def apply(value: TagMod[Any]): PlaceHolderType = value.asInstanceOf[PlaceHolderType]
  @scala.inline
  implicit def apply(value: String): PlaceHolderType = value.asInstanceOf[PlaceHolderType]
}

