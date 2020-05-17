package typingsSlinky.node.fsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid types for path values in "fs".
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.urlMod.URL_
*/
trait PathLike extends js.Object

object PathLike {
  @scala.inline
  implicit def apply(value: Buffer): PathLike = value.asInstanceOf[PathLike]
  @scala.inline
  implicit def apply(value: String): PathLike = value.asInstanceOf[PathLike]
  @scala.inline
  implicit def apply(value: URL_): PathLike = value.asInstanceOf[PathLike]
}

