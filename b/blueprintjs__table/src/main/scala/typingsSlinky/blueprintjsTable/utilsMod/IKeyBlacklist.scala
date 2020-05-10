package typingsSlinky.blueprintjsTable.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyBlacklist[T] extends js.Object {
  var exclude: js.Array[/* keyof T */ String] = js.native
}

object IKeyBlacklist {
  @scala.inline
  def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyBlacklist[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBlacklist[T]]
  }
  @scala.inline
  implicit class IKeyBlacklistOps[Self[t] <: IKeyBlacklist[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExclude(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

