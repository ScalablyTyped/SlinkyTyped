package typingsSlinky.cosmiconfig.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cosmiconfig.typesMod.Config
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait LoadedFileContent extends js.Object

object LoadedFileContent {
  @scala.inline
  implicit def apply(value: Config): LoadedFileContent = value.asInstanceOf[LoadedFileContent]
  @scala.inline
  implicit def apply(value: Null): LoadedFileContent = value.asInstanceOf[LoadedFileContent]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => LoadedFileContent): LoadedFileContent = value.asInstanceOf[LoadedFileContent]
}

