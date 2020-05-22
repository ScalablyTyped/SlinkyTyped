package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.joi.mod._SchemaLike because Already inherited
- typingsSlinky.joi.mod._Schema because Already inherited */ @js.native
trait AlternativesSchema extends AnySchema {
  def `try`(types: SchemaLike*): this.type = js.native
  def `try`(types: js.Array[SchemaLike]): this.type = js.native
}

