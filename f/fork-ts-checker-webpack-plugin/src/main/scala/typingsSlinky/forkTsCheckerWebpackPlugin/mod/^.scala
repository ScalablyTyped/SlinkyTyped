package typingsSlinky.forkTsCheckerWebpackPlugin.mod

import typingsSlinky.forkTsCheckerWebpackPlugin.PartialOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.RecordForkTsCheckerHooksa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ForkTsCheckerWebpackPlugin
  * Runs typescript type checker and linter (tslint) on separate process.
  * This speed-ups build a lot.
  *
  * Options description in README.md
  */
@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends ForkTsCheckerWebpackPlugin {
  def this(options: PartialOptions) = this()
}

@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ALL_CPUS: Double = js.native
  val DEFAULT_MEMORY_LIMIT: /* 2048 */ Double = js.native
  val ONE_CPU: /* 1 */ Double = js.native
  val ONE_CPU_FREE: Double = js.native
  val TWO_CPUS_FREE: Double = js.native
  var createFormatter: js.Any = js.native
  def getCompilerHooks(compiler: js.Any): RecordForkTsCheckerHooksa = js.native
}

