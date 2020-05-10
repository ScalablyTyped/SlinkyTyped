package typingsSlinky.mochaccino.mod

import typingsSlinky.mochaccino.mochaccinoBooleans.`true`
import typingsSlinky.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpyProxy extends js.Object {
  var and: SpyProxy = js.native
  var spyProxy: `true` = js.native
  def callFake(fake: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def callThrough(): Unit = js.native
  def getSubject(): SinonStub = js.native
  def returnValue(obj: js.Any): Unit = js.native
}

object SpyProxy {
  @scala.inline
  def apply(
    and: SpyProxy,
    callFake: js.Function1[/* repeated */ js.Any, _] => Unit,
    callThrough: () => Unit,
    getSubject: () => SinonStub,
    returnValue: js.Any => Unit,
    spyProxy: `true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), getSubject = js.Any.fromFunction0(getSubject), returnValue = js.Any.fromFunction1(returnValue), spyProxy = spyProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpyProxy]
  }
  @scala.inline
  implicit class SpyProxyOps[Self <: SpyProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: SpyProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallFake(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFake")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCallThrough(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callThrough")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => SinonStub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReturnValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpyProxy(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spyProxy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

