package typingsSlinky.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JavaObject extends js.Object {
  var hash: js.Any = js.native
  def equals(o: js.Any): Boolean = js.native
}

object JavaObject {
  @scala.inline
  def apply(equals: js.Any => Boolean, hash: js.Any): JavaObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavaObject]
  }
  @scala.inline
  implicit class JavaObjectOps[Self <: JavaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

