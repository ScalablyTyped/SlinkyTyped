package typingsSlinky.detox.specReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineSpecReporter extends js.Object {
  def specDone(): Unit = js.native
  def specStarted(): Unit = js.native
  def suiteDone(): Unit = js.native
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def suiteStarted(): Unit = js.native
}

object JasmineSpecReporter {
  @scala.inline
  def apply(specDone: () => Unit, specStarted: () => Unit, suiteDone: () => Unit, suiteStarted: () => Unit): JasmineSpecReporter = {
    val __obj = js.Dynamic.literal(specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted), suiteDone = js.Any.fromFunction0(suiteDone), suiteStarted = js.Any.fromFunction0(suiteStarted))
    __obj.asInstanceOf[JasmineSpecReporter]
  }
  @scala.inline
  implicit class JasmineSpecReporterOps[Self <: JasmineSpecReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpecStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSuiteDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSuiteStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteStarted")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

