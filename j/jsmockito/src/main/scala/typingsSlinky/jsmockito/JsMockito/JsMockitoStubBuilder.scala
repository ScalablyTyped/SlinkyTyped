package typingsSlinky.jsmockito.JsMockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsMockitoStubBuilder extends js.Object {
  /**
    * Provide functions to be run in place of the mocked method.
    *
    * @param func Functions to be run in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def `then`(func: (js.Function1[/* obj */ js.Any, _])*): JsMockitoStubBuilder = js.native
  /**
    * Provide values to be returned by the mocked function.
    *
    * @param obj Values to be returned in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenReturn(obj: js.Any*): JsMockitoStubBuilder = js.native
  /**
    * Provide exceptions to be thrown by the mocked function.
    *
    * @param obj Exceptions to be thrown in order of execution.
    * @return {JsMockitoStubBuilder} Itself for method chaining
    */
  def thenThrow(obj: js.Error*): JsMockitoStubBuilder = js.native
}

object JsMockitoStubBuilder {
  @scala.inline
  def apply(
    `then`: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder,
    thenReturn: /* repeated */ js.Any => JsMockitoStubBuilder,
    thenThrow: /* repeated */ js.Error => JsMockitoStubBuilder
  ): JsMockitoStubBuilder = {
    val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[JsMockitoStubBuilder]
  }
  @scala.inline
  implicit class JsMockitoStubBuilderOps[Self <: JsMockitoStubBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThen(value: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenReturn(value: /* repeated */ js.Any => JsMockitoStubBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenReturn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenThrow(value: /* repeated */ js.Error => JsMockitoStubBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenThrow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

