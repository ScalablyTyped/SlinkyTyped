package typingsSlinky.fastGlob.patternMod

import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/pattern", "makeRe")
@js.native
object makeRe extends js.Object {
  def apply(pattern: Pattern, options: MicromatchOptions): js.RegExp = js.native
}

