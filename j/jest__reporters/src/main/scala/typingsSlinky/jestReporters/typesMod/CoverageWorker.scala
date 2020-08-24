package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestReporters.coverageWorkerMod.CoverageWorkerData
import typingsSlinky.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageWorker extends js.Object {
  @JSName("worker")
  var worker_Original: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ] = js.native
  def worker(hasConfigGlobalConfigPathOptions: CoverageWorkerData): CoverageWorkerResult | Null = js.native
}

