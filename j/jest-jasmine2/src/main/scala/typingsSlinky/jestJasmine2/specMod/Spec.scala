package typingsSlinky.jestJasmine2.specMod

import typingsSlinky.jestJasmine2.anon.Afters
import typingsSlinky.jestJasmine2.anon.Cancel
import typingsSlinky.jestJasmine2.jestJasmine2Strings.disabled
import typingsSlinky.jestJasmine2.jestJasmine2Strings.failed
import typingsSlinky.jestJasmine2.jestJasmine2Strings.passed
import typingsSlinky.jestJasmine2.jestJasmine2Strings.pending
import typingsSlinky.jestJasmine2.jestJasmine2Strings.todo
import typingsSlinky.jestJasmine2.queueRunnerMod.Options
import typingsSlinky.jestJasmine2.queueRunnerMod.QueueableFn
import typingsSlinky.jestJasmine2.typesMod.AssertionErrorWithStack
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var currentRun: js.UndefOr[ReturnType[js.Function1[/* options */ Options, Cancel]]] = js.native
  var description: String = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var initError: js.Error = js.native
  var markedPending: js.UndefOr[Boolean] = js.native
  var markedTodo: js.UndefOr[Boolean] = js.native
  var queueRunnerFactory: js.Function1[/* options */ Options, Cancel] = js.native
  var queueableFn: QueueableFn = js.native
  var result: SpecResult = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addExpectationResult(passed: Boolean, data: typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options): Unit = js.native
  def addExpectationResult(
    passed: Boolean,
    data: typingsSlinky.jestJasmine2.expectationResultFactoryMod.Options,
    isError: Boolean
  ): Unit = js.native
  def beforeAndAfterFns(): Afters = js.native
  def cancel(): Unit = js.native
  def disable(): Unit = js.native
  def execute(onComplete: js.Function, enabled: Boolean): Unit = js.native
  def getFullName(): String = js.native
  def getResult(): SpecResult = js.native
  def getSpecName(spec: Spec): String = js.native
  def isAssertionError(error: js.Error): Boolean = js.native
  def isExecutable(): Boolean = js.native
  def onException(error: typingsSlinky.jestJasmine2.expectationFailedMod.default): Unit = js.native
  def onException(error: AssertionErrorWithStack): Unit = js.native
  def onStart(spec: Spec): Unit = js.native
  def pend(): Unit = js.native
  def pend(message: String): Unit = js.native
  def resultCallback(result: SpecResult): Unit = js.native
  def status(): disabled | pending | failed | passed | todo = js.native
  def status(enabled: Boolean): disabled | pending | failed | passed | todo = js.native
  def todo(): Unit = js.native
  def userContext(): js.Any = js.native
}

