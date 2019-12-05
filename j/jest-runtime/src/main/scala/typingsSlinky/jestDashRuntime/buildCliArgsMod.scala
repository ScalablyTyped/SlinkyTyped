package typingsSlinky.jestDashRuntime

import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.`Usage: DOLLAR0 [--config=<pathToConfigFile>] <file>`
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.cache
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.config
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.debug
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.version
import typingsSlinky.jestDashRuntime.jestDashRuntimeStrings.watchman
import typingsSlinky.std.Record
import typingsSlinky.yargs.yargsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime/build/cli/args", JSImport.Namespace)
@js.native
object buildCliArgsMod extends js.Object {
  val options: Record[cache | config | debug | version | watchman, Options] = js.native
  val usage: `Usage: DOLLAR0 [--config=<pathToConfigFile>] <file>` = js.native
}

