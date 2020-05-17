package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `24`[T] extends js.Object {
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any = js.native
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any = js.native
}

object `24` {
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any
  ): `24`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`24`[T]]
  }
  @scala.inline
  implicit class `24Ops`[Self[t] <: `24`[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFailure(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

