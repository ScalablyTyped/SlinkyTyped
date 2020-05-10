package typingsSlinky.jestJasmine2.queueRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any = js.native
  var queueableFns: js.Array[QueueableFn] = js.native
  var setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any = js.native
  var userContext: js.Any = js.native
  def fail(error: js.Error): Unit = js.native
  def onException(error: js.Error): Unit = js.native
}

object Options {
  @scala.inline
  def apply(
    clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any,
    fail: js.Error => Unit,
    onException: js.Error => Unit,
    queueableFns: js.Array[QueueableFn],
    setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any,
    userContext: js.Any
  ): Options = {
    val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), onException = js.Any.fromFunction1(onException), queueableFns = queueableFns.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], userContext = userContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTimeout(
      value: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFail(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnException(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueueableFns(value: js.Array[QueueableFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueableFns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTimeout(
      value: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

