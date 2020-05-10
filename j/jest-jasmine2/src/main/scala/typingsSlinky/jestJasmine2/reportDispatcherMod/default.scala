package typingsSlinky.jestJasmine2.reportDispatcherMod

import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.jasmineStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.specStarted
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteDone
import typingsSlinky.jestJasmine2.jestJasmine2Strings.suiteStarted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/ReportDispatcher", JSImport.Default)
@js.native
class default protected () extends ReportDispatcher {
  def this(methods: js.Array[
        /* keyof jest-jasmine2.jest-jasmine2/build/types.Reporter */ jasmineDone | jasmineStarted | specDone | specStarted | suiteDone | suiteStarted
      ]) = this()
}

