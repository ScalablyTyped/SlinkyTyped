package typingsSlinky.ionic.libStartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.libStartMod.NewAppSchema
  - typingsSlinky.ionic.libStartMod.ClonedAppSchema
*/
trait AppSchema extends js.Object

object AppSchema {
  @scala.inline
  implicit def apply(value: ClonedAppSchema): AppSchema = value.asInstanceOf[AppSchema]
  @scala.inline
  implicit def apply(value: NewAppSchema): AppSchema = value.asInstanceOf[AppSchema]
}

