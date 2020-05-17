package typingsSlinky.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.catalog.mod.ConfigPage
  - typingsSlinky.catalog.mod.ConfigPageGroup
*/
trait ConfigPageOrGroup extends js.Object

object ConfigPageOrGroup {
  @scala.inline
  implicit def apply(value: ConfigPage): ConfigPageOrGroup = value.asInstanceOf[ConfigPageOrGroup]
  @scala.inline
  implicit def apply(value: ConfigPageGroup): ConfigPageOrGroup = value.asInstanceOf[ConfigPageOrGroup]
}

