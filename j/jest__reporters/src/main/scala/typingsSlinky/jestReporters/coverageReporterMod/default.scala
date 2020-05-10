package typingsSlinky.jestReporters.coverageReporterMod

import typingsSlinky.jestReporters.typesMod.CoverageReporterOptions
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Default)
@js.native
class default protected () extends CoverageReporter {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
}

