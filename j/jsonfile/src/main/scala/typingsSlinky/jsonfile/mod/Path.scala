package typingsSlinky.jsonfile.mod

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.fsMod.PathLike
  - typingsSlinky.node.urlMod.Url
*/
trait Path extends js.Object

object Path {
  @scala.inline
  implicit def apply(value: PathLike): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: Url): Path = value.asInstanceOf[Path]
}

