package typingsSlinky.jestJasmine2.reporterMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/reporter", JSImport.Default)
@js.native
class default protected () extends Jasmine2Reporter {
  def this(globalConfig: GlobalConfig, config: ProjectConfig, testPath: Path) = this()
}

