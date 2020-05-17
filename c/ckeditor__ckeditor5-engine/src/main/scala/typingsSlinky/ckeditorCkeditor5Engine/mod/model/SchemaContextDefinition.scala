package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.Node
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.SchemaContext
  - java.lang.String
  - js.Array[java.lang.String | typingsSlinky.ckeditorCkeditor5Engine.mod.model.Node]
*/
trait SchemaContextDefinition extends js.Object

object SchemaContextDefinition {
  @scala.inline
  implicit def apply(value: js.Array[String | Node]): SchemaContextDefinition = value.asInstanceOf[SchemaContextDefinition]
  @scala.inline
  implicit def apply(value: Node): SchemaContextDefinition = value.asInstanceOf[SchemaContextDefinition]
  @scala.inline
  implicit def apply(value: Position): SchemaContextDefinition = value.asInstanceOf[SchemaContextDefinition]
  @scala.inline
  implicit def apply(value: SchemaContext): SchemaContextDefinition = value.asInstanceOf[SchemaContextDefinition]
  @scala.inline
  implicit def apply(value: String): SchemaContextDefinition = value.asInstanceOf[SchemaContextDefinition]
}

