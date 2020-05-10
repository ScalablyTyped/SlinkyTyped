package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiBucket
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon8[T] extends js.Object {
  def failure(bucket: KiiBucket, anErrorString: String): js.Any = js.native
  def success(queryPerformed: KiiQuery, resultSet: js.Array[T], nextQuery: KiiQuery): js.Any = js.native
}

object Anon8 {
  @scala.inline
  def apply[T](failure: (KiiBucket, String) => js.Any, success: (KiiQuery, js.Array[T], KiiQuery) => js.Any): Anon8[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon8[T]]
  }
  @scala.inline
  implicit class Anon8Ops[Self[t] <: Anon8[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFailure(value: (KiiBucket, String) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiQuery, js.Array[T], KiiQuery) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

