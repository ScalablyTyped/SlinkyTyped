package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.TSQualifiedName
*/
trait TSEntityName extends js.Object

object TSEntityName {
  @scala.inline
  implicit def apply(value: Identifier_): TSEntityName = value.asInstanceOf[TSEntityName]
  @scala.inline
  implicit def apply(value: TSQualifiedName): TSEntityName = value.asInstanceOf[TSEntityName]
}

