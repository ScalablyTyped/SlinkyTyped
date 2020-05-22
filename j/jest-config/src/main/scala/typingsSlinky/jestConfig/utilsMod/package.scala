package typingsSlinky.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type JSONString = java.lang.String with js.Object
  type OrArray[T] = T | js.Array[T]
  type ReplaceRootDirConfigObj = typingsSlinky.std.Record[java.lang.String, typingsSlinky.jestTypes.configMod.Path]
  type ReplaceRootDirConfigValues = typingsSlinky.jestConfig.utilsMod.OrArray[
    typingsSlinky.jestTypes.configMod.Path | js.RegExp | typingsSlinky.jestConfig.utilsMod.ReplaceRootDirConfigObj
  ]
}
