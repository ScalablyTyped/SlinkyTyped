package typingsSlinky.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.karma.mod.FactoryFnType
  - typingsSlinky.karma.mod.ConstructorFnType
  - typingsSlinky.karma.mod.ValueType
*/
trait InlinePluginType extends js.Object

object InlinePluginType {
  @scala.inline
  implicit def apply(value: ConstructorFnType | FactoryFnType | ValueType): InlinePluginType = value.asInstanceOf[InlinePluginType]
}

