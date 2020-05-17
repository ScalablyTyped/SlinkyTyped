package typingsSlinky.reactRelay.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[TOperation /* <: OperationType */] extends js.Object {
  var error: js.Error | Null = js.native
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null = js.native
  var retry: js.Function0[Unit] | Null = js.native
}

object Error {
  @scala.inline
  def apply[TOperation](): Error[TOperation] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error[TOperation]]
  }
  @scala.inline
  implicit class ErrorOps[Self[toperation] <: Error[toperation], TOperation] (val x: Self[TOperation]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOperation] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOperation]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOperation] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOperation] with Other]
    @scala.inline
    def withError(value: js.Error): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
    @scala.inline
    def withProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropsNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(null)
        ret
    }
    @scala.inline
    def withRetry(value: () => Unit): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetryNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(null)
        ret
    }
  }
  
}

