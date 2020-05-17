package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.TSQualifiedName_
*/
trait TSEntityName extends Node

object TSEntityName {
  @scala.inline
  implicit def apply(value: Identifier_): TSEntityName = value.asInstanceOf[TSEntityName]
  @scala.inline
  implicit def apply(value: TSQualifiedName_): TSEntityName = value.asInstanceOf[TSEntityName]
}

