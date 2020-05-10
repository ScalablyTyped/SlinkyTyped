package typingsSlinky.blueprintjsCore.compareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyWhitelist[T] extends js.Object {
  var include: js.Array[/* keyof T */ String] = js.native
}

object IKeyWhitelist {
  @scala.inline
  def apply[T](include: js.Array[/* keyof T */ String]): IKeyWhitelist[T] = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyWhitelist[T]]
  }
  @scala.inline
  implicit class IKeyWhitelistOps[Self[t] <: IKeyWhitelist[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInclude(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

