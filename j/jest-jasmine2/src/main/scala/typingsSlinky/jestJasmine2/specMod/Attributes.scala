package typingsSlinky.jestJasmine2.specMod

import typingsSlinky.jestJasmine2.anon.Afters
import typingsSlinky.jestJasmine2.anon.Cancel
import typingsSlinky.jestJasmine2.queueRunnerMod.Options
import typingsSlinky.jestJasmine2.queueRunnerMod.QueueableFn
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var description: String = js.native
  var id: String = js.native
  var queueRunnerFactory: js.Function1[/* options */ Options, Cancel] = js.native
  var queueableFn: QueueableFn = js.native
  var throwOnExpectationFailure: js.Any = js.native
  def beforeAndAfterFns(): Afters = js.native
  def getSpecName(spec: Spec): String = js.native
  def getTestPath(): Path = js.native
  def onStart(context: Spec): Unit = js.native
  def resultCallback(result: SpecResult): Unit = js.native
  def userContext(): js.Any = js.native
}

object Attributes {
  @scala.inline
  def apply(
    beforeAndAfterFns: () => Afters,
    description: String,
    getSpecName: Spec => String,
    getTestPath: () => Path,
    id: String,
    onStart: Spec => Unit,
    queueRunnerFactory: /* options */ Options => Cancel,
    queueableFn: QueueableFn,
    resultCallback: SpecResult => Unit,
    throwOnExpectationFailure: js.Any,
    userContext: () => js.Any
  ): Attributes = {
    val __obj = js.Dynamic.literal(beforeAndAfterFns = js.Any.fromFunction0(beforeAndAfterFns), description = description.asInstanceOf[js.Any], getSpecName = js.Any.fromFunction1(getSpecName), getTestPath = js.Any.fromFunction0(getTestPath), id = id.asInstanceOf[js.Any], onStart = js.Any.fromFunction1(onStart), queueRunnerFactory = js.Any.fromFunction1(queueRunnerFactory), queueableFn = queueableFn.asInstanceOf[js.Any], resultCallback = js.Any.fromFunction1(resultCallback), throwOnExpectationFailure = throwOnExpectationFailure.asInstanceOf[js.Any], userContext = js.Any.fromFunction0(userContext))
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeAndAfterFns(value: () => Afters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAndAfterFns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSpecName(value: Spec => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpecName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTestPath(value: () => Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTestPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStart(value: Spec => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueueRunnerFactory(value: /* options */ Options => Cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueRunnerFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueueableFn(value: QueueableFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueableFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCallback(value: SpecResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThrowOnExpectationFailure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnExpectationFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userContext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

