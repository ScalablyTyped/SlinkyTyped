package typingsSlinky.redom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.redom.mod.RedomComponentConstructor
  - typingsSlinky.redom.mod.RedomComponentFactoryFunction
*/
trait RedomComponentCreator extends RedomElQuery

object RedomComponentCreator {
  @scala.inline
  implicit def apply(value: RedomComponentConstructor): RedomComponentCreator = value.asInstanceOf[RedomComponentCreator]
  @scala.inline
  implicit def apply(value: RedomComponentFactoryFunction): RedomComponentCreator = value.asInstanceOf[RedomComponentCreator]
}

