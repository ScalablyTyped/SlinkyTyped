package typingsSlinky.atJestCore

import typingsSlinky.atJestCore.atJestCoreStrings.bail
import typingsSlinky.atJestCore.atJestCoreStrings.changedSince
import typingsSlinky.atJestCore.atJestCoreStrings.collectCoverage
import typingsSlinky.atJestCore.atJestCoreStrings.collectCoverageFrom
import typingsSlinky.atJestCore.atJestCoreStrings.collectCoverageOnlyFrom
import typingsSlinky.atJestCore.atJestCoreStrings.coverageDirectory
import typingsSlinky.atJestCore.atJestCoreStrings.coverageReporters
import typingsSlinky.atJestCore.atJestCoreStrings.noSCM
import typingsSlinky.atJestCore.atJestCoreStrings.notify
import typingsSlinky.atJestCore.atJestCoreStrings.notifyMode
import typingsSlinky.atJestCore.atJestCoreStrings.onlyFailures
import typingsSlinky.atJestCore.atJestCoreStrings.passWithNoTests
import typingsSlinky.atJestCore.atJestCoreStrings.reporters
import typingsSlinky.atJestCore.atJestCoreStrings.testNamePattern
import typingsSlinky.atJestCore.atJestCoreStrings.testPathPattern
import typingsSlinky.atJestCore.atJestCoreStrings.updateSnapshot
import typingsSlinky.atJestCore.atJestCoreStrings.verbose
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/update_global_config", JSImport.Namespace)
@js.native
object buildLibUpdateUnderscoreGlobalUnderscoreConfigMod extends js.Object {
  def default(globalConfig: GlobalConfig): GlobalConfig = js.native
  def default(
    globalConfig: GlobalConfig,
    options: (Partial[
      (Pick[
        GlobalConfig, 
        bail | changedSince | collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom | coverageDirectory | coverageReporters | notify | notifyMode | onlyFailures | reporters | testNamePattern | testPathPattern | updateSnapshot | verbose
      ]) with Anon_Mode
    ]) with (Partial[Pick[GlobalConfig, noSCM | passWithNoTests]])
  ): GlobalConfig = js.native
}

