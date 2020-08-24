package typingsSlinky.fastGlob.matcherMod

import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/matchers/matcher", JSImport.Default)
@js.native
abstract class default protected () extends Matcher {
  def this(
    _patterns: js.Array[Pattern],
    _settings: typingsSlinky.fastGlob.settingsMod.default,
    _micromatchOptions: MicromatchOptions
  ) = this()
}

