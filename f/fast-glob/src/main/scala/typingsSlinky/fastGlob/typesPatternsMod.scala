package typingsSlinky.fastGlob

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/types/patterns", JSImport.Namespace)
@js.native
object typesPatternsMod extends js.Object {
  type Pattern = String
  type PatternRe = js.RegExp
  type PatternsGroup = Record[String, js.Array[Pattern]]
}

