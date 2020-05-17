package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boundary extends js.Object {
  def get(name: String, callback: js.Function1[/* result */ js.Array[String], Unit]): Unit = js.native
}

object Boundary {
  @scala.inline
  def apply(get: (String, js.Function1[/* result */ js.Array[String], Unit]) => Unit): Boundary = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Boundary]
  }
  @scala.inline
  implicit class BoundaryOps[Self <: Boundary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, js.Function1[/* result */ js.Array[String], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

