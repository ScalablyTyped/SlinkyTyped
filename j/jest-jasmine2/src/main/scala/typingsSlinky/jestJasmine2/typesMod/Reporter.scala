package typingsSlinky.jestJasmine2.typesMod

import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def jasmineDone(runDetails: RunDetails): Unit = js.native
  def jasmineStarted(runDetails: RunDetails): Unit = js.native
  def specDone(result: SpecResult): Unit = js.native
  def specStarted(spec: SpecResult): Unit = js.native
  def suiteDone(result: SuiteResult): Unit = js.native
  def suiteStarted(result: SuiteResult): Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJasmineDone(value: RunDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJasmineStarted(value: RunDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpecDone(value: SpecResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpecStarted(value: SpecResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuiteDone(value: SuiteResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuiteStarted(value: SuiteResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteStarted")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

