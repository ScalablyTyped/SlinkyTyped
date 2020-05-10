package typingsSlinky.nedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewDoc[T /* <: G */, G] extends js.Object {
  var newDoc: T = js.native
  var oldDoc: T = js.native
}

object AnonNewDoc {
  @scala.inline
  def apply[T, G](newDoc: T, oldDoc: T): AnonNewDoc[T, G] = {
    val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewDoc[T, G]]
  }
  @scala.inline
  implicit class AnonNewDocOps[Self[t, g] <: AnonNewDoc[t, g], T, G] (val x: Self[T, G]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, G] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, G]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, G]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, G]) with Other]
    @scala.inline
    def withNewDoc(value: T): Self[T, G] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldDoc(value: T): Self[T, G] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldDoc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

