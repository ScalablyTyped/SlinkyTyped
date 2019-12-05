package typingsSlinky.atJestTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.atJestTransform.Anon_ChangedFiles
  import typingsSlinky.atJestTransform.Anon_IsCoreModule
  import typingsSlinky.atJestTransform.atJestTransformStrings.collectCoverage
  import typingsSlinky.atJestTransform.atJestTransformStrings.collectCoverageFrom
  import typingsSlinky.atJestTransform.atJestTransformStrings.collectCoverageOnlyFrom
  import typingsSlinky.atJestTransform.atJestTransformStrings.extraGlobals
  import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Options = ShouldInstrumentOptions with (Pick[GlobalConfig, extraGlobals]) with Anon_IsCoreModule
  type ShouldInstrumentOptions = (Pick[GlobalConfig, collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom]) with Anon_ChangedFiles
}
