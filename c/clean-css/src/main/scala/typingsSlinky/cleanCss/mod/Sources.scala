package typingsSlinky.cleanCss.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Union of all types acceptable as input for the minify function
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typingsSlinky.cleanCss.mod.Source | java.lang.String]
  - typingsSlinky.cleanCss.mod.Source
  - typingsSlinky.node.Buffer
*/
trait Sources extends js.Object

object Sources {
  @scala.inline
  implicit def apply(value: js.Array[Source | String]): Sources = value.asInstanceOf[Sources]
  @scala.inline
  implicit def apply(value: Buffer): Sources = value.asInstanceOf[Sources]
  @scala.inline
  implicit def apply(value: Source): Sources = value.asInstanceOf[Sources]
  @scala.inline
  implicit def apply(value: String): Sources = value.asInstanceOf[Sources]
}

