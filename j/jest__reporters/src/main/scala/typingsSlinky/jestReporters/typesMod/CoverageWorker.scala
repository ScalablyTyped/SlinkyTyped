package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestReporters.coverageWorkerMod.CoverageWorkerData
import typingsSlinky.jestReporters.generateEmptyCoverageMod.CoverageWorkerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageWorker extends js.Object {
  var worker: js.Function1[
    /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData, 
    CoverageWorkerResult | Null
  ] = js.native
}

object CoverageWorker {
  @scala.inline
  def apply(worker: /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData => CoverageWorkerResult | Null): CoverageWorker = {
    val __obj = js.Dynamic.literal(worker = js.Any.fromFunction1(worker))
    __obj.asInstanceOf[CoverageWorker]
  }
  @scala.inline
  implicit class CoverageWorkerOps[Self <: CoverageWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorker(value: /* hasConfigGlobalConfigPathOptions */ CoverageWorkerData => CoverageWorkerResult | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

