package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInflate extends js.Object {
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.native
  var proto: js.UndefOr[js.Any] = js.native
}

object AnonInflate {
  @scala.inline
  def apply(): AnonInflate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInflate]
  }
  @scala.inline
  implicit class AnonInflateOps[Self <: AnonInflate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInflate(value: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.undefined)
        ret
    }
    @scala.inline
    def withProto(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(js.undefined)
        ret
    }
  }
  
}

