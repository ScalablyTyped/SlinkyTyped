package typingsSlinky.redom.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Node
  - typingsSlinky.redom.mod.RedomComponentCreator
*/
trait RedomElQuery extends js.Object

object RedomElQuery {
  @scala.inline
  implicit def apply(value: Node): RedomElQuery = value.asInstanceOf[RedomElQuery]
  @scala.inline
  implicit def apply(value: RedomComponentCreator): RedomElQuery = value.asInstanceOf[RedomElQuery]
  @scala.inline
  implicit def apply(value: String): RedomElQuery = value.asInstanceOf[RedomElQuery]
}

