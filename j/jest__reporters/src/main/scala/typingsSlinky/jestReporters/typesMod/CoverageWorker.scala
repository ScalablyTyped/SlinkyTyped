package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestReporters.coverageWorkerMod.CoverageWorkerData
import typingsSlinky.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageWorker extends js.Object {
  
  def worker(hasConfigGlobalConfigPathOptions: CoverageWorkerData): CoverageWorkerResult | Null = js.native
  @JSName("worker")
  var worker_Original: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ] = js.native
}
