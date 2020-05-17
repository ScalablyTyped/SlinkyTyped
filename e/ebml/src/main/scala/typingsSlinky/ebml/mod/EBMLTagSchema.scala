package typingsSlinky.ebml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ebml.mod.EBMLTagSchemaBase
  - typingsSlinky.ebml.mod.EBMLNumericTagSchema
  - typingsSlinky.ebml.mod.EBMLStringValueTagSchema
  - typingsSlinky.ebml.mod.EBMLBinaryTagSchema
*/
trait EBMLTagSchema extends js.Object

object EBMLTagSchema {
  @scala.inline
  implicit def apply(value: EBMLBinaryTagSchema): EBMLTagSchema = value.asInstanceOf[EBMLTagSchema]
  @scala.inline
  implicit def apply(value: EBMLNumericTagSchema): EBMLTagSchema = value.asInstanceOf[EBMLTagSchema]
  @scala.inline
  implicit def apply(value: EBMLStringValueTagSchema): EBMLTagSchema = value.asInstanceOf[EBMLTagSchema]
  @scala.inline
  implicit def apply(value: EBMLTagSchemaBase): EBMLTagSchema = value.asInstanceOf[EBMLTagSchema]
}

