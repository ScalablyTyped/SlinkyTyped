package typingsSlinky.gulpResponsiveImages.mod

import typingsSlinky.gulpRename.mod.Options
import typingsSlinky.gulpRename.mod.ParsedPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * path * / typingsSlinky.gulpRename.mod.ParsedPath, js.Any]
  - typingsSlinky.gulpRename.mod.Options
*/
trait Rename extends js.Object

object Rename {
  @scala.inline
  implicit def apply(value: js.Function1[/* path */ ParsedPath, js.Any]): Rename = value.asInstanceOf[Rename]
  @scala.inline
  implicit def apply(value: Options): Rename = value.asInstanceOf[Rename]
  @scala.inline
  implicit def apply(value: String): Rename = value.asInstanceOf[Rename]
}

