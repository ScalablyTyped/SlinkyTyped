package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Err extends js.Object {
  var err: js.Array[js.Error] | Null = js.native
  var keys: js.Array[typingsSlinky.openpgp.mod.key.Key] = js.native
}

object Err {
  @scala.inline
  def apply(keys: js.Array[typingsSlinky.openpgp.mod.key.Key]): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  @scala.inline
  implicit class ErrOps[Self <: Err] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[typingsSlinky.openpgp.mod.key.Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErr(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(null)
        ret
    }
  }
  
}

