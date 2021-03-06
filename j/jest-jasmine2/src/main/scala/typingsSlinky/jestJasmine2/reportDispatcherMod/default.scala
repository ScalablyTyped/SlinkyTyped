package typingsSlinky.jestJasmine2.reportDispatcherMod

import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteStarted
import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import typingsSlinky.jestJasmine2.typesMod.Reporter
import typingsSlinky.jestJasmine2.typesMod.RunDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/ReportDispatcher", JSImport.Default)
@js.native
class default protected () extends ReportDispatcher {
  def this(methods: js.Array[
        /* keyof jest-jasmine2.jest-jasmine2/build/types.Reporter */ jasmineDone | jasmineStarted | specDone | specStarted | suiteDone | suiteStarted
      ]) = this()
  /* CompleteClass */
  override def addReporter(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def clearReporters(): Unit = js.native
  /* CompleteClass */
  override def jasmineDone(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def jasmineStarted(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def provideFallbackReporter(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def specDone(result: SpecResult): Unit = js.native
  /* CompleteClass */
  override def specStarted(spec: SpecResult): Unit = js.native
  /* CompleteClass */
  override def suiteDone(result: SuiteResult): Unit = js.native
  /* CompleteClass */
  override def suiteStarted(result: SuiteResult): Unit = js.native
}

