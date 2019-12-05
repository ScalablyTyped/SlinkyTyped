package typingsSlinky.jestDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildUtilsMod {
  import typingsSlinky.atJestTypes.buildConfigMod.Path
  import typingsSlinky.std.Record

  type JSONString = String with js.Object
  type OrArray[T] = T | js.Array[T]
  type ReplaceRootDirConfigObj = Record[String, Path]
  type ReplaceRootDirConfigValues = OrArray[Path | js.RegExp | ReplaceRootDirConfigObj]
}
